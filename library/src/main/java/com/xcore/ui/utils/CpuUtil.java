package com.xcore.ui.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 电池工具类
 */
public class CpuUtil {

    private static final String TAG = "TempHelper";

    /**
     * 获取CPU温度
     *
     * @return 温度值（摄氏度），如果读取失败返回 -1
     */
    public static int getCpuTemp() {
        // 常见的CPU温度节点路径（需要根据具体设备调整）
        String[] thermalPaths = {
                "/sys/class/thermal/thermal_zone0/temp",
                "/sys/class/thermal/thermal_zone1/temp",
                "/sys/class/thermal/thermal_zone2/temp",
                "/sys/class/thermal/thermal_zone3/temp",
                "/sys/class/thermal/thermal_zone4/temp",
                "/sys/class/thermal/thermal_zone5/temp",
                "/sys/class/hwmon/hwmon0/temp1_input", // 某些模拟器或特定主板
                "/sys/devices/virtual/thermal/thermal_zone0/temp"
        };

        for (String path : thermalPaths) {
            File file = new File(path);
            if (file.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line = reader.readLine();
                    if (line != null) {
                        float temp = Float.parseFloat(line.trim());
                        // 大部分设备返回的是毫摄氏度（如 45000 表示 45.0℃）
                        // 少数设备直接返回摄氏度（如 45）
                        if (temp > 1000) {
                            return (int) (temp / 1000);
                        } else {
                            return (int) temp;
                        }
                    }
                } catch (Exception e) {
                    // 权限不足或读取错误，继续尝试下一个路径
                    e.printStackTrace();
                }
            }
        }
        return -1; // 所有路径都读取失败
    }
}
