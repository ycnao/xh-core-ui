package com.xcore.ui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;

import com.xcore.ui.app.JConstants;
import com.xcore.ui.event.BatteryEvent;
import com.xcore.ui.utils.BatteryUtil;
import com.xcore.ui.utils.CpuUtil;

import org.greenrobot.eventbus.EventBus;


/**
 * 电池监听器
 */
public class BatteryReceiver extends BroadcastReceiver {

    private float batteryVal = 16f;

    //45℃：偏热
    //50~55℃：明显发热
    //55~60℃：建议报警
    //65℃以上：系统会自动降频 / 关机
    private static final float OVERHEAT = 55.0f;
    //    private static final float OVERHEAT = 63.0f;
    private static int tempCount = 0;

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BATTERY_CHANGED.equals(intent.getAction())) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
            float batteryPct = level / (float) scale;
            float battery = batteryPct * 100;
            //cpu
            int cpu = CpuUtil.getCpuTemp();
            float temp = BatteryUtil.getBatteryTemp(context);
            //缓存
            JConstants.REMOTE_CPU_TEMP = cpu;
            JConstants.REMOTE_BATTER_TEMP = temp;
            JConstants.REMOTE_BATTER_VAL = battery;

//            Log.d("BatteryLevel", "Battery: " + battery + " temp: " + temp + " cpu: " + cpu);
            if (batteryVal != battery) {
                if (batteryVal <= 15) {
                    batteryVal = battery;
                    EventBus.getDefault().post(new BatteryEvent(1, battery, temp, cpu));
                } else {
                    EventBus.getDefault().post(new BatteryEvent(0, battery, temp, cpu));
                }
            }
            //高温报警
            if (temp >= OVERHEAT) {
                if (tempCount == 0) {
                    EventBus.getDefault().post(new BatteryEvent(20, battery, temp, cpu));
                }
                tempCount++;
                if (tempCount == 120) {
                    tempCount = 0;
                }
            }
        }
    }
}
