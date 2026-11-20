package com.xcore.ui.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

public class NetworkUtil {

    /**
     * 检查网络连接状态
     *
     * @param context 上下文（需确保非空）
     * @return 0=无连接，1=移动网络，2=WiFi网络
     */
    public static int checkNetworkConnection(Context context) {
        byte flg = 0;
        // 获取网络管理服务（需添加权限：<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>）
        ConnectivityManager connMgr = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        // 适配API 29+（activeNetworkInfo 过时）
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            // 获取当前活跃网络
            Network activeNetwork = connMgr.getActiveNetwork();
            if (activeNetwork != null) {
                // 获取网络能力（判断网络类型）
                NetworkCapabilities capabilities = connMgr.getNetworkCapabilities(activeNetwork);
                if (capabilities != null) {
                    // 判断是否为WiFi
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                        flg = 2;
                    }
                    // 判断是否为移动网络（含5G/4G等）
                    else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                        flg = 1;
                    }
                }
            }
        }
        // 兼容API 29以下
        else {
            // 获取旧版活跃网络信息（已过时，仅用于低版本兼容）
            @SuppressWarnings("deprecation")
            android.net.NetworkInfo activeInfo = connMgr.getActiveNetworkInfo();
            if (activeInfo != null && activeInfo.isConnected()) {
                // 判断WiFi（TYPE_WIFI = 1）
                if (activeInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                    flg = 2;
                }
                // 判断移动网络（TYPE_MOBILE = 0）
                else if (activeInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                    flg = 1;
                }
            }
        }

        return flg;
    }
}
