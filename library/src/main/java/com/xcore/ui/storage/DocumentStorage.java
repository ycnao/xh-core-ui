package com.xcore.ui.storage;

import android.content.Context;
import android.content.Intent;
import android.content.UriPermission;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;

import com.xcore.ui.model.StorageEntry;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 系统存储访问框架（SAF）辅助类，选择器启动与用户授权交由宿主应用处理。
 */
public final class DocumentStorage {


    private static final int ACCESS = Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION;
    private static final String[] COLUMNS = {
            DocumentsContract.Document.COLUMN_DOCUMENT_ID,
            DocumentsContract.Document.COLUMN_DISPLAY_NAME,
            DocumentsContract.Document.COLUMN_MIME_TYPE,
            DocumentsContract.Document.COLUMN_SIZE,
            DocumentsContract.Document.COLUMN_LAST_MODIFIED
    };

    /**
     * 构建单文件选择 Intent；宿主负责启动及处理成功返回结果，支持 MIME 通配符。
     */
    public static Intent openFileIntent(String mimeType) {
        return new Intent(Intent.ACTION_OPEN_DOCUMENT)
                .addCategory(Intent.CATEGORY_OPENABLE)
                .setType(UriStorage.requireMimeType(mimeType))
                .addFlags(ACCESS | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
    }

    /**
     * 构建系统新建文档 Intent；displayName 为建议文件名，由提供方决定最终名称。
     */
    public static Intent createFileIntent(String mimeType, String displayName) {
        return new Intent(Intent.ACTION_CREATE_DOCUMENT)
                .addCategory(Intent.CATEGORY_OPENABLE)
                .setType(UriStorage.requireMimeType(mimeType))
                .putExtra(Intent.EXTRA_TITLE, StorageFiles.requireFileName(displayName))
                .addFlags(ACCESS | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
    }

    /**
     * 构建目录树授权 Intent；可选范围仍受系统版本和提供方限制。
     */
    public static Intent openTreeIntent() {
        return new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE)
                .addFlags(ACCESS | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION | Intent.FLAG_GRANT_PREFIX_URI_PERMISSION);
    }

    /**
     * 选择器成功返回后调用，仅持久化返回 Intent 实际授予的权限；未获持久授权时抛出 SecurityException。
     */
    public static Uri persistPermission(Context context, Intent result) {
        if (result == null || result.getData() == null)
            throw new IllegalArgumentException("Missing document result");
        Uri uri = result.getData();
        requireContent(uri);
        // 只保存提供方实际返回的权限，不能把请求标记当成已获授权的标记。
        int flags = result.getFlags() & ACCESS;
        if (flags == 0 || (result.getFlags() & Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION) == 0) {
            throw new SecurityException("Provider did not grant persistable document access");
        }
        context.getContentResolver().takePersistableUriPermission(uri, flags);
        return uri;
    }

    /**
     * 释放该 URI 已持久化的读写授权；没有持久授权时直接返回。
     */
    public static void releasePermission(Context context, Uri uri) {
        requireContent(uri);
        for (UriPermission permission : context.getContentResolver().getPersistedUriPermissions()) {
            if (permission.getUri().equals(uri)) {
                int flags = (permission.isReadPermission() ? Intent.FLAG_GRANT_READ_URI_PERMISSION : 0)
                        | (permission.isWritePermission() ? Intent.FLAG_GRANT_WRITE_URI_PERMISSION : 0);
                context.getContentResolver().releasePersistableUriPermission(uri, flags);
                return;
            }
        }
    }

    /**
     * 在已授权父目录内创建子目录，返回提供方生成的文档 URI。
     */
    public static Uri createDirectory(Context context, Uri parent, String displayName) throws IOException {
        return createFile(context, parent, DocumentsContract.Document.MIME_TYPE_DIR, displayName);
    }

    /**
     * 在已授权父目录内创建文档；提供方可能调整名称或拒绝创建。
     */
    public static Uri createFile(Context context, Uri parent, String mimeType, String displayName) throws IOException {
        Uri created = DocumentsContract.createDocument(context.getContentResolver(), documentUri(parent),
                UriStorage.requireMimeType(mimeType), StorageFiles.requireFileName(displayName));
        if (created == null) throw new IOException("Provider could not create document");
        return created;
    }

    /**
     * 重命名已授权文档并返回新 URI；后续操作应使用返回值。
     */
    public static Uri rename(Context context, Uri document, String displayName) throws IOException {
        Uri renamed = DocumentsContract.renameDocument(context.getContentResolver(), documentUri(document),
                StorageFiles.requireFileName(displayName));
        if (renamed == null) throw new IOException("Provider could not rename document");
        return renamed; // 重命名可能改变文档 ID，调用方必须使用返回的新 URI。
    }

    /**
     * 请求提供方删除文档或目录；目录递归行为由提供方决定，拒绝操作时上抛异常。
     */
    public static void delete(Context context, Uri document) throws IOException {
        if (!DocumentsContract.deleteDocument(context.getContentResolver(), documentUri(document))) {
            throw new IOException("Provider could not delete document");
        }
    }

    /**
     * 列举目录的直接子项，不递归；返回顺序由提供方决定，未知元数据使用默认值。
     */
    public static List<StorageEntry> list(Context context, Uri directory) throws IOException {
        Uri parent = documentUri(directory);
        String id = DocumentsContract.getDocumentId(parent);
        Uri children = DocumentsContract.isTreeUri(parent)
                ? DocumentsContract.buildChildDocumentsUriUsingTree(parent, id)
                : DocumentsContract.buildChildDocumentsUri(parent.getAuthority(), id);
        List<StorageEntry> entries = new ArrayList<>();
        try (Cursor cursor = context.getContentResolver().query(children, COLUMNS, null, null, null)) {
            if (cursor == null)
                throw new FileNotFoundException("Provider could not list directory");
            while (cursor.moveToNext()) {
                String childId = UriStorage.string(cursor, DocumentsContract.Document.COLUMN_DOCUMENT_ID, null);
                if (childId == null)
                    throw new IOException("Provider returned a document without ID");
                Uri child = DocumentsContract.isTreeUri(parent)
                        ? DocumentsContract.buildDocumentUriUsingTree(parent, childId)
                        : DocumentsContract.buildDocumentUri(parent.getAuthority(), childId);
                String mime = UriStorage.string(cursor, DocumentsContract.Document.COLUMN_MIME_TYPE, null);
                entries.add(new StorageEntry(child,
                        UriStorage.string(cursor, DocumentsContract.Document.COLUMN_DISPLAY_NAME, childId),
                        mime, UriStorage.number(cursor, DocumentsContract.Document.COLUMN_SIZE, -1),
                        UriStorage.number(cursor, DocumentsContract.Document.COLUMN_LAST_MODIFIED, -1),
                        DocumentsContract.Document.MIME_TYPE_DIR.equals(mime)));
            }
        }
        return entries;
    }

    /**
     * 将选择器返回的裸目录树 URI 转为根文档 URI；已有文档 URI 保持不变。
     */
    public static Uri documentUri(Uri uri) {
        requireContent(uri);
        if (DocumentsContract.isTreeUri(uri) && uri.getPathSegments().size() == 2) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        }
        // 尽早拒绝非文档 URI，避免将其误当作文档路径处理。
        DocumentsContract.getDocumentId(uri);
        return uri;
    }

    private static void requireContent(Uri uri) {
        if (uri == null || !"content".equals(uri.getScheme())) {
            throw new IllegalArgumentException("Expected a document content URI");
        }
    }
}
