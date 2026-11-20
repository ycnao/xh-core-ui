package com.xcore.ui.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.widget.Toast;

import java.math.BigInteger;

public class Util {

    private static final int RADIX = 16;
    private static final String SEED = "0933910847463829232312312";

    private static Toast m_toast = null;

    public static void showLongToast(Context context, String tip) {
        if (m_toast != null) {
            m_toast.cancel();
        }
        m_toast = Toast.makeText(context, tip, Toast.LENGTH_LONG);
        m_toast.show();
    }


    public static void showShortToast(Context context, String tip) {
        if (m_toast != null) {
            m_toast.cancel();
        }
        m_toast = Toast.makeText(context, tip, Toast.LENGTH_SHORT);
        m_toast.show();
    }

    public static void cancelToast() {
        if (m_toast != null) {
            m_toast.cancel();
        }
    }

    /**
     * dp转px工具方法
     */
    public static int dp2px(Context context, float dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dp * density + 0.5f);
    }

    /**
     * 秒转成时分秒
     *
     * @param milliseconds
     * @return
     */
    public static String formatTime(long milliseconds) {
        long seconds = milliseconds / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        seconds = seconds % 60;
        minutes = minutes % 60;
        return String.format("%02d:%02d:%02d", hours, seconds, minutes);
    }


    /**
     * 加密
     *
     * @param data
     * @return
     */
    public static String encrypt(String data) {
        if (data == null)
            return "";
        if (data.length() == 0)
            return "";

        BigInteger bi_passwd = new BigInteger(data.getBytes());

        BigInteger bi_r0 = new BigInteger(SEED);
        BigInteger bi_r1 = bi_r0.xor(bi_passwd);

        return bi_r1.toString(RADIX);
    }

    /**
     * 解密
     *
     * @param data
     * @return
     */
    public static String decrypt(String data) {
        if (data == null)
            return "";
        if (data.length() == 0)
            return "";

        BigInteger bi_confuse = new BigInteger(SEED);

        BigInteger bi_r1 = new BigInteger(data, RADIX);
        BigInteger bi_r0 = bi_r1.xor(bi_confuse);

        return new String(bi_r0.toByteArray());
    }

    public static boolean isNetworkAvailable(Context context) {
        try {
            ConnectivityManager cm = (ConnectivityManager) context.getApplicationContext()
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            if (cm == null) return false;
            NetworkCapabilities caps = cm.getNetworkCapabilities(cm.getActiveNetwork());
            return caps != null && caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET);
        } catch (Exception e) {
            return false;
        }
    }
}
