package com.xcore.ui.http.update;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;

import com.xcore.ui.R;
import com.xcore.ui.http.callback.DownloadListener;
import com.xcore.ui.http.model.UpdateBean;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * 更新管理器
 */
public class UpdateManager {

    private static final String TAG = "UpdateManager";
    private static final int REQUEST_INSTALL_PERMISSION = 10086;

    private final Context context;      // 必须传入 Activity
    private final OkHttpClient client;
    private Dialog dialog;
    private ProgressBar progressBar;
    private TextView tvProgress;
    private UpdateBean currentBean;
    private final String apkSavePath;
    private File pendingInstallFile; // 8.0 授权后待安装的文件

    public UpdateManager(Context context) {
        this.context = context;
        this.client = new OkHttpClient();
        File dir = context.getExternalFilesDir("apk");
        if (dir != null && !dir.exists()) {
            dir.mkdirs();
        }
        apkSavePath = dir.getAbsolutePath() + File.separator + "update.apk";
    }

    /**
     * 入口:检查更新(实际项目改为请求服务端接口解析 JSON)
     */
    public void checkUpdate() {
        // ===== 模拟服务端返回数据,替换为你的接口请求 =====
        UpdateBean bean = new UpdateBean();
        bean.setVersionCode(2);
        bean.setVersionName("1.2.0");
        bean.setDownloadUrl("https://example.com/app-release.apk");
        bean.setUpdateContent("1. 修复已知问题\n2. 优化用户体验\n3. 新增夜间模式");
        bean.setForceUpdate(false);
        // =================================================

        if (bean.getVersionCode() > getLocalVersionCode()) {
            currentBean = bean;
            showUpdateDialog(bean);
        }
    }

    public void checkUpdate(String version, String apkUrl, String updateDate) {
        UpdateBean bean = new UpdateBean();
        bean.setVersionCode(0);
        bean.setVersionName(version);
        bean.setDownloadUrl(apkUrl);
        bean.setUpdateContent("");
        bean.setCreateDate(updateDate);
        bean.setForceUpdate(false);
        currentBean = bean;
        showUpdateDialog(bean);
    }


    private void showUpdateDialog(UpdateBean bean) {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_update, null);
        TextView tvVersion = view.findViewById(R.id.tv_version);
        TextView tvContent = view.findViewById(R.id.tv_date);
        progressBar = view.findViewById(R.id.pb_download);
        tvProgress = view.findViewById(R.id.tv_progress);
        TextView btnUpdate = view.findViewById(R.id.btn_update);
        TextView btnCancel = view.findViewById(R.id.btn_cancel);

        tvVersion.setText("发现新版本 V" + bean.getVersionName());
        tvContent.setText("发布日期：" + bean.getCreateDate());

