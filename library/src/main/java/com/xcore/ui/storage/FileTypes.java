package com.xcore.ui.storage;

import java.util.Locale;

/**
 * 模块内部的扩展名分类工具；仅按名称判断，不检测文件内容或保证系统解码能力。
 */
final class FileTypes {

    /**
     * 获取最后一个点后的扩展名并转小写；无扩展名或仅有前导点时返回空串。
     */
    static String extension(String name) {
        int dot = name.lastIndexOf('.');
        return dot <= 0 ? "" : name.substring(dot + 1).toLowerCase(Locale.ROOT);
    }

    /**
     * 去掉最后一个扩展名，保留无扩展名和以点开头的基础文件名。
     */
    static String baseName(String name) {
        int dot = name.lastIndexOf('.');
        return dot <= 0 ? name : name.substring(0, dot);
    }

    /**
     * 判断文件名是否使用已知图片扩展名。
     */
    static boolean isImage(String name) {
        switch (extension(name)) {
            case "jpg":
            case "jpeg":
            case "png":
            case "webp":
            case "gif":
            case "bmp":
            case "heic":
            case "heif":
            case "avif":
            case "dng":
                return true;
            default:
                return false;
        }
    }

    /**
     * 判断文件名是否使用已知视频扩展名。
     */
    static boolean isVideo(String name) {
        switch (extension(name)) {
            case "mp4":
            case "mov":
            case "m4v":
            case "3gp":
            case "3gpp":
            case "mkv":
            case "webm":
            case "avi":
            case "ts":
                return true;
            default:
                return false;
        }
    }
}
