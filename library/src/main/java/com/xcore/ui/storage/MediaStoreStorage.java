package com.xcore.ui.storage;

import android.Manifest;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;

import com.xcore.ui.model.StorageEntry;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 公共媒体存储工具；权限申请、系统确认及相关异常均由宿主应用处理。
 */
public final class MediaStoreStorage {

    /**
     * 公共文件集合及其标准目录，MIME 前缀用于限制媒体类型声明。
     */
    public enum Collection {
        /**
         * 公共图片，保存到 Pictures 下。
         */
        IMAGES(Environment.DIRECTORY_PICTURES, "image/"),
        /**
         * 公共视频，保存到 Movies 下。
         */
        VIDEO(Environment.DIRECTORY_MOVIES, "video/"),
        /**
         * 公共音频，保存到 Music 下。
         */
        AUDIO(Environment.DIRECTORY_MUSIC, "audio/"),
        /**
         * 公共下载，API 29+ 使用 Downloads 集合，旧版使用 Files 集合。
         */
        DOWNLOADS(Environment.DIRECTORY_DOWNLOADS, "");

        final String directory;
        final String mimePrefix;

        Collection(String directory, String mimePrefix) {
            this.directory = directory;
            this.mimePrefix = mimePrefix;
        }
    }


    /**
     * 新建并发布公共媒体，不关闭输入流，不覆盖已有条目；API 24–28 需宿主授予写存储权限。
     */
    public static Uri save(Context context, Collection collection, String displayName,
                           String mimeType, String subdirectory, InputStream input) throws IOException {
        Objects.requireNonNull(input, "input");
        Objects.requireNonNull(collection, "collection");
        StorageFiles.requireFileName(displayName);
        UriStorage.requireMimeType(mimeType);
        if (mimeType.contains("*") || !mimeType.startsWith(collection.mimePrefix)) {
            throw new IllegalArgumentException("MIME type does not match media collection");
        }
        String relative = relativeDirectory(collection, subdirectory);
        if (Build.VERSION.SDK_INT < 29) {
            return saveLegacy(context, collection, displayName, mimeType, subdirectory, input);
        }
        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DISPLAY_NAME, displayName);
        values.put(MediaStore.MediaColumns.MIME_TYPE, mimeType);
        values.put(MediaStore.MediaColumns.RELATIVE_PATH, relative);
        // Android 10+ 先隐藏尚未写完的条目，只有全部写入成功后才发布。
        values.put(MediaStore.MediaColumns.IS_PENDING, 1);
        Uri created = context.getContentResolver().insert(collectionUri(collection), values);
        if (created == null) throw new IOException("MediaStore could not create item");
        try {
            UriStorage.write(context, created, input);
            ContentValues published = new ContentValues();
            published.put(MediaStore.MediaColumns.IS_PENDING, 0);
            if (context.getContentResolver().update(created, published, null, null) != 1) {
                throw new IOException("MediaStore could not publish item");
            }
            return created;
        } catch (IOException | RuntimeException | Error failure) {
            cleanup(context, created, failure);
            throw failure;
        }
    }

    /**
     * 查询公共子目录的直接子项，排除待发布条目并按修改时间倒序；可见范围受系统权限限制。
     */
    public static List<StorageEntry> list(Context context, Collection collection, String subdirectory) throws IOException {
        String relative = relativeDirectory(collection, subdirectory);
        String[] columns = {
                MediaStore.MediaColumns._ID, MediaStore.MediaColumns.DISPLAY_NAME,
                MediaStore.MediaColumns.MIME_TYPE, MediaStore.MediaColumns.SIZE,
                MediaStore.MediaColumns.DATE_MODIFIED,
                Build.VERSION.SDK_INT >= 29 ? MediaStore.MediaColumns.RELATIVE_PATH : MediaStore.MediaColumns.DATA
        };
        String selection;
        String[] args;
        File legacyDirectory = null;
        if (Build.VERSION.SDK_INT >= 29) {
            selection = MediaStore.MediaColumns.RELATIVE_PATH + "=? AND " + MediaStore.MediaColumns.IS_PENDING + "=0";
            args = new String[]{relative};
        } else {
            legacyDirectory = StorageFiles.resolve(Environment.getExternalStoragePublicDirectory(collection.directory),
                    subdirectory == null ? "" : subdirectory).getAbsoluteFile();
            // 旧系统按物理路径查询，转义 LIKE 通配符，避免目录名中的符号扩大匹配范围。
            selection = MediaStore.MediaColumns.DATA + " LIKE ? ESCAPE '\\'";
            String prefix = legacyDirectory.getPath().replace("\\", "\\\\").replace("%", "\\%").replace("_", "\\_");
            args = new String[]{prefix + "/%"};
        }
        List<StorageEntry> entries = new ArrayList<>();
        Uri base = collectionUri(collection);
        try (Cursor cursor = context.getContentResolver().query(base, columns, selection, args,
                MediaStore.MediaColumns.DATE_MODIFIED + " DESC")) {
            if (cursor == null) throw new IOException("MediaStore query failed");
            while (cursor.moveToNext()) {
                if (legacyDirectory != null) {
                    String path = UriStorage.string(cursor, MediaStore.MediaColumns.DATA, null);
                    if (path == null || !legacyDirectory.equals(new File(path).getParentFile()))
                        continue;
                }
                long id = UriStorage.number(cursor, MediaStore.MediaColumns._ID, -1);
                if (id < 0) throw new IOException("MediaStore returned an item without ID");
                long seconds = UriStorage.number(cursor, MediaStore.MediaColumns.DATE_MODIFIED, -1);
                entries.add(new StorageEntry(ContentUris.withAppendedId(base, id),
                        UriStorage.string(cursor, MediaStore.MediaColumns.DISPLAY_NAME, ""),
                        UriStorage.string(cursor, MediaStore.MediaColumns.MIME_TYPE, null),
                        UriStorage.number(cursor, MediaStore.MediaColumns.SIZE, -1),
                        seconds < 0 ? -1 : seconds * 1000L, false));
            }
        }
        return entries;
    }

    /**
     * 重命名媒体；操作其他应用条目时，RecoverableSecurityException 和系统写入确认由宿主处理。
     */
    public static void rename(Context context, Uri item, String displayName) throws IOException {
        requireItem(item);
        StorageFiles.requireFileName(displayName);
        ContentValues values = new ContentValues();
        values.put(MediaStore.MediaColumns.DISPLAY_NAME, displayName);
        if (Build.VERSION.SDK_INT >= 29) {
            if (context.getContentResolver().update(item, values, null, null) != 1) {
                throw new IOException("MediaStore rename failed");
            }
            return;
        }
        File original;
        try (Cursor cursor = context.getContentResolver().query(item,
                new String[]{MediaStore.MediaColumns.DATA}, null, null, null)) {
            if (cursor == null || !cursor.moveToFirst())
                throw new IOException("Media item not found");
            String path = UriStorage.string(cursor, MediaStore.MediaColumns.DATA, null);
            if (path == null) throw new IOException("Media item has no file path");
            original = new File(path);
        }
        File renamed = StorageFiles.rename(original, displayName);
        values.put(MediaStore.MediaColumns.DATA, renamed.getAbsolutePath());
        try {
            if (context.getContentResolver().update(item, values, null, null) != 1) {
                throw new IOException("MediaStore rename metadata failed");
            }
        } catch (IOException | RuntimeException failure) {
            if (!renamed.equals(original)) {
                try {
                    StorageFiles.move(renamed, original);
                } catch (IOException rollback) {
                    failure.addSuppressed(rollback);
                }
            }
            throw failure;
        }
    }

    /**
     * 删除单个媒体条目，返回是否实际删除；权限或系统确认异常不捕获。
     */
    public static boolean delete(Context context, Uri item) {
        requireItem(item);
        return context.getContentResolver().delete(item, null, null) > 0;
    }

    /**
     * Android 7–9：先写公共文件，再登记媒体索引；重名时增加序号，不覆盖用户文件。
     */
    private static Uri saveLegacy(Context context, Collection collection, String displayName,
                                  String mimeType, String subdirectory, InputStream input) throws IOException {
        if (context.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            throw new SecurityException("Host must grant WRITE_EXTERNAL_STORAGE on Android 7–9");
        }
        File directory = StorageFiles.ensureDirectory(StorageFiles.resolve(
                Environment.getExternalStoragePublicDirectory(collection.directory),
                subdirectory == null ? "" : subdirectory));
        File created = new File(directory, displayName);
        int suffix = 0;
        while (!created.createNewFile()) {
            suffix++;
            String extension = FileTypes.extension(displayName);
            created = new File(directory, FileTypes.baseName(displayName) + " (" + suffix + ")"
                    + (extension.isEmpty() ? "" : "." + extension));
        }
        Uri item = null;
        try {
            File destination = created;
            StorageFiles.writeAtomically(destination, output -> StorageFiles.transfer(input, output));
            ContentValues values = new ContentValues();
            values.put(MediaStore.MediaColumns.DATA, created.getAbsolutePath());
            values.put(MediaStore.MediaColumns.DISPLAY_NAME, created.getName());
            values.put(MediaStore.MediaColumns.MIME_TYPE, mimeType);
            item = context.getContentResolver().insert(collectionUri(collection), values);
            if (item == null) throw new IOException("MediaStore could not index legacy file");
            MediaScannerConnection.scanFile(context, new String[]{created.getAbsolutePath()}, new String[]{mimeType}, null);
            return item;
        } catch (IOException | RuntimeException | Error failure) {
            if (item != null) cleanup(context, item, failure);
            if (!created.delete() && created.exists()) {
                failure.addSuppressed(new IOException("Could not remove failed legacy file: " + created));
            }
            throw failure;
        }
    }

    /**
     * 拼接集合标准目录与相对子目录，拒绝绝对路径、空分量和目录越界。
     */
    private static String relativeDirectory(Collection collection, String subdirectory) {
        if (collection == null) throw new IllegalArgumentException("Collection is required");
        String relative = subdirectory == null ? "" : subdirectory;
        if (!relative.isEmpty()) {
            for (String component : relative.split("/", -1))
                StorageFiles.requireFileName(component);
        }
        return collection.directory + "/" + (relative.isEmpty() ? "" : relative + "/");
    }

    /**
     * 按集合和系统版本选择外部存储 MediaStore 入口。
     */
    private static Uri collectionUri(Collection collection) {
        switch (collection) {
            case IMAGES:
                return MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            case VIDEO:
                return MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            case AUDIO:
                return MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            case DOWNLOADS:
                return Build.VERSION.SDK_INT >= 29 ? MediaStore.Downloads.EXTERNAL_CONTENT_URI
                        : MediaStore.Files.getContentUri("external");
            default:
                throw new IllegalArgumentException("Unknown media collection");
        }
    }

    /**
     * 只接受带有效条目 ID 的 media content URI，防止误用集合 URI 操作多条数据。
     */
    private static void requireItem(Uri item) {
        if (item == null || !"content".equals(item.getScheme()) || !"media".equals(item.getAuthority())
                || item.getPathSegments().size() < 3) {
            throw new IllegalArgumentException("Expected a single MediaStore item URI");
        }
        try {
            if (ContentUris.parseId(item) <= 0)
                throw new IllegalArgumentException("Expected media item ID");
        } catch (NumberFormatException failure) {
            throw new IllegalArgumentException("Expected media item ID", failure);
        }
    }

    /**
     * 清理本次保存失败创建的条目；清理异常附加到原异常，避免丢失主要失败原因。
     */
    private static void cleanup(Context context, Uri item, Throwable failure) {
        try {
            if (context.getContentResolver().delete(item, null, null) == 0) {
                failure.addSuppressed(new IOException("Could not remove failed MediaStore item: " + item));
            }
        } catch (RuntimeException cleanup) {
            failure.addSuppressed(cleanup);
        }
    }
}
