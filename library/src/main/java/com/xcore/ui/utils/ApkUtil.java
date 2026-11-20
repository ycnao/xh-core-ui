package com.xcore.ui.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import java.util.ArrayList;
import java.util.List;

public class ApkUtil {


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
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> list = new ArrayList<>();
        List<ApplicationInfo> appList = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo appInfo : appList) {
            // 过滤掉系统应用
            if ((appInfo.flags & ApplicationInfo.FLAG_SYSTEM) == 0) {
                String appName = packageManager.getApplicationLabel(appInfo).toString();
                String packageName = appInfo.packageName;
                System.out.println("第三方应用：" + appName + "，包名：" + packageName);
                list.add(appInfo);
            }
        }
        return list;
    }

    // 筛选系统应用
    public static void getSystemApps(Context context) {
        PackageManager packageManager = context.getPackageManager();
        List<ApplicationInfo> appList = packageManager.getInstalledApplications(PackageManager.GET_META_DATA);

        for (ApplicationInfo appInfo : appList) {
            // 仅保留系统应用
            if ((appInfo.flags & ApplicationInfo.FLAG_SYSTEM) != 0) {
                String appName = packageManager.getApplicationLabel(appInfo).toString();
                String packageName = appInfo.packageName;
                System.out.println("系统应用：" + appName + "，包名：" + packageName);
            }
        }
    }

    // 检查指定包名的应用是否安装，使用时传入目标应用包名即可
    public static boolean isAppInstalled(Context context, String targetPackageName) {
        PackageManager packageManager = context.getPackageManager();
        try {
            // 根据包名查找应用，若找不到会抛出异常
            packageManager.getApplicationInfo(targetPackageName, PackageManager.GET_META_DATA);
            return true; // 应用已安装
        } catch (PackageManager.NameNotFoundException e) {
            return false; // 应用未安装
        }
    }
}
