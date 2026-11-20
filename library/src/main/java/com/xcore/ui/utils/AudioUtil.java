package com.xcore.ui.utils;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.provider.Settings;

import com.xcore.ui.R;

public class AudioUtil {

    public static void toSoundActivity(Context context) {
        Intent intent = new Intent(Settings.ACTION_SOUND_SETTINGS);
        context.startActivity(intent);
    }

    /**
     * 获取媒体音量
     */
    public static String currentVolume(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService(Context.AUDIO_SERVICE);
        int currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        float volumePercent = (float) currentVolume / maxVolume; // 计算百分比
        float volume = volumePercent * 100;
        return (int) volume + "";
    }

    /**
     * 截图的咔嚓声
     *
     * @param context
     */
    public static void playCaptureSound(Context context) {
        playSound(context, R.raw.capture);
    }

    //左耳道音量【0~1】
    //右耳道音量【0~1】
    //播放优先级【0表示最低优先级】
    //循环模式【0表示循环一次，-1表示一直循环，其他表示数字+1表示当前数字对应的循环次数】
    //播放速度【1是正常，范围从0~2】
    public static void playSound(Context context, int resId) {
        SoundPool soundPool = new SoundPool.Builder().build();
//        val soundPool =  SoundPool(MAX_SOUND_NUMBERS, AudioManager.STREAM_MUSIC, 1);
        int soundId = soundPool.load(context, resId, 1);
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                try {
                    Thread.sleep(300); // 给予初始化音乐文件足够时间
                    //声音id, 左声道, 右声道, 优先级, 0表示不循环，-1表示循环播放, 播放比率，0.5~2，一般为1
                    soundPool.play(soundId, 1f, 1f, 1, 0, 1F);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}
