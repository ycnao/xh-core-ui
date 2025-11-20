package com.xcore.ui.widget.gridview

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View
import android.widget.AdapterView
import android.widget.GridView

/**
 * 自适应高度
 * author: Created by 闹闹 on 2018-10-15
 * version: 1.0.0
 */
class ActionGridView : GridView {

    private var onTouchInvalidPositionListener: OnTouchInvalidPositionListener? = null

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val expandSpec =
            View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE shr 2, View.MeasureSpec.AT_MOST)
        super.onMeasure(widthMeasureSpec, expandSpec)
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        //先创建一个监听接口，一旦点击了无效区域，便实现onTouchInvalidPosition方法，返回true or false来确认是否消费了这个事件
        if (onTouchInvalidPositionListener != null) {
            if (!isEnabled) {
                return isClickable || isLongClickable
            }
            val motionPosition = pointToPosition(ev.x.toInt(), ev.y.toInt())
            if (ev.action == MotionEvent.ACTION_UP && motionPosition == AdapterView.INVALID_POSITION) {
                super.onTouchEvent(ev)
                return onTouchInvalidPositionListener!!.onTouchInvalidPosition(motionPosition)
            }
        }
        return super.onTouchEvent(ev)
    }

    fun setOnTouchInvalidPositionListener(onTouchInvalidPositionListener: OnTouchInvalidPositionListener) {
        this.onTouchInvalidPositionListener = onTouchInvalidPositionListener
    }

    interface OnTouchInvalidPositionListener {
        fun onTouchInvalidPosition(motionEvent: Int): Boolean
    }
}