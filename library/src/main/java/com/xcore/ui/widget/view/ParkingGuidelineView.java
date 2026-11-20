package com.xcore.ui.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class ParkingGuidelineView extends View {

    private Paint mPaint;
    private int mViewWidth;
    private int mViewHeight;

    // 颜色配置（与图片一致）
    private final int COLOR_RED = Color.parseColor("#FF3333");
    private final int COLOR_YELLOW = Color.parseColor("#FFFF00");
    private final int COLOR_GREEN = Color.parseColor("#33FF33");
    private final float LINE_WIDTH = 8f; // 线条宽度

    // 辅助线分段参数
    private final float SEGMENT_LENGTH = 60f; // 每段线段长度
    private final float SEGMENT_GAP = 10f;   // 段与段之间的间距

    public ParkingGuidelineView(Context context) {
        this(context, null);
    }

    public ParkingGuidelineView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ParkingGuidelineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setStrokeWidth(LINE_WIDTH);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mViewWidth = w;
        mViewHeight = h;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (mViewWidth == 0 || mViewHeight == 0) return;

        // 绘制左右两条辅助线
        drawLeftGuideline(canvas);
        drawRightGuideline(canvas);
    }

    /**
     * 绘制左侧辅助线
     */
    private void drawLeftGuideline(Canvas canvas) {
        float startX = mViewWidth * 0.2f; // 左侧起始X位置
        float startY = mViewHeight * 0.8f; // 底部起始Y位置

        // 红色段（两段L形）
        mPaint.setColor(COLOR_RED);
        // 第一段L形
        canvas.drawLine(startX, startY, startX, startY - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, startY - SEGMENT_LENGTH, startX + SEGMENT_LENGTH, startY - SEGMENT_LENGTH, mPaint);
        // 第二段L形
        float y1 = startY - SEGMENT_LENGTH - SEGMENT_GAP;
        canvas.drawLine(startX, y1, startX, y1 - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, y1 - SEGMENT_LENGTH, startX + SEGMENT_LENGTH, y1 - SEGMENT_LENGTH, mPaint);

        // 黄色段
        mPaint.setColor(COLOR_YELLOW);
        float y2 = y1 - SEGMENT_LENGTH - SEGMENT_GAP;
        canvas.drawLine(startX, y2, startX, y2 - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, y2 - SEGMENT_LENGTH, startX + SEGMENT_LENGTH, y2 - SEGMENT_LENGTH, mPaint);

        // 绿色段
        mPaint.setColor(COLOR_GREEN);
        float y3 = y2 - SEGMENT_LENGTH - SEGMENT_GAP;
        canvas.drawLine(startX, y3, startX, y3 - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, y3 - SEGMENT_LENGTH, startX + SEGMENT_LENGTH, y3 - SEGMENT_LENGTH, mPaint);
    }

    /**
     * 绘制右侧辅助线（与左侧对称）
     */
    private void drawRightGuideline(Canvas canvas) {
        float startX = mViewWidth * 0.8f; // 右侧起始X位置
        float startY = mViewHeight * 0.8f; // 底部起始Y位置

        // 红色段（两段L形）
        mPaint.setColor(COLOR_RED);
        // 第一段L形
        canvas.drawLine(startX, startY, startX, startY - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, startY - SEGMENT_LENGTH, startX - SEGMENT_LENGTH, startY - SEGMENT_LENGTH, mPaint);
        // 第二段L形
        float y1 = startY - SEGMENT_LENGTH - SEGMENT_GAP;
        canvas.drawLine(startX, y1, startX, y1 - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, y1 - SEGMENT_LENGTH, startX - SEGMENT_LENGTH, y1 - SEGMENT_LENGTH, mPaint);

        // 黄色段
        mPaint.setColor(COLOR_YELLOW);
        float y2 = y1 - SEGMENT_LENGTH - SEGMENT_GAP;
        canvas.drawLine(startX, y2, startX, y2 - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, y2 - SEGMENT_LENGTH, startX - SEGMENT_LENGTH, y2 - SEGMENT_LENGTH, mPaint);

        // 绿色段
        mPaint.setColor(COLOR_GREEN);
        float y3 = y2 - SEGMENT_LENGTH - SEGMENT_GAP;
        canvas.drawLine(startX, y3, startX, y3 - SEGMENT_LENGTH, mPaint);
        canvas.drawLine(startX, y3 - SEGMENT_LENGTH, startX - SEGMENT_LENGTH, y3 - SEGMENT_LENGTH, mPaint);
    }
}