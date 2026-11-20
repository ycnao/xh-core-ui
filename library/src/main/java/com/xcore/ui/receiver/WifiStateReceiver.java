package com.xcore.ui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.util.Log;


import com.xcore.ui.event.WifiEvent;

import org.greenrobot.eventbus.EventBus;

/**
 *
 */
public class WifiStateReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action.equals(WifiManager.WIFI_STATE_CHANGED_ACTION)) {
            int state = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);
            // 处理Wi-Fi状态变化
            switch (state) {
                case WifiManager.WIFI_STATE_DISABLED:
                    EventBus.getDefault().post(new WifiEvent(0));
                    Log.d("WifiStateReceiver", "Wi-Fi is disabled");
                    break;
                case WifiManager.WIFI_STATE_ENABLED:
                    EventBus.getDefault().post(new WifiEvent(1));
                    Log.d("WifiStateReceiver", "Wi-Fi is enabled");
                    break;
            }
        } else if (action.equals(WifiManager.NETWORK_STATE_CHANGED_ACTION)) {
            NetworkInfo networkInfo = intent.getParcelableExtra(WifiManager.EXTRA_NETWORK_INFO);
            if (networkInfo.getState().equals(NetworkInfo.State.CONNECTED)) {
                EventBus.getDefault().post(new WifiEvent(2));
                Log.d("WifiStateReceiver", "Network " + networkInfo.getExtraInfo() + " connected");
            } else if (networkInfo.getState().equals(NetworkInfo.State.DISCONNECTED)) {
                EventBus.getDefault().post(new WifiEvent(3));
                Log.d("WifiStateReceiver", "Network " + networkInfo.getExtraInfo() + " disconnected");
            }
        }
    }

}
