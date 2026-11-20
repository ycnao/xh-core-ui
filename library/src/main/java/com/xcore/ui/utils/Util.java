package com.xcore.ui.utils;

import android.content.Context;

public class Util {

    /**
     * dp转px工具方法
     */
    public static int dp2px(Context context, float dp) {
        float density = context.getResources().getDisplayMetrics().density;
        return (int) (dp * density + 0.5f);
    }
}
