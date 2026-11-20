package com.xcore.ui.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;

import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ApkUtil {

    /**
     * 检测是否安装apk
     *
     * @param context 上下文（建议用Application Context，避免内存泄漏）
     * @return true=已安装，false=未安装/无权限
     */
    public static boolean isInstalled(Context context, String packageName) {
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            // 检测包名是否存在（getPackageInfo 抛异常则表示未安装）
            // 仅检测包存在，无需获取额外信息
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            // 额外校验：确保应用未被禁用（可选）
            return packageInfo.applicationInfo.enabled;
        } catch (PackageManager.NameNotFoundException e) {
            // 包名不存在 = 未安装
            e.printStackTrace();
            return false;
        } catch (Exception e) {
            // 其他异常（如权限不足），默认返回未安装
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 从 Assets 复制 APK 到本地并安装
     *
     * @param context 上下文（建议用 Application Context）
     */
    public static void installApkFromAssets(Context context, String assetsApkName) {
        // 1. 检查安装权限（Android 8.0+）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            boolean hasInstallPermission = context.getPackageManager().canRequestPackageInstalls();
            if (!hasInstallPermission) {
                // 跳转到权限设置页面
                Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES,
                        Uri.parse("package:" + context.getPackageName()));
                context.startActivity(intent);
                return;
            }
        }

        // 2. 复制 Assets 中的 APK 到本地
        File apkFile = copyAssetsApkToLocal(context, assetsApkName);
        if (apkFile == null || !apkFile.exists()) {
            // 复制失败，提示用户
            return;
        }
        // 3. 调用系统安装器安装 APK
        installApk(context, apkFile);
    }


    /**
     * 将 Assets 中的 APK 复制到应用私有外部存储目录
     *
     * @param context       上下文
     * @param assetsApkName Assets 中的 APK 文件名
     * @return 本地 APK 文件
     */
    private static File copyAssetsApkToLocal(Context context, String assetsApkName) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // 打开 Assets 中的 APK 文件
            is = context.getAssets().open(assetsApkName);
            // 目标文件路径：/sdcard/Android/data/[包名]/files/xxx.apk（无需读写权限）
            File targetFile = new File(context.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), assetsApkName);
            if (targetFile.exists()) {
                targetFile.delete(); // 删除旧文件
            }
            os = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024 * 4];
            int length;
            while ((length = is.read(buffer)) != -1) {
                os.write(buffer, 0, length);
            }
            os.flush();
            return targetFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (is != null) is.close();
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 调用系统安装器安装 APK
     *
     * @param context 上下文
     * @param apkFile 本地 APK 文件
     */
    private static void installApk(Context context, File apkFile) {
        Intent installIntent = new Intent(Intent.ACTION_INSTALL_PACKAGE);
        Uri apkUri;
        // Android 7.0+ 使用 FileProvider 获取 Uri
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            apkUri = FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", apkFile);
            // 授予临时读写权限
            installIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
        } else {
            apkUri = Uri.fromFile(apkFile);
        }
        installIntent.setDataAndType(apkUri, "application/vnd.android.package-archive");
        installIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(installIntent);
    }


}
