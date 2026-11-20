package com.xcore.ui.utils;

import android.os.Environment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * author：created by 闹闹 on 2025/10/30
 * version：v1.0.0
 */
public class FileUtil {


    public static String toPath(String path) {
        return Environment.getExternalStorageDirectory().toString() + "/" + path;
    }

    public static String zipPath(String path) {
        return Environment.getExternalStorageDirectory().toString() + "/" + path + "h12_install_data.zip";
    }

    public static String destFolderPath(String path) {
        return Environment.getExternalStorageDirectory().toString() + "/" + path;
    }



    public static String toSizeInKB(String filePath) {
        File file = new File(filePath);
        long sizeInBytes = file.length();
        double sizeInKB = (double) (sizeInBytes / 1024);
        return sizeInKB + "KB";
    }

    // 原代码中被调用的 get_album_folder 方法，若已有实现可删除此占位
    private static String get_album_folder(String format) {
        // 请补充原项目中的实现逻辑
        return "";
    }

    public static void unzipFile(String path) {
        unzipFile(zipPath(path), destFolderPath(path));
    }

    public static void unzipFile(String zipFilePath, String destinationFolderPath) {
        try {
            File destDir = new File(destinationFolderPath);
            byte[] buffer = new byte[1024];

            if (!destDir.exists()) {
                destDir.mkdirs();
            }

            ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
            ZipEntry entry = zipIn.getNextEntry();

            while (entry != null) {
                String filePath = destinationFolderPath + entry.getName();
                if (entry.isDirectory()) {
                    File dir = new File(filePath);
                    dir.mkdirs();
                } else {
                    FileOutputStream fos = new FileOutputStream(filePath);
                    int len;
                    while ((len = zipIn.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();
                }
                zipIn.closeEntry();
                entry = zipIn.getNextEntry();
            }
            zipIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
