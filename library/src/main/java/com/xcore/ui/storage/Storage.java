package com.xcore.ui.storage;

import android.content.Context;

import com.xcore.ui.model.AlbumItem;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * 应用专属存储及旧版相册接口；所有 IO 均同步执行，请在工作线程调用。
 */
public class Storage {
    /**
     * 保存不可变的根目录快照，避免静态持有 Activity 或其他 Context。
     */
    private static volatile State state;

    private static final class State {
        final File root;

        State(File root) {
            this.root = root;
        }
    }

    /**
     * 仅释放初始化配置，不删除磁盘上的文件或缓存。
     */
    public static synchronized void clearCache() {
        state = null;
    }

    /**
     * 初始化或显式切换根目录；rootPath 相对于应用专属目录，不自动迁移旧文件。
     */
    public static synchronized void init(Context context, String rootPath) {
        Context application = context.getApplicationContext();
        if (application == null)
            throw new IllegalArgumentException("Application context unavailable");
        File root = new File(StorageUtil.getAppRootPath(application, rootPath));
        state = new State(root);
    }

    /**
     * 使用默认应用专属子目录初始化存储。
     */
    public static void init(Context context) {
        init(context, StorageUtil.DEFAULT_DIRECTORY);
    }

    /**
     * 无 Context 的入口必须先初始化，避免使用不确定的默认路径。
     */
    private static State requireState() {
        State snapshot = state;
        if (snapshot == null)
            throw new IllegalStateException("Call Storage.init(context, rootPath) first");
        return snapshot;
    }

    /**
     * 带 Context 的入口允许首次自动初始化，后续沿用已确定的根目录。
     */
    private static synchronized State ensureState(Context context) {
        if (state == null) init(context);
        return requireState();
    }

    /**
     * 使用初始化根目录，按扩展名创建 IMAGE、VIDEO 或 FILES 下的每日目录。
     */
    public static String getAlbumFolder(String format) {
        return albumFolder(requireState().root, format).getAbsolutePath();
    }

    /**
     * 使用已初始化根目录创建每日目录；尚未初始化时采用默认配置。
     */
    public static String getAlbumFolder(Context context, String format) {
        return albumFolder(ensureState(context).root, format).getAbsolutePath();
    }

    /**
     * 在显式指定根目录下创建每日目录，不改变全局初始化配置。
     */
    public static String getAlbumFolder(Context context, String rootPath, String format) {
        return albumFolder(new File(StorageUtil.getAppRootPath(context, rootPath)), format).getAbsolutePath();
    }

    /**
     * 按媒体扩展名分组，并按设备当前日期创建 yyyyMMdd 子目录。
     */
    private static File albumFolder(File root, String format) {
        String extension = StorageUtil.normalizeExtension(format);
        String category = FileTypes.isImage("file." + extension) ? "IMAGE"
                : FileTypes.isVideo("file." + extension) ? "VIDEO" : "FILES";
        String day = new SimpleDateFormat("yyyyMMdd", Locale.ROOT).format(new Date());
        try {
            return StorageFiles.ensureDirectory(StorageFiles.resolve(root, category + "/" + day));
        } catch (IOException e) {
            throw new StorageException("Cannot create daily storage directory", e);
        }
    }

    /**
     * 读取配置根目录下的相册列表，IO 失败转换为 StorageException。
     */
    public static ArrayList<AlbumItem> getAlbumItemList() {
        try {
            return listAlbum(requireState().root);
        } catch (IOException e) {
            throw new StorageException("Cannot read album", e);
        }
    }

    /**
     * 读取配置根目录下的录像列表，包含没有封面的视频。
     */
    public static ArrayList<AlbumItem> getRecordItemList() {
        try {
            return listRecordings(requireState().root);
        } catch (IOException e) {
            throw new StorageException("Cannot read recordings", e);
        }
    }

    /**
     * 递归扫描非空图片和视频，按修改时间倒序返回；未知扩展名不计入相册。
     */
    public static ArrayList<AlbumItem> listAlbum(File root) throws IOException {
        ArrayList<AlbumItem> items = new ArrayList<>();
        for (File file : StorageFiles.list(root, true)) {
            if (file.isFile() && file.length() > 0
                    && (FileTypes.isImage(file.getName()) || FileTypes.isVideo(file.getName()))) {
                items.add(item(file));
            }
        }
        sort(items);
        return items;
    }

    /**
     * 递归查找录像，只使用同目录且基础文件名完全一致的图片作为封面；无封面录像也会返回。
     */
    public static ArrayList<AlbumItem> listRecordings(File root) throws IOException {
        List<File> files = StorageFiles.list(root, true);
        Map<String, File> covers = new HashMap<>();
        for (File file : files) {
            if (file.isFile() && file.length() > 0 && FileTypes.isImage(file.getName())) {
                covers.putIfAbsent(mediaKey(file), file);
            }
        }
        ArrayList<AlbumItem> items = new ArrayList<>();
        for (File file : files) {
            if (!file.isFile() || file.length() == 0 || !FileTypes.isVideo(file.getName()))
                continue;
            File cover = covers.get(mediaKey(file));
            AlbumItem entry = item(cover == null ? file : cover);
            entry.video_path = file.getAbsolutePath();
            entry.setDate(new Date(file.lastModified()));
            items.add(entry);
        }
        sort(items);
        return items;
    }

