package com.xcore.ui.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.format.Formatter;

import java.util.List;

public class WifiUtil {

    public void connectUsingWifi(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        // 创建网络请求，指定使用Wi-Fi
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        builder.addTransportType(NetworkCapabilities.TRANSPORT_WIFI);

        connectivityManager.registerNetworkCallback(builder.build(), new ConnectivityManager.NetworkCallback() {

            @Override
            public void onAvailable(Network network) {
                // 使用Wi-Fi网络进行通信
                connectivityManager.bindProcessToNetwork(network);
                // 进行您的网络请求
            }

            @Override
            public void onLost(Network network) {
                // 网络丢失处理
                connectivityManager.bindProcessToNetwork(null);
            }
        });
    }

    public static boolean isWifiLink(Context context, String wifi) {
        // 获取WifiManager实例
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);

        // 检查WiFi是否已启用，并断开连接
        if (wifiManager.isWifiEnabled()) {
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            String ssid = wifiInfo.getSSID(); // 获取SSID
            if (ssid.contains(wifi)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static void openWifi(Context context) {
        // 获取WifiManager实例
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        // 检查WiFi是否已启用，并断开连接
        wifiManager.setWifiEnabled(true); // 断开WiFi连接
    }

    public static void closeWifi(Context context) {
        // 获取WifiManager实例
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        // 检查WiFi是否已启用，并断开连接
        wifiManager.setWifiEnabled(false); // 断开WiFi连接
    }

    public static String getWifi(Context context) {
        // 获取WifiManager实例
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        // 检查WiFi是否已启用，并断开连接
        if (wifiManager.isWifiEnabled()) {
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            String ssid = wifiInfo.getSSID(); // 获取SSID
            int ipAddress = wifiInfo.getIpAddress(); // 获取IP地址（整数形式）
            String ipAddressStr = Formatter.formatIpAddress(wifiInfo.getIpAddress()); // 转换为字符串形式
            int linkSpeed = wifiInfo.getLinkSpeed(); // 获取连接速度（Mbps）
            return "当前连接：" + ssid;
        } else {
            return "WiFi未启用";
        }
    }

    @SuppressLint("MissingPermission")
    public static void removeNetwork(Context context, String wifi) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        List<WifiConfiguration> list = wifiManager.getConfiguredNetworks();
        for (WifiConfiguration i : list) {
            if (i.SSID != null && i.SSID.contains(wifi)) { // 注意SSID的双引号问题
                wifiManager.removeNetwork(i.networkId);
                wifiManager.saveConfiguration();
                break;
            }
        }
    }
}
