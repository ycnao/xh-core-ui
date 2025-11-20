package com.xcore.ui.widget.dialog

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Context
import android.widget.TextView
import java.util.*

/**
 *
 * author: Created by 闹闹 on 2018-09-23
 * version: 1.0.0
 */
class JDateDialog(val context: Context) {

    interface DateCallback {

        fun selectDate(year: Int, month: Int, day: Int)
    }

    /**
     * 时间选择
     */
    fun showTimePickerDialog(themeResId: Int, textView: TextView, calendar: Calendar) {
        // Calendar c = Calendar.instance();
        // 创建一个TimePickerDialog实例，并把它显示出来
        // 解释一哈，Activity是context的子类
        TimePickerDialog(
            context, themeResId, { _, hourOfDay, minute ->
                // 绑定监听器
                val hourLength = hourOfDay.toString().length
                val minuteLength = minute.toString().length
                val hour = if (hourLength == 1) {
                    "0$hourOfDay"
                } else {
                    "$hourOfDay"
                }
                val min = if (minuteLength == 1) {
                    "0$minute"
                } else {
                    "$minute"
                }
                textView.text = ("$hour:$min")
            },
            // 设置初始时间
            calendar.get(Calendar.HOUR_OF_DAY),
            calendar.get(Calendar.MINUTE),
            // true表示采用24小时制
            true
        ).show()
    }


    /**
     * 日期选择
     * @param themeResId
     * @param textView
     * @param calendar
     */
    @SuppressLint("SetTextI18n")
    fun showDatePickerDialog(themeResId: Int, textView: TextView, calendar: Calendar) {
        // 直接创建一个DatePickerDialog对话框实例，并将它显示出来
        DatePickerDialog(
            context, themeResId, { _, year, monthOfYear, dayOfMonth ->
                // 绑定监听器(How the parent is notified that the date is set.)
                // 此处得到选择的时间，可以进行你想要的操作
                textView.text = ("$year-${(monthOfYear + 1)}-$dayOfMonth")
            },
            // 设置初始日期
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        ).show()
    }

    fun showDatePickerDialog(themeResId: Int, calendar: Calendar, callback: DateCallback) {
        // 直接创建一个DatePickerDialog对话框实例，并将它显示出来
        DatePickerDialog(
            context, themeResId, { _, year, monthOfYear, dayOfMonth ->
                // 绑定监听器(How the parent is notified that the date is set.)
                // 此处得到选择的时间，可以进行你想要的操作
                callback.selectDate(year, (monthOfYear + 1), dayOfMonth)
            },
            // 设置初始日期
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DAY_OF_MONTH)
        ).show()
    }
}