        dialog = new AlertDialog.Builder(context)
                .setView(view)
                .setCancelable(!bean.isForceUpdate())
                .create();
        dialog.show();

        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (getScreenWidth() * 0.85),
                    WindowManager.LayoutParams.WRAP_CONTENT);
        }

        btnUpdate.setOnClickListener(v -> {
            btnUpdate.setVisibility(View.GONE);
            btnCancel.setVisibility(View.GONE);
            progressBar.setVisibility(View.VISIBLE);
            tvProgress.setVisibility(View.VISIBLE);

            // 弹窗内部走同一个公开方法,成功后直接安装
            downloadApk(bean.getDownloadUrl(), new DownloadListener() {
                @Override
                public void onStart() {
                }

                @Override
                public void onProgress(int progress) {
                    progressBar.setProgress(progress);
                    tvProgress.setText(progress >= 100 ? "下载完成" : "下载中 " + progress + "%");
                }

                @Override
                public void onSuccess(File apkFile) {
                    installApk(apkFile);
                }

                @Override
                public void onFailed(String errorMsg) {
                    dismissDialog();
                    Toast.makeText(context, "下载失败:" + errorMsg, Toast.LENGTH_SHORT).show();
                }
            });
        });

        btnCancel.setOnClickListener(v -> dialog.dismiss());
    }

    // ══════════ 核心改动:公开下载方法,成功后回调返回 File ══════════

    /**
     * 下载 APK,成功后通过 listener.onSuccess(File) 返回文件
     * 所有回调均已在主线程执行
     *
     * @param url      APK 下载地址
     * @param listener 下载回调,可为 null
     */
    public void downloadApk(String url, DownloadListener listener) {
        if (listener != null) {
            runOnUi(listener::onStart);
        }

        Request request = new Request.Builder().url(url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NonNull Call call, @NonNull IOException e) {
                Log.e(TAG, "下载失败: " + e.getMessage());
                if (listener != null) {
                    runOnUi(() -> listener.onFailed(
                            e.getMessage() != null ? e.getMessage() : "网络异常"));
                }
            }

            @Override
            public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
                if (!response.isSuccessful() || response.body() == null) {
                    if (listener != null) {
                        runOnUi(() -> listener.onFailed("服务器错误: " + response.code()));
                    }
                    return;
                }
                try (InputStream is = response.body().byteStream();
                     FileOutputStream fos = new FileOutputStream(apkSavePath)) {

                    long total = response.body().contentLength();
                    byte[] buf = new byte[8192];
                    int len;
                    long sum = 0;
                    while ((len = is.read(buf)) != -1) {
                        fos.write(buf, 0, len);
                        sum += len;
                        if (total > 0 && listener != null) {
                            int progress = (int) (sum * 100 / total);
                            runOnUi(() -> listener.onProgress(progress));
                        }
                    }
                    fos.flush();

                    // ★★★ 下载完成,回调返回文件地址 ★★★
                    File apkFile = new File(apkSavePath);
                    if (listener != null) {
                        runOnUi(() -> listener.onSuccess(apkFile));
                    }
                } catch (IOException e) {
                    if (listener != null) {
                        runOnUi(() -> listener.onFailed("写入文件失败: " + e.getMessage()));
                    }
                }
            }
        });
    }

    /**
     * ★ 新增:获取已缓存的 APK,存在则返回 File,否则返回 null
     */
    public File getDownloadedApk() {
        File apkFile = new File(apkSavePath);
        return apkFile.exists() ? apkFile : null;
    }

    /**
     * 安装指定 APK(兼容 7.0 / 8.0),现在需要传入 File
     */
    public void installApk(File apkFile) {
        if (apkFile == null || !apkFile.exists()) {
            Toast.makeText(context, "安装包不存在", Toast.LENGTH_SHORT).show();
            return;
        }

        // Android 8.0+ 需先授予"未知来源应用安装"权限
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
                && !context.getPackageManager().canRequestPackageInstalls()) {
            pendingInstallFile = apkFile; // 记住待安装文件,授权后继续
            Intent intent = new Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                    Uri.parse("package:" + context.getPackageName()));
            ((Activity) context).startActivityForResult(intent, REQUEST_INSTALL_PERMISSION);
            return;
        }

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Uri apkUri = FileProvider.getUriForFile(context,
                    context.getPackageName() + ".fileprovider", apkFile);
            intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
            intent.setDataAndType(apkUri, "application/vnd.android.package-archive");
        } else {
            intent.setDataAndType(Uri.fromFile(apkFile),
                    "application/vnd.android.package-archive");
        }
        context.startActivity(intent);
    }

    /**
     * 在 Activity 的 onActivityResult 中调用,授权后继续安装挂起的文件
     */
    public void onActivityResult(int requestCode, int resultCode) {
        if (requestCode == REQUEST_INSTALL_PERMISSION
                && Build.VERSION.SDK_INT >= Build.VERSION_CODES.O
                && context.getPackageManager().canRequestPackageInstalls()
                && pendingInstallFile != null) {
            installApk(pendingInstallFile);
            pendingInstallFile = null;
        }
    }

    private void runOnUi(Runnable r) {
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(r);
        } else {
            r.run();
        }
    }

    private void dismissDialog() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }

    private int getLocalVersionCode() {
        try {
            PackageInfo info = context.getPackageManager()
                    .getPackageInfo(context.getPackageName(), 0);
            return Build.VERSION.SDK_INT >= Build.VERSION_CODES.P
                    ? (int) info.getLongVersionCode()
                    : info.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private int getScreenWidth() {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        return wm.getDefaultDisplay().getWidth();
    }
}