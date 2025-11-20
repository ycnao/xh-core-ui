package com.xzero.core.ui.widget.listview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ListView

/**
 * ScrollView嵌套ListView后，可能会导致 ListView显示不全
 * author: Created by 闹闹 on 2018-10-15
 * version: 1.0.0
 */
class MuListView : ListView {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val newHeightSpec = View.MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE shr 2, View.MeasureSpec.AT_MOST)
        super.onMeasure(widthMeasureSpec, newHeightSpec)
    }
}