package com.xcore.ui.http.callback;

import java.io.File;

public interface DownloadListener {

    void onStart();

    void onProgress(int progress);

    /**
     * ★ 下载成功,返回 APK 文件
     */
    void onSuccess(File apkFile);

    void onFailed(String errorMsg);
}