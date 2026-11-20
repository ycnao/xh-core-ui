package com.xcore.ui.http.util;

import android.util.Log;

public class LogUtils {

    public static String code(String rep) {
        if (rep.equals("OK")) return "200";
        else return "500";
    }

    public static void error(String info) {
        d("请求服务端失败返回jsonData", info);
    }

    public static void success(String info) {
        d("请求服务端成功返回jsonData", info);
    }

    public static void d(String tag, String msg) {  //信息太长,分段打印
        //因为String的length是字符数量不是字节数量所以为了防止中文字符过多，
        //  把4*1024的MAX字节打印长度改为2001字符数
        int max_str_length = 2001 - tag.length();
        //大于4000时
        while (msg.length() > max_str_length) {
            Log.i(tag, msg.substring(0, max_str_length));
            msg = msg.substring(max_str_length);
        }
        //剩余部分
        Log.i(tag, msg);
    }
}

