package com.xcore.ui.helper;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.speech.tts.TextToSpeech;
import android.util.Log;

import java.util.List;
import java.util.Locale;

public class TTSHelper {

    private TextToSpeech tts;
    private Context context;

    public TTSHelper(Context context) {
        this.context = context;
        initTTS();
    }

    private void initTTS() {
        tts = new TextToSpeech(context, status -> {
            if (status == TextToSpeech.SUCCESS) {
                // 设置默认语言为中文
                int result = tts.setLanguage(Locale.CHINA);
                if (result == TextToSpeech.LANG_MISSING_DATA ||
                        result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Log.e("TTS", "语言不支持");
                }
            } else {
                Log.e("TTS", "初始化失败");
            }
        });
    }

    public void speak(String text) {
        if (tts != null) {
            // 设置语速（0.0-1.0）和音调（0.0-1.0）
            tts.setSpeechRate(1.0f);
            tts.setPitch(1.0f);
            tts.speak(text, TextToSpeech.QUEUE_FLUSH, null, null);
        }
    }

    public void shutdown() {
        if (tts != null) {
            tts.stop();
            tts.shutdown();
        }
    }

    public static void startTtsActivity(Context context) {
        Intent intent = new Intent();
        intent.setAction("com.android.settings.TTS_SETTINGS");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    /**
     * 查询系统中已安装/可用的TTS引擎列表
     */
    public static void queryAvailableTtsEngines(Context context) {
        PackageManager packageManager = context.getPackageManager();
        // 构建查询TTS数据的Intent
        Intent ttsCheckIntent = new Intent(TextToSpeech.Engine.ACTION_CHECK_TTS_DATA);

        // 方式1：通过PackageManager查询所有支持TTS的应用（简单直接）
        List<ResolveInfo> ttsEngineResolveInfos = packageManager.queryIntentActivities(
                ttsCheckIntent, PackageManager.MATCH_DEFAULT_ONLY
        );

        if (ttsEngineResolveInfos != null && !ttsEngineResolveInfos.isEmpty()) {
            Log.d("TAG", "查询到可用TTS引擎数量：" + ttsEngineResolveInfos.size());
            for (ResolveInfo resolveInfo : ttsEngineResolveInfos) {

                if (resolveInfo.activityInfo != null) {
                    // 引擎包名（唯一标识）
                    String enginePackageName = resolveInfo.activityInfo.packageName;
                    // 引擎应用名称（显示给用户）
                    String engineAppName = resolveInfo.loadLabel(packageManager).toString();
                    // 引擎图标（可选）

                    Log.d("TTSHelper", "TTS引擎包名：" + enginePackageName);
                    Log.d("TTSHelper", "TTS引擎名称：" + engineAppName);
                    Log.d("TTSHelper", "------------------------");
                }
            }
        } else {
            Log.w("TTSHelper", "未查询到可用的TTS引擎，系统可能未安装相关应用");
        }
    }
}
