package com.xcore.ui.model;

import android.net.Uri;

/**
 * 不可变的提供方元数据快照；文件刚写入后，查询值可能暂时滞后。
 * 大小单位为字节，修改时间单位为毫秒；未知大小或修改时间用 -1 表示。
 */
public final class StorageEntry {

    private final Uri uri;
    private final String name;
    private final String mimeType;
    private final long size;
    private final long lastModified;
    private final boolean directory;

    /**
     * 创建元数据快照；不检查文件当前状态，也不主动获取缺失的元数据。
     */
    public StorageEntry(Uri uri, String name, String mimeType, long size, long lastModified, boolean directory) {
        this.uri = uri;
        this.name = name;
        this.mimeType = mimeType;
        this.size = size;
        this.lastModified = lastModified;
        this.directory = directory;
    }

    /**
     * 返回用于后续访问的 URI，不应将 content URI 当作物理文件路径。
     */
    public Uri getUri() {
        return uri;
    }

    /**
     * 返回提供方的显示名称，不保证等于物理文件名。
     */
    public String getName() {
        return name;
    }

    /**
     * 返回提供方声明的 MIME 类型，未知时可为 null。
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * 返回字节大小，未知时为 -1；写入后可能暂时为旧值。
     */
    public long getSize() {
        return size;
    }

    /**
     * 返回修改时间戳，单位为毫秒，未知时为 -1。
     */
    public long getLastModified() {
        return lastModified;
    }

    /**
     * 返回当前元数据是否将该条目标记为目录。
     */
    public boolean isDirectory() {
        return directory;
    }
}
