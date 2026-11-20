package com.xcore.ui.utils;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings;
import android.util.Log;

public class WifiUtil {

    /**
     * 获取Wifi名称
     *
     * @return
     */
    public static String getConnectWifi(Context context) {
        WifiManager mWifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
        //这里获取的是连接的wifi名称
        WifiInfo connectionInfo = mWifiManager.getConnectionInfo();
        String string = connectionInfo.toString();
        String connect_wifi_name = mWifiManager.getConnectionInfo().getSSID().replace("\"", "");
        Log.d("getConnectWifiSsid", "connectionInfo：" + string); //打印全部wifi信息
        Log.d("getConnectWifiSsid", "SSID：" + connect_wifi_name);      //打印SSID
        return connect_wifi_name;
    }

    public static void startWifiActivity(Context context) {
        Intent intent = new Intent(Settings.ACTION_WIFI_SETTINGS);
        context.startActivity(intent);
    }

//    /**
//     * 获取Wifi名称
//     *
//     * @return
//     */
//    public static String getConnectedWifi(Context context) {
//        WifiManager mWifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE);
//        ConnectivityManager mConnectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
//        NetworkInfo wifiInfo = mConnectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
//        String wifiName = wifiInfo.getExtraInfo();
//        return connect_wifi_name;
//    }
}
