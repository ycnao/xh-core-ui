package com.xcore.ui.helper;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

/**
 * 静默通知工具类：不可点击、不弹窗、不震动、无声音
 */
public class NotificationHelper {

    // 固定通知ID
    public static final int NOTIFICATION_ID = 1002;
    // 渠道ID（建议命名为silent_channel）
    private static final String CHANNEL_ID = "silent_notification_channel";
    private static final String CHANNEL_NAME = "静默通知渠道";

    private Context mContext;

    public NotificationHelper(Context context) {
        this.mContext = context;
        createSilentChannel();
    }

    /**
     * 创建静默渠道
     * 关键：IMPORTANCE_LOW 或 IMPORTANCE_MIN，不弹窗
     */
    private void createSilentChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // 重要性设置为 LOW：不会在屏幕顶部弹出横幅，只会在通知栏出现
            // 如果设置为 IMPORTANCE_MIN：甚至在通知栏都可能被折叠在“静默通知”分组里
            int importance = NotificationManager.IMPORTANCE_LOW;

            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, importance);
            channel.setDescription("用于展示后台运行状态，不打扰用户");
            channel.enableVibration(false); // 关闭震动
            channel.setSound(null, null);   // 关闭声音
            channel.setShowBadge(false);    // 不在App图标上显示角标数字

            NotificationManager notificationManager = (NotificationManager) mContext.getSystemService(Context.NOTIFICATION_SERVICE);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(channel);
            }
        }
    }

    /**
     * 更新静默通知
     *
     * @param title   标题
     * @param content 内容
     */
    public void updateNotification(String title, String content) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(mContext, CHANNEL_ID)
                .setSmallIcon(android.R.mipmap.sym_def_app_icon) // 必须设置图标
                .setContentTitle(title)
                .setContentText(content)
                // 1. 不设置 setContentIntent -> 通知不可点击
                // 2. 设置优先级为 MIN/LOW -> 不弹窗
                .setPriority(NotificationCompat.PRIORITY_LOW)
                // 3. 强制关闭震动和声音
                .setVibrate(new long[0])
                .setSound(null)
                // 4. 设置是否常驻
                .setOngoing(true)
                // 5. 关闭通知灯
                .setLights(0, 0, 0);

        // 发送/更新
        NotificationManagerCompat.from(mContext).notify(NOTIFICATION_ID, builder.build());
    }

    /**
     * 取消通知
     */
    public void cancel() {
        NotificationManagerCompat.from(mContext).cancel(NOTIFICATION_ID);
    }
}