package com.xcore.ui.storage;

import android.content.Context;
import android.os.Environment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Android 应用专属目录工具，以下目录接口均不需要存储权限。
 */
public class StorageUtil {

    public static String TAG = "StorageUtil";

    /**
     * 未指定根目录时使用的应用专属子目录名。
     */
    public static final String DEFAULT_DIRECTORY = "xh-storage";

    /**
     * 获取初始化后的应用根目录绝对路径；未初始化时抛出 IllegalStateException。
     */
    public static String getDataPath() {
        return Storage.getDataPath();
    }

    /**
     * 预留唯一的空文件；调用方负责写入，若最终未使用需自行删除。
     */
    public static File getSaveFile(Context context, String format) {
        return getSaveFile(context, "", format);
    }

    /**
     * 按日期、业务类型和扩展名预留唯一文件；type 可为空，不能包含路径分隔符。
     */
    public static File getSaveFile(Context context, String type, String format) {
        String extension = normalizeExtension(format);
        if (type == null) type = "";
        if (!type.isEmpty()) StorageFiles.requireFileName(type);
        File directory = new File(Storage.getAlbumFolder(context, extension));
        String prefix = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.ROOT).format(new Date());
        if (!type.isEmpty()) prefix += "-" + type;
        try {
            return File.createTempFile(prefix + "-", "." + extension, directory);
        } catch (IOException e) {
            throw new StorageException("Cannot reserve a save file", e);
        }
    }

    /**
     * 旧版公共 DCIM 路径描述；API 29+ 不能仅凭 File 路径获得访问权限。
     * 公共媒体使用 MediaStoreStorage，用户授权文档使用 DocumentStorage。
     */
    @Deprecated
    public static String getFilePath(String relativePath) {
        try {
            return StorageFiles.resolve(Environment.getExternalStoragePublicDirectory(
                    Environment.DIRECTORY_DCIM), relativePath).getAbsolutePath();
        } catch (IOException e) {
            throw new StorageException("Cannot resolve DCIM path", e);
        }
    }

    /**
     * 旧接口兼容别名，现解析到应用专属持久化目录。
     */
    public static String getRootPath(Context context, String path) {
        return getAppRootPath(context, path);
    }

    /**
     * 创建并返回应用专属根目录；rootPath 是相对路径，null 或空字符串采用默认目录。
     */
    public static String getAppRootPath(Context context, String rootPath) {
        try {
            String relative = rootPath == null || rootPath.isEmpty() ? DEFAULT_DIRECTORY : rootPath;
            return StorageFiles.ensureDirectory(StorageFiles.resolve(getFilesDirectory(context), relative)).getAbsolutePath();
        } catch (IOException e) {
            throw new StorageException("Cannot create app storage directory", e);
        }
    }

    /**
     * 创建应用根目录内的子目录；path 为空时返回根目录，越界路径会被拒绝。
     */
    public static String toAppRootPath(Context context, String rootPath, String path) {
        try {
            return StorageFiles.ensureDirectory(StorageFiles.resolve(
                    new File(getAppRootPath(context, rootPath)), path)).getAbsolutePath();
        } catch (IOException e) {
            throw new StorageException("Cannot create app storage subdirectory", e);
        }
    }

    /**
     * 外部卷已挂载时使用应用外部专属目录，否则回退到内部 filesDir；不使用缓存目录保存持久数据。
     */
    public static File getFilesDirectory(Context context) throws IOException {
        File directory = context.getExternalFilesDir(null);
        if (directory == null || !Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState(directory))) {
            directory = context.getFilesDir();
        }
        if (directory == null) throw new IOException("App files directory unavailable");
        return StorageFiles.ensureDirectory(directory);
    }

    /**
     * 获取内部缓存子目录；系统可能回收缓存，不应用于保存持久化数据。
     */
    public static File getCacheDirectory(Context context, String relativePath) throws IOException {
        return StorageFiles.ensureDirectory(StorageFiles.resolve(context.getCacheDir(), relativePath));
    }

    /**
     * 列出已挂载且可写的应用外部专属目录，包括次级卷或可移除存储卷。
     */
    public static List<File> getExternalDirectories(Context context) {
        List<File> directories = new ArrayList<>();
        File[] candidates = context.getExternalFilesDirs(null);
        if (candidates != null) {
            for (File directory : candidates) {
                if (directory != null && Environment.MEDIA_MOUNTED.equals(Environment.getExternalStorageState(directory))) {
                    directories.add(directory);
                }
            }
        }
        return directories;
    }

    /**
     * 返回当前可用空间，单位为字节；不包含系统可回收缓存，也不预留写入空间。
     */
    public static long getAvailableBytes(Context context) throws IOException {
        return getFilesDirectory(context).getUsableSpace();
    }

    /**
     * 去掉可选的前导点并统一小写；仅接受 1–16 位英文字母或数字。
     */
    static String normalizeExtension(String format) {
        if (format == null) throw new IllegalArgumentException("File extension is required");
        String extension = format.startsWith(".") ? format.substring(1) : format;
        if (!extension.matches("[a-zA-Z0-9]{1,16}"))
            throw new IllegalArgumentException("Invalid file extension");
        return extension.toLowerCase(Locale.ROOT);
    }
}
