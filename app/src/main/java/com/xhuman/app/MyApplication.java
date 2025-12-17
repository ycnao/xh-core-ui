package com.xhuman.app;

import android.app.Application;
import android.content.Context;


/**
 * MyApplication
 * author: Created by 闹闹 on 2019/7/10
 * version: 1.0.0
 */
public class MyApplication extends Application {

    public static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this;
    }

}
