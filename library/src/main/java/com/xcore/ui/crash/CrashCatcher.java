package com.xcore.ui.crash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.Log;

import com.xcore.ui.R;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/**
 * 闪退捕获工具
 * 崩溃时把堆栈+设备信息写入 filesDir/crash/，下次启动由 CrashMailSender 补发
 */
public final class CrashCatcher implements Thread.UncaughtExceptionHandler {

    private static final String TAG = "CrashCatcher";
    private static final String CRASH_DIR_NAME = "crash";
    private static final int MAX_KEEP_FILES = 20;        // 本地最多保留20份，防占满存储
    private static final long DEDUP_INTERVAL = 30_000;   // 30秒内相同堆栈只存一份，防启动即崩无限刷文件

    private static volatile CrashCatcher sInstance;

    private final Context mContext;
    private final String mAppName;
    private final Thread.UncaughtExceptionHandler mDefaultHandler;
    private int mLastStackHash;
    private long mLastSaveTime;

    private CrashCatcher(Context context, String appName) {
        mAppName = appName;
        mContext = context.getApplicationContext();
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    }

    /**
     * 在 Application.onCreate() 中调用
     */
    public static void install(Context context, String appName) {
        if (sInstance == null) {
            synchronized (CrashCatcher.class) {
                if (sInstance == null) {
                    sInstance = new CrashCatcher(context, appName);
                    Thread.setDefaultUncaughtExceptionHandler(sInstance);
                    Log.i(TAG, "CrashCatcher 已安装");
                }
            }
        }
    }

    /**
     * 获取崩溃日志目录
     */
    public static File getCrashDir(Context context) {
        return new File(context.getApplicationContext().getFilesDir(), CRASH_DIR_NAME);
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        try {
            saveCrash(thread, throwable);
        } catch (Throwable ignored) {
            // 保存时再崩就不管了，保证退出流程正常
        }
        // 必须交还系统默认处理器：保留"应用已停止"弹窗等原有行为
        if (mDefaultHandler != null) {
            mDefaultHandler.uncaughtException(thread, throwable);
        }
    }

    // ==================== 崩溃信息落盘 ====================

    private void saveCrash(Thread thread, Throwable throwable) throws Exception {
        String stack = getStackTrace(throwable);
        long now = System.currentTimeMillis();

        // 30秒内相同堆栈不重复存，防止崩溃循环生成大量文件
        int hash = stack.hashCode();
        if (hash == mLastStackHash && now - mLastSaveTime < DEDUP_INTERVAL) return;
        mLastStackHash = hash;
        mLastSaveTime = now;

        File dir = getCrashDir(mContext);
        if (!dir.exists()) dir.mkdirs();

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        File file = new File(dir, "crash_"
                + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date()) + ".txt");

        StringBuilder sb = new StringBuilder();
        sb.append("======== APP 崩溃报告 ========\n")
                .append("APP产品 : ").append(mAppName).append('\n')
                .append("崩溃时间 : ").append(fmt.format(new Date())).append('\n')
                .append("手机型号 : ").append(Build.MANUFACTURER).append(' ').append(Build.MODEL).append('\n')
                .append("系统版本 : Android ").append(Build.VERSION.RELEASE)
                .append(" (API ").append(Build.VERSION.SDK_INT).append(")\n")
                .append("APP 版本 : ").append(getAppVersion()).append('\n')
                .append("崩溃线程 : ").append(thread.getName()).append('\n')
                .append("\n======== 崩溃堆栈 ========\n")
                .append(stack);

        FileWriter fw = new FileWriter(file);
        fw.write(sb.toString());
        fw.flush();
        fw.close();

        trimOldFiles(dir);
        Log.e(TAG, "崩溃日志已保存: " + file.getAbsolutePath());
    }

    private static String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        t.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    private String getAppVersion() {
        try {
            PackageInfo pi = mContext.getPackageManager()
                    .getPackageInfo(mContext.getPackageName(), 0);
            return pi.versionName + " (" + pi.versionCode + ")";
        } catch (Exception e) {
            return "unknown";
        }
    }

    /**
     * 超出上限时删除最旧的
     */
    private static void trimOldFiles(File dir) {
        File[] files = dir.listFiles();
        if (files == null || files.length <= MAX_KEEP_FILES) return;
        Arrays.sort(files, Comparator.comparingLong(File::lastModified));
        for (int i = 0; i < files.length - MAX_KEEP_FILES; i++) {
            files[i].delete();
        }
    }
}