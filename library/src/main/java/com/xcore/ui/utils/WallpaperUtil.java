package com.xcore.ui.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 系统壁纸设置工具类
 */
public class WallpaperUtil {

    private Context mContext;
    private WallpaperManager mWallpaperManager;

    public WallpaperUtil(Context context) {
        this.mContext = context.getApplicationContext();
        // 获取系统壁纸管理实例
        mWallpaperManager = WallpaperManager.getInstance(mContext);
    }

    /**
     * 设置 drawable 资源为壁纸（如 R.drawable.bg_test）
     *
     * @param resId         图片资源ID
     * @param wallpaperType 壁纸类型：0-桌面 1-锁屏 2-两者（Android 8.0+）
     */
    @SuppressLint("MissingPermission")
    public void setWallpaperFromResource(int resId, int wallpaperType) {
        try {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                // Android 8.0+ 支持指定壁纸类型
                switch (wallpaperType) {
                    case 0: // 仅桌面
                        mWallpaperManager.setResource(resId, WallpaperManager.FLAG_SYSTEM);
                        break;
                    case 1: // 仅锁屏
                        mWallpaperManager.setResource(resId, WallpaperManager.FLAG_LOCK);
                        break;
                    case 2: // 桌面+锁屏
                        mWallpaperManager.setResource(resId);
                        break;
                }
            } else {
                // 低版本只能设置桌面壁纸
                mWallpaperManager.setResource(resId);
            }
            Toast.makeText(mContext, "壁纸设置成功", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "壁纸设置失败：" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 2. 设置本地文件图片为壁纸（如 /sdcard/test.jpg）
     *
     * @param filePath 图片文件路径
     */
    public void setWallpaperFromFile(String filePath) {
        File imageFile = new File(filePath);
        if (!imageFile.exists()) {
            Toast.makeText(mContext, "图片文件不存在", Toast.LENGTH_SHORT).show();
            return;
        }

        // 解码本地图片为 Bitmap
        Bitmap bitmap = BitmapFactory.decodeFile(filePath);
        if (bitmap == null) {
            Toast.makeText(mContext, "图片解码失败", Toast.LENGTH_SHORT).show();
            return;
        }

        setWallpaperFromBitmap(bitmap);
    }

    /**
     * 3. 设置网络图片为壁纸（需在子线程调用）
     *
     * @param imageUrl 网络图片URL
     */
    public void setWallpaperFromUrl(String imageUrl) {
        new Thread(() -> {
            try {
                // 下载网络图片
                URL url = new URL(imageUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(5000);
                conn.setReadTimeout(5000);
                if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                    InputStream is = conn.getInputStream();
                    Bitmap bitmap = BitmapFactory.decodeStream(is);
                    is.close();
                    // 主线程设置壁纸
                    ((Activity) mContext).runOnUiThread(() -> setWallpaperFromBitmap(bitmap));
                } else {
                    ((Activity) mContext).runOnUiThread(() -> {
                        try {
                            Toast.makeText(mContext, "图片下载失败：" + conn.getResponseCode(), Toast.LENGTH_SHORT).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
                }
            } catch (Exception e) {
                e.printStackTrace();
                ((Activity) mContext).runOnUiThread(() ->
                        Toast.makeText(mContext, "网络图片设置失败：" + e.getMessage(), Toast.LENGTH_SHORT).show()
                );
            }
        }).start();
    }

    /**
     * 通用方法：设置 Bitmap 为壁纸
     */
    @SuppressLint("MissingPermission")
    private void setWallpaperFromBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            Toast.makeText(mContext, "Bitmap 为空", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            mWallpaperManager.setBitmap(bitmap);
            Toast.makeText(mContext, "壁纸设置成功", Toast.LENGTH_SHORT).show();
            // 回收 Bitmap，释放内存
            if (!bitmap.isRecycled()) {
                bitmap.recycle();
            }
        } catch (IOException e) {
            e.printStackTrace();
            Toast.makeText(mContext, "壁纸设置失败：" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    /**
     * 获取当前系统壁纸（可选）
     */
//    public Bitmap getCurrentWallpaper() {
//        try {
//            WallpaperInfo wallpaperInfo = mWallpaperManager.getWallpaperInfo();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
}
