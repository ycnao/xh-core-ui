package com.xcore.ui.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.HardwarePropertiesManager;
import android.util.Log;


/**
 * 温度工具类
 */
public class BatteryUtil {

    private static final String TAG = "TempHelper";

    /**
     * 获取电池温度（普通App可用）
     *
     * @param context 上下文
     * @return 温度值（摄氏度，带一位小数），失败返回 -1
     */
    public static float getBatteryTemp(Context context) {
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        // registerReceiver传null表示只获取当前的 sticky 广播状态，不常驻监听
        Intent batteryStatus = context.registerReceiver(null, filter);

        if (batteryStatus != null) {
            // EXTRA_TEMPERATURE 返回的是整数，单位是 十分之一摄氏度
            // 例如返回 315，代表 31.5℃
            int temperature = batteryStatus.getIntExtra(BatteryManager.EXTRA_TEMPERATURE, -1);
            if (temperature != -1) {
                return temperature / 10.0f;
            }
        }
        return -1;
    }

    /**
     * 获取电池电压（V）
     */
    public static float getBatteryVol(Context context) {
        // 注册空接收器，直接拿到最新电池广播（粘性）
        Intent intent = context.registerReceiver(null, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
        if (intent == null) return 0f;
        // EXTRA_VOLTAGE：毫伏(mV)，转成 V
        int mV = intent.getIntExtra(BatteryManager.EXTRA_VOLTAGE, 0);
        return mV / 1000f;
    }

    /**
     * 方案二：获取设备外壳/屏幕温度 (仅限 Android 9.0+ 且具有系统签名的App)
     *
     * @param context 上下文
     * @return 摄氏度温度值，如果失败返回特殊错误码：
     * -1: 设备不支持或API低于9.0
     * -999: 权限不足（普通App会返回这个）
     */
    public static float getSkinTemp(Context context) {
        if (context == null) return -1;

        // 该API只在 Android 9.0 (Pie) 及以上版本存在
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            try {
                HardwarePropertiesManager hpManager =
                        (HardwarePropertiesManager) context.getSystemService(Context.HARDWARE_PROPERTIES_SERVICE);

                if (hpManager != null) {
                    // DEVICE_TEMPERATURE_SKIN 代表设备表面温度（通常包含屏幕）
                    // TEMPERATURE_CURRENT 代表获取当前实时温度
                    float[] temps = hpManager.getDeviceTemperatures(
                            HardwarePropertiesManager.DEVICE_TEMPERATURE_SKIN,
                            HardwarePropertiesManager.TEMPERATURE_CURRENT
                    );

                    // 有些设备可能有多个皮肤温度传感器，我们取第一个
                    if (temps != null && temps.length > 0) {
                        // 过滤掉未定义的温度常量
                        if (temps[0] != HardwarePropertiesManager.UNDEFINED_TEMPERATURE) {
                            return temps[0];
                        }
                    }
                    return -1; // 传感器不存在
                }
            } catch (Exception e) {
                // 普通App在这里会抛出 SecurityException: ... requires android.permission.DEVICE_POWER
                Log.e(TAG, "获取屏幕温度失败，通常是因为没有系统级权限", e);
                return -999; // 用特殊代码标记权限错误
            }
        } else {
            Log.w(TAG, "Android 版本低于 9.0，不支持 HardwarePropertiesManager");
        }
        return -1;
    }
}
