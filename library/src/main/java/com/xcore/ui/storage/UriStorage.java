package com.xcore.ui.storage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.OpenableColumns;
import android.webkit.MimeTypeMap;

import com.xcore.ui.model.StorageEntry;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

/**
 * 已授权 content URI 和应用自有 file URI 的读写工具，不尝试把 content URI 转成物理路径。
 */
public final class UriStorage {

    /**
     * 打开已获授权 URI 的输入流，由调用方关闭；提供方返回 null 时抛出 FileNotFoundException。
     */
    public static InputStream openInput(Context context, Uri uri) throws IOException {
        requireSupportedUri(uri);
        InputStream input = context.getContentResolver().openInputStream(uri);
        if (input == null) throw new FileNotFoundException("Provider could not open: " + uri);
        return input;
    }

    /**
     * 以截断模式打开输出流，由调用方关闭；提供方失败、权限和系统确认异常原样上抛。
     */
    public static OutputStream openOutput(Context context, Uri uri) throws IOException {
        requireSupportedUri(uri);
        OutputStream output = context.getContentResolver().openOutputStream(uri, "wt");
        if (output == null) throw new FileNotFoundException("Provider could not write: " + uri);
        return output;
    }

    /**
     * 受字节上限约束地读取 URI 内容，并自动关闭内部输入流。
     */
    public static byte[] readBytes(Context context, Uri uri, int maxBytes) throws IOException {
        try (InputStream input = openInput(context, uri)) {
            return StorageFiles.readBytes(input, maxBytes);
        }
    }

    /**
     * 读取 URI 内容并按 UTF-8 解码；maxBytes 按字节计算。
     */
    public static String readText(Context context, Uri uri, int maxBytes) throws IOException {
        return new String(readBytes(context, uri, maxBytes), StandardCharsets.UTF_8);
    }

    /**
     * 截断写入并返回字节数，不关闭调用方输入流；非原子操作，中途失败可能留下部分内容。
     */
    public static long write(Context context, Uri uri, InputStream input) throws IOException {
        // 必须先校验来源，再打开截断输出流，防止空输入破坏已有文件。
        Objects.requireNonNull(input, "input");
        try (OutputStream output = openOutput(context, uri)) {
            long copied = StorageFiles.transfer(input, output);
            output.flush();
            return copied;
        }
    }

    /**
     * 从 URI 复制到本地文件，通过原子替换保护目标原内容，不修改来源文档。
     */
    public static File copyToFile(Context context, Uri source, File destination) throws IOException {
        StorageFiles.writeAtomically(destination, output -> {
            try (InputStream input = openInput(context, source)) {
                StorageFiles.transfer(input, output);
            }
        });
        return destination;
    }

    /**
     * 只查询提供方元数据，不主动下载文档；元数据可能异步更新，暂时滞后于实际内容。
     */
    public static StorageEntry stat(Context context, Uri uri) throws IOException {
        requireSupportedUri(uri);
        if ("file".equals(uri.getScheme())) {
            File file = new File(uri.getPath());
            if (!file.exists()) throw new FileNotFoundException("File not found: " + uri);
            String mime = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FileTypes.extension(file.getName()));
            return new StorageEntry(uri, file.getName(), mime, file.length(), file.lastModified(), file.isDirectory());
        }
        // 仅查询通用列，兼容只暴露 OpenableColumns 的文档提供方。
        try (Cursor cursor = context.getContentResolver().query(uri,
                new String[]{OpenableColumns.DISPLAY_NAME, OpenableColumns.SIZE}, null, null, null)) {
            if (cursor == null || !cursor.moveToFirst())
                throw new FileNotFoundException("Document not found: " + uri);
            String mime = context.getContentResolver().getType(uri);
            return new StorageEntry(uri, string(cursor, OpenableColumns.DISPLAY_NAME, uri.getLastPathSegment()),
                    mime, number(cursor, OpenableColumns.SIZE, -1), -1,
                    DocumentsContract.Document.MIME_TYPE_DIR.equals(mime));
        }
    }

    /**
     * 兼容提供方缺失列或列值为 null 的情况，返回指定默认值。
     */
    static String string(Cursor cursor, String column, String fallback) {
        int index = cursor.getColumnIndex(column);
        return index < 0 || cursor.isNull(index) ? fallback : cursor.getString(index);
    }

    /**
     * 读取数值元数据，列缺失或为 null 时使用默认值。
     */
    static long number(Cursor cursor, String column, long fallback) {
        int index = cursor.getColumnIndex(column);
        return index < 0 || cursor.isNull(index) ? fallback : cursor.getLong(index);
    }

    /**
     * 仅接受 content 和 file 协议；协议校验本身不代表已获得访问权限。
     */
    static void requireSupportedUri(Uri uri) {
        if (uri == null || !("content".equals(uri.getScheme()) || "file".equals(uri.getScheme()))) {
            throw new IllegalArgumentException("Expected a content or file URI");
        }
    }

    /**
     * 校验 MIME 类型声明格式；选择器允许通配符，实际保存媒体时另行限制。
     */
    static String requireMimeType(String mime) {
        if (mime == null || !mime.matches("[a-zA-Z0-9!#$&^_.+*-]+/[a-zA-Z0-9!#$&^_.+*-]+")) {
            throw new IllegalArgumentException("Invalid MIME type");
        }
        return mime;
    }
}
