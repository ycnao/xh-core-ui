package com.xhuman.app;

import android.content.Context;

import androidx.multidex.MultiDex;

import com.xcore.core.libs.JApplication;

/**
 * MyApplication
 * author: Created by 闹闹 on 2019/7/10
 * version: 1.0.0
 */
public class MyApplication extends JApplication {

    private static MyApplication instance;
    public static Context applicationContext;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onCreate() {
        MultiDex.install(this);
        super.onCreate();
        instance = this;
        applicationContext = this;
        init();
    }

    public static MyApplication instance() {
        return instance;
    }

    public void init() {
//        SerialHandler.init(this, JxConstants.SPORT_NAME_1, 921600);

    }
}