    /**
     * 使用完整父目录与不含扩展名的文件名建立匹配键，防止跨目录误配封面。
     */
    private static String mediaKey(File file) {
        return new File(file.getParentFile(), FileTypes.baseName(file.getName())).getAbsolutePath();
    }

    private static AlbumItem item(File file) {
        AlbumItem item = new AlbumItem();
        item.setImage(FileTypes.isImage(file.getName()));
        item.setPath(file.getAbsolutePath());
        item.setFile_name(FileTypes.baseName(file.getName()));
        item.setSize(file.length());
        item.setDate(new Date(file.lastModified()));
        return item;
    }

    /**
     * 优先按修改时间倒序，同一时间按路径排序，保证结果稳定。
     */
    private static void sort(List<AlbumItem> items) {
        items.sort(Comparator.comparing(AlbumItem::getDate).reversed().thenComparing(AlbumItem::getPath));
    }

    /**
     * 解析相册相对路径或根目录内的绝对路径；拒绝根目录本身、越界路径和符号链接。
     */
    static File albumFile(File root, String name) throws IOException {
        if (name == null || name.isEmpty())
            throw new IllegalArgumentException("File name is required");
        File base = root.getCanonicalFile();
        String relative = name;
        if (new File(name).isAbsolute()) {
            String prefix = base.getPath() + File.separator;
            if (!name.startsWith(prefix))
                throw new IllegalArgumentException("File is outside storage root");
            relative = name.substring(prefix.length());
        }
        if (relative.isEmpty())
            throw new IllegalArgumentException("Expected file below storage root");
        return StorageFiles.resolve(base, relative);
    }

    /**
     * 在初始化根目录内解析路径，不创建文件；同时兼容根目录内的绝对路径。
     */
    public static File resolve(String relativePath) throws IOException {
        return albumFile(requireState().root, relativePath);
    }

    /**
     * 向根目录内的文件原子写入字节；父目录不存在时自动创建。
     */
    public static void write(String relativePath, byte[] data) throws IOException {
        StorageFiles.writeBytes(resolve(relativePath), data);
    }

    /**
     * 按指定字节上限读取根目录内的文件；不存在或超限时抛出 IOException。
     */
    public static byte[] read(String relativePath, int maxBytes) throws IOException {
        return StorageFiles.readBytes(resolve(relativePath), maxBytes);
    }

    /**
     * 删除根目录内的单个文件，不递归删除非空目录；删除失败通过 StorageException 报告。
     */
    public static void deleteAlbumFile(String path) {
        State snapshot = requireState();
        try {
            StorageFiles.delete(albumFile(snapshot.root, path), false);
        } catch (IOException e) {
            throw new StorageException("Cannot delete album file", e);
        }
    }

    /**
     * 读取原始文件字节，最大 16 MiB；空文件名或路径不存在时返回 null，读取失败抛出 StorageException。
     */
    public static byte[] readAlbumFile(String filename) {
        if (filename == null || filename.isEmpty()) return null;
        try {
            File file = resolve(filename);
            return file.exists() ? StorageFiles.readBytes(file, StorageFiles.DEFAULT_READ_LIMIT) : null;
        } catch (IOException e) {
            throw new StorageException("Cannot read album file", e);
        }
    }

    /**
     * 旧相册写入入口，保存原始字节，与 read_album_file 配套使用。
     */
    public static void writeAlbumFile(byte[] data, String filename) {
        try {
            write(filename, data);
        } catch (IOException e) {
            throw new StorageException("Cannot write album file", e);
        }
    }

    /**
     * 旧图片重命名入口，在原目录操作并保留扩展名，失败抛出 StorageException。
     */
    public static void renameAlbumFile(String oldFile, String filename) {
        rename(oldFile, filename, false);
    }

    /**
     * 旧录像重命名入口，不自动重命名配套封面，失败抛出 StorageException。
     */
    public static void renameRecordFile(String oldFile, String filename) {
        rename(oldFile, filename, true);
    }

    private static void rename(String oldFile, String filename, boolean video) {
        try {
            File source = resolve(oldFile);
            boolean renamed = video ? FileSystem.change_record_name(source.getPath(), filename)
                    : FileSystem.change_file_name(source.getPath(), filename);
            if (!renamed)
                throw new IOException("Source missing, invalid name, or destination already exists");
        } catch (IOException e) {
            throw new StorageException("Cannot rename album file", e);
        }
    }

    /**
     * 返回初始化根目录的绝对路径，未初始化时抛出 IllegalStateException。
     */
    public static String getDataPath() {
        return requireState().root.getAbsolutePath();
    }


}
