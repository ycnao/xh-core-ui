package com.xcore.ui.storage;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 旧文件接口兼容层；IO 错误通过 StorageException 报告，新代码可用 {@link StorageFiles} 处理受检异常。
 */
public class FileSystem {

    /**
     * 将目录的直接普通文件追加到列表；目录不存在时保持列表不变，不递归扫描。
     */
    public static void getFiles(ArrayList<File> fileList, String path) {
        File directory = new File(path);
        if (!directory.exists()) return;
        try {
            for (File file : StorageFiles.list(directory, false)) {
                if (file.isFile()) fileList.add(file);
            }
        } catch (IOException e) {
            throw new StorageException("Cannot list files: " + path, e);
        }
    }

    /**
     * 返回目录下的直接普通文件，按名称排列；目录不存在时返回空列表。
     */
    public static ArrayList<File> getFileList(String path) {
        ArrayList<File> files = new ArrayList<>();
        getFiles(files, path);
        return files;
    }

    /**
     * 旧版递归删除入口，拒绝空路径；IO 失败转换为 StorageException。
     */
    public static void delete(String fileName) {
        deletePath(fileName, true);
    }

    /**
     * 保留带 Context 的旧重载；按文件路径递归删除，不依赖该 Context。
     */
    public static void delete(String fileName, Context context) {
        delete(fileName);
    }

    /**
     * 删除单个文件，成功后按需通知媒体扫描；空文件名直接忽略。
     */
    public static void deleteFile(String fileName, Context context) {
        if (fileName == null || fileName.isEmpty()) return;
        if (deletePath(fileName, false) && context != null) {
            MediaScannerConnection.scanFile(context, new String[]{fileName}, null, null);
        }
    }

    private static boolean deletePath(String fileName, boolean recursive) {
        if (fileName == null || fileName.trim().isEmpty()) {
            throw new IllegalArgumentException("File path is required");
        }
        try {
            return StorageFiles.delete(new File(fileName), recursive);
        } catch (IOException e) {
            throw new StorageException("Cannot delete: " + fileName, e);
        }
    }

    /**
     * 递归创建目录；路径为空或目标无法创建时明确报告错误。
     */
    public static void mkdir(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Directory is required");
        try {
            StorageFiles.ensureDirectory(new File(name));
        } catch (IOException e) {
            throw new StorageException("Cannot create directory: " + name, e);
        }
    }

    /**
     * 检查路径是否存在，文件或目录都可；null 或空字符串返回 false。
     */
    public static boolean isExistFile(String name) {
        return name != null && !name.isEmpty() && new File(name).exists();
    }

    /**
     * 返回旧版外部存储路径描述，不代表调用方拥有共享存储访问权限。
     */
    @Deprecated
    public static String getExternalPath() {
        return Environment.getExternalStorageDirectory().getAbsolutePath();
    }

    /**
     * 原子写入可序列化对象；新文件格式建议优先使用字节或文本。
     */
    public static void write(Object obj, String fileName) {
        try {
            StorageFiles.writeAtomically(new File(fileName), output -> {
                ObjectOutputStream stream = new ObjectOutputStream(output);
                stream.writeObject(obj);
                stream.flush();
            });
        } catch (IOException e) {
            throw new StorageException("Cannot serialize file: " + fileName, e);
        }
    }

    /**
     * 兼容列表序列化写入，列表及元素必须满足 Java 序列化要求。
     */
    public static void write(List<Object> list, String fileName) {
        write((Object) list, fileName);
    }

    /**
     * 仅反序列化可信的应用自有数据，不可用于不可信外部文件；路径不存在时返回 null。
     */
    public static Object read(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) return null;
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(file))) {
            return input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new StorageException("Cannot deserialize file: " + fileName, e);
        }
    }

    /**
     * 用序列化列表替换调用方列表内容；路径不存在或读取值为 null 时保持原列表。
     */
    public static void read(List<Object> list, String fileName) {
        Object stored = read(fileName);
        if (stored == null) return;
        if (!(stored instanceof List<?>)) {
            throw new StorageException("Stored value is not a list: " + fileName, new IOException("Expected list"));
        }
        list.clear();
        list.addAll((List<?>) stored);
    }

    /**
     * 原子写入原始字节，不附加 Java 序列化头。
     */
    public static void write_file(byte[] data, String fileName) {
        try {
            StorageFiles.writeBytes(new File(fileName), data);
        } catch (IOException e) {
            throw new StorageException("Cannot write file: " + fileName, e);
        }
    }

    /**
     * 同目录重命名图片，保留实际扩展名；源无扩展名时使用 jpg，失败返回 false。
     */
    public static boolean change_file_name(String oldFile, String fileName) {
        return renameMedia(oldFile, fileName, "jpg");
    }

    /**
     * 同目录重命名录像，保留实际扩展名；源无扩展名时使用 mov，失败返回 false。
     */
    public static boolean change_record_name(String oldFile, String fileName) {
        return renameMedia(oldFile, fileName, "mov");
    }

    private static boolean renameMedia(String oldFile, String fileName, String defaultExtension) {
        if (oldFile == null || oldFile.isEmpty() || fileName == null || fileName.isEmpty())
            return false;
        File source = new File(oldFile);
        String extension = FileTypes.extension(source.getName());
        if (extension.isEmpty()) extension = defaultExtension;
        if (fileName.toLowerCase(java.util.Locale.ROOT).endsWith("." + extension)) {
            return rename(source, fileName);
        }
        return rename(source, fileName + "." + extension);
    }

    private static boolean rename(File source, String name) {
        try {
            StorageFiles.rename(source, name);
            return true;
        } catch (IOException | IllegalArgumentException e) {
            return false;
        }
    }
}
