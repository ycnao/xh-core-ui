package com.xcore.ui.utils;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AppUtil {

    public static String[] permission() {
        return new String[]{
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.ACCESS_FINE_LOCATION
        };
    }

    public static void openAppByPackageName(Context context, String packageName) {
        Intent launchIntent = context.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntent != null) {
            context.startActivity(launchIntent);
        } else {
            Toast.makeText(context, "无法打开应用程序", Toast.LENGTH_SHORT).show();
        }
    }

    public static void toBatteryActivity(Context context) {
        Intent intent = new Intent(Settings.ACTION_BATTERY_SAVER_SETTINGS);
        context.startActivity(intent);
    }

    public static void toSystemActivity(Context context, String settings) {
        Intent intent = new Intent(settings);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 去系统设置页面
     */
    public static void toSystemSetActivity(Context context) {
        Intent intent = new Intent();
        intent.setAction(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        String packageName = context.getApplicationContext().getPackageName();
        intent.setData(Uri.fromParts("package", packageName, null));
        context.startActivity(intent);
    }


    public static void startRemoveSystemLockActivity(Activity activity) {
        String phoneName = android.os.Build.BRAND;
        if (phoneName.toLowerCase().contains("xiaomi")) {
            Intent intent = new Intent("/");
            ComponentName cm = new ComponentName("com.android.settings", "com.android.settings.DevelopmentSettings");
            intent.setComponent(cm);
            activity.startActivityForResult(intent, 0);
        } else if (phoneName.toLowerCase().contains("lge")) {
            Intent intent = new Intent("/");
            ComponentName cm = new ComponentName("com.android.settings", "com.android.settings.lockscreen.ChooseLockGeneric");
            intent.setComponent(cm);
            activity.startActivityForResult(intent, 0);
        } else {
            Intent intent = new Intent("/");
            ComponentName cm = new ComponentName("com.android.settings", "com.android.settings.ChooseLockGeneric");
            intent.setComponent(cm);
            activity.startActivityForResult(intent, 0);
        }
    }

    // 获取所有已安装应用
    public static void getAllInstalledApps(Context context) {
        // 获取PackageManager实例
        PackageManager packageManager = context.getPackageManager();
        // 获取所有已安装应用的信息列表
        List<ApplicationInfo> appList = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        // 遍历列表，提取应用信息
        for (ApplicationInfo appInfo : appList) {
            // 应用名称
            String appName = packageManager.getApplicationLabel(appInfo).toString();
            // 应用包名
            String packageName = appInfo.packageName;
            // 应用图标（可用于展示）
            // Drawable appIcon = packageManager.getApplicationIcon(appInfo);

            // 打印应用信息
            System.out.println("应用名称：" + appName + "，包名：" + packageName);
        }
    }

    // 筛选第三方应用（用户自行安装的应用）
    public static List<ApplicationInfo> getThirdPartyApps(Context context) {
        PackageManager manager = context.getPackageManager();
        List<ApplicationInfo> list = new ArrayList<>();
        List<ApplicationInfo> appList = manager.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo appInfo : appList) {
            // 过滤掉系统应用
            if ((appInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                String appName = manager.getApplicationLabel(appInfo).toString();
                String packageName = appInfo.packageName;
                System.out.println("第三方应用：" + appName + "，包名：" + packageName);
                list.add(appInfo);
            }
        }
        return list;
    }

    // 筛选系统应用
    public static void getSystemApps(Context context) {
        PackageManager manager = context.getPackageManager();
        List<ApplicationInfo> appList = manager.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo appInfo : appList) {
            // 仅保留系统应用
            if ((appInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0) {
                String appName = manager.getApplicationLabel(appInfo).toString();
                String packageName = appInfo.packageName;
                System.out.println("系统应用：" + appName + "，包名：" + packageName);
            }
        }
    }

    // 检查指定包名的应用是否安装，使用时传入目标应用包名即可
    public static boolean isAppInstalled(Context context, String targetPackageName) {
        PackageManager manager = context.getPackageManager();
        try {
            // 根据包名查找应用，若找不到会抛出异常
            manager.getApplicationInfo(targetPackageName, PackageManager.GET_META_DATA);
            return true; // 应用已安装
        } catch (PackageManager.NameNotFoundException e) {
            return false; // 应用未安装
        }
    }

}
