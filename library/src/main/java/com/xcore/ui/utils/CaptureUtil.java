package com.xcore.ui.utils;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import android.widget.ScrollView;

public class CaptureUtil {

    /**
     * 截取当前可见范围屏幕
     */
    public static Bitmap screenCapture(Activity activity) {
//        View decorView = getWindow().getDecorView();
//        decorView.setDrawingCacheEnabled(true);// 清空缓存，可用于实时截图
//        decorView.buildDrawingCache();
//        Bitmap screenBitmap = Bitmap.createBitmap(decorView.getDrawingCache());
//        decorView.setDrawingCacheEnabled(false); // 清空缓存，可用于实时截图

        View decorView = activity.getWindow().getDecorView();
        Bitmap screenBitmap = Bitmap.createBitmap(decorView.getWidth(), decorView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(screenBitmap);
        decorView.draw(canvas);
        return screenBitmap;
    }

    /**
     * 截取某个控件
     *
     * @param view
     */
    public static Bitmap screenCapture(View view) {
        Bitmap screenBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(screenBitmap);
        view.draw(canvas);
        return screenBitmap;
    }

    /**
     * 截取ScrollView
     *
     * @param view
     */
    public static Bitmap screenCapture(ScrollView view) {
        int h = 0;
        for (int i = 0; i < view.getChildCount(); i++) {
            h += view.getChildAt(i).getHeight();
            view.getChildAt(i).setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        Bitmap screenBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), h, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(screenBitmap);
        view.draw(canvas);
        return screenBitmap;
    }

    /**
     * 截取当前可见范围屏幕（不包含状态栏）
     */
    public static Bitmap screenCaptureNoStatusBar(Activity activity) {
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();

        // 获取状态栏高度
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int statusBarH = rect.top;
        // 获取屏幕宽高
        int w = view.getWidth();
        int h = view.getHeight();

        // 去掉状态栏
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache(), 0, statusBarH, w, h - statusBarH);
        // 销毁缓存信息
        view.destroyDrawingCache();
        return bitmap;
    }
}
