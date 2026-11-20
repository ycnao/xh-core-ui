package com.xcore.ui.crash;

import android.content.Context;
import android.os.Build;
import android.util.Log;

import com.xcore.ui.utils.Util;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * 崩溃日志邮件发送（QQ邮箱 SMTP 静默发送，无需用户操作）
 * <p>
 * ★★ 使用前必须先获取 QQ 邮箱"授权码"（不是QQ密码！）★★
 * 步骤：
 * 1. 电脑/手机登录 QQ邮箱网页版 mail.qq.com
 * 2. 设置 → 账户 → 找到「POP3/IMAP/SMTP服务」→ 开启「IMAP/SMTP服务」
 * 3. 按提示用密保手机发短信，会得到一个 16 位授权码
 * 4. 填到下面 SMTP_AUTH_CODE
 */
public final class CrashMailSender {

    private static final String TAG = "CrashMailSender";

    private static String TO_EMAIL = "";
    private static String FROM_EMAIL = "";
    private static String SMTP_AUTH_CODE = ""; // QQ邮箱的auth code

    private static final int SMTP_PORT = 465; // SSL
    private static final String SMTP_HOST = "smtp.qq.com";

    private CrashMailSender() {
    }

    public static void initReport(Context context, String authCode) {
        FROM_EMAIL = "1050104186@qq.com";
        TO_EMAIL = "1050104186@qq.com";
        SMTP_AUTH_CODE = authCode;
        sendReports(context);
    }

    public static void initReport(Context context, String toEmail, String authCode) {
        FROM_EMAIL = "1050104186@qq.com";
        TO_EMAIL = toEmail;
        SMTP_AUTH_CODE = authCode;
        sendReports(context);
    }

    public static void initReport(Context context, String formEmail, String toEmail, String authCode) {
        FROM_EMAIL = formEmail;
        TO_EMAIL = toEmail;
        SMTP_AUTH_CODE = authCode;
        sendReports(context);
    }

    /**
     * 启动时补发历史崩溃日志（自动开子线程，不阻塞主线程）
     * 发送成功 → 删除本地文件；失败 → 保留，下次启动重试
     */
    public static void sendReports(Context context) {
        File dir = CrashCatcher.getCrashDir(context);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) return;

        if (!Util.isNetworkAvailable(context)) {
            Log.i(TAG, "当前无网络，跳过补发，下次启动再试");
            return;
        }

        new Thread(() -> {
            Arrays.sort(files, Comparator.comparingLong(File::lastModified));
            for (File file : files) {
                try {
                    send(file);
                    if (file.delete()) {
                        Log.i(TAG, "崩溃日志已发送并删除: " + file.getName());
                    }
                } catch (Exception e) {
                    Log.w(TAG, "发送失败，保留文件下次重试: " + file.getName(), e);
                    break; // 一个失败大概率是网络/授权码问题，后面的不必再试
                }
            }
        }, "crash-mail-sender").start();
    }

    /**
     * 发送单份崩溃日志（阻塞方法，必须在子线程调用）
     */
    public static void send(File crashFile) throws Exception {
        Properties props = new Properties();
        props.put("mail.smtp.host", SMTP_HOST);
        props.put("mail.smtp.port", String.valueOf(SMTP_PORT));
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.enable", "true"); // QQ邮箱必须开 SSL
        props.put("mail.smtp.connectiontimeout", "10000");
        props.put("mail.smtp.timeout", "15000");
        props.put("mail.smtp.writetimeout", "15000");

        Session session = Session.getInstance(props, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, SMTP_AUTH_CODE);
            }
        });

        MimeMessage msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress(FROM_EMAIL, "崩溃收集助手", "UTF-8"));
        msg.setRecipient(Message.RecipientType.TO, new InternetAddress(TO_EMAIL));
        msg.setSubject("【APP崩溃】" + Build.MODEL + " " + crashFile.getName(), "UTF-8");
        msg.setSentDate(new Date());

        // 崩溃日志全文作为邮件正文
        MimeBodyPart body = new MimeBodyPart();
        body.setText(readFileAsString(crashFile), "UTF-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(body);
        msg.setContent(multipart);

        Transport.send(msg);
    }

    private static String readFileAsString(File file) throws Exception {
        InputStream in = new FileInputStream(file);
        try {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[4096];
            int len;
            while ((len = in.read(buf)) > 0) out.write(buf, 0, len);
            return out.toString("UTF-8");
        } finally {
            try {
                in.close();
            } catch (Exception ignored) {
            }
        }
    }
}
