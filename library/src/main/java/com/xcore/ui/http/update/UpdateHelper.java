package com.xcore.ui.http.update;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;

import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;


public class UpdateHelper {

    public interface DownloadListener {
        void onProgress(int progress);
        void onSuccess(File file);
        void onFail(String msg);
    }

    private final Context mContext;
    private final OkHttpClient mOkHttpClient;
    private long mDownloadId = -1L;
    private BroadcastReceiver mDownloadReceiver;
    private final Handler mMainHandler;

    public UpdateHelper(Context context) {
        mContext = context.getApplicationContext();
        mMainHandler = new Handler(Looper.getMainLooper());
        mOkHttpClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    //==================== 8.0+ 安装未知应用权限 ====================
    public boolean haveInstallPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            return mContext.getPackageManager().canRequestPackageInstalls();
        }
        return true;
    }

    public void gotoInstallPermissionSetting() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Intent intent = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES);
            intent.setData(Uri.parse("package:" + mContext.getPackageName()));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            mContext.startActivity(intent);
        }
    }

    //==================== 方式1：系统 DownloadManager 下载 ====================
    public void startDownloadBySystem(String apkUrl, String fileName) {
        DownloadManager dm = (DownloadManager) mContext.getSystemService(Context.DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(apkUrl));
        request.setDestinationInExternalFilesDir(mContext, Environment.DIRECTORY_DOWNLOADS, fileName);
        request.setTitle("版本更新");
        request.setDescription("正在下载新版本");
        request.setMimeType("application/vnd.android.package-archive");
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        request.setVisibleInDownloadsUi(true);

        mDownloadId = dm.enqueue(request);

        mDownloadReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                long id = intent.getLongExtra(DownloadManager.EXTRA_DOWNLOAD_ID, -1);
                if (id == mDownloadId) {
                    Uri uri = dm.getUriForDownloadedFile(mDownloadId);
                    if (uri != null) {
                        File apkFile = new File(uri.getPath());
                        if (apkFile.exists()) {
                            installApk(apkFile);
                        }
                    }
                    unRegisterReceiver();
                }
            }
        };
        mContext.registerReceiver(mDownloadReceiver, new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }

    public void unRegisterReceiver() {
        if (mDownloadReceiver != null) {
            mContext.unregisterReceiver(mDownloadReceiver);
            mDownloadReceiver = null;
        }
    }

    //==================== 方式2：OkHttp自定义下载，带进度回调 ====================
    public void startDownloadCustom(String apkUrl, String fileName, String expectSha256, DownloadListener listener) {
        File saveDir = mContext.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
        if (saveDir == null) {
            listener.onFail("获取存储目录失败");
            return;
        }
        if (!saveDir.exists()) {
            saveDir.mkdirs();
        }
        File targetFile = new File(saveDir, fileName);

        new Thread(() -> {
            try {
                Request request = new Request.Builder().url(apkUrl).build();
                Call call = mOkHttpClient.newCall(request);
                Response response = call.execute();
                if (!response.isSuccessful()) {
                    postMain(() -> listener.onFail("网络错误：" + response.code()));
                    return;
                }
                ResponseBody body = response.body();
                if (body == null) {
                    postMain(() -> listener.onFail("响应体为空"));
                    return;
                }
                long totalLen = body.contentLength();
                InputStream inputStream = body.byteStream();
                FileOutputStream fos = new FileOutputStream(targetFile);
                byte[] buffer = new byte[8192];
                int len;
                long readTotal = 0;
                while ((len = inputStream.read(buffer)) != -1) {
                    fos.write(buffer, 0, len);
                    readTotal += len;
                    if (totalLen > 0) {
                        int progress = (int) (readTotal * 100 / totalLen);
                        postMain(() -> listener.onProgress(progress));
                    }
                }
                fos.flush();
                fos.close();
                inputStream.close();

                if (!targetFile.exists()) {
                    postMain(() -> listener.onFail("文件写入失败"));
                    return;
                }

                // SHA256校验
                if (expectSha256 != null && !expectSha256.trim().isEmpty()) {
                    String fileSha = getFileSha256(targetFile);
                    if (!expectSha256.equalsIgnoreCase(fileSha)) {
                        targetFile.delete();
                        postMain(() -> listener.onFail("安装包校验不通过，文件已删除"));
                        return;
                    }
                }
                postMain(() -> listener.onSuccess(targetFile));
            } catch (IOException e) {
                postMain(() -> listener.onFail(e.getMessage() == null ? "下载异常" : e.getMessage()));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

    private void postMain(Runnable runnable) {
        mMainHandler.post(runnable);
    }

    //==================== 安装APK 适配7.0+ FileProvider ====================
    public void installApk(File apkFile) {
        if (!apkFile.exists()) {
            return;
        }
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Uri apkUri;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            apkUri = FileProvider.getUriForFile(mContext, mContext.getPackageName() + ".fileprovider", apkFile);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        } else {
            apkUri = Uri.fromFile(apkFile);
        }
        intent.setDataAndType(apkUri, "application/vnd.android.package-archive");
        mContext.startActivity(intent);
    }

    /**
     * 获取文件SHA256 大写字符串
     */
    private String getFileSha256(File file) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        try (InputStream is = file.toURI().toURL().openStream()) {
            byte[] buf = new byte[4096];
            int n;
            while ((n = is.read(buf)) != -1) {
                digest.update(buf, 0, n);
            }
        }
        byte[] bytes = digest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }
}