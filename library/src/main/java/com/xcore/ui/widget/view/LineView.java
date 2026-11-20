package com.xcore.ui.widget.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;


import com.xcore.ui.R;

import java.util.ArrayList;
import java.util.List;

/**
 * 同心圆
 */
public class LineView extends View {

    private Paint mPaint;
    private int width = 0;
    private int height = 0;

    @RequiresApi(api = Build.VERSION_CODES.R)
    public LineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint();
        mPaint.setStrokeWidth(2);
        mPaint.setTextSize(19);
        mPaint.setColor(context.getColor(R.color.green_07c060));
        mPaint.setStyle(Paint.Style.STROKE);
        WindowManager windowManager = (WindowManager) (context.getApplicationContext().getSystemService(Context.WINDOW_SERVICE));
        width = windowManager.getDefaultDisplay().getWidth();
        height = windowManager.getDefaultDisplay().getHeight();
    }

    public void setColor(int color) {
        mPaint.setColor(color);
        invalidate();
    }

    public void setAlpha(int alpha) {
        mPaint.setAlpha(alpha);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //找到圆心的中心点
        float x = width / 2;
        float y = height / 2;
        canvas.drawCircle(x, y, 100, mPaint);
        canvas.drawCircle(x, y, 200, mPaint);
        canvas.drawCircle(x, y, 300, mPaint);
        canvas.drawLine(0, height / 2, width, height / 2, mPaint);//横线
        canvas.drawLine(width / 2, 0, width / 2, height, mPaint);//竖线

        List<Float> list = new ArrayList<>();


        //横线大坐标
        for (float line_x = 0; line_x < width; line_x++) {
            if (line_x % 50 == 0) {
                list.add(line_x + 10);
                list.add((float) (height / 2));
                list.add(line_x + 10);
                list.add((float) (height / 2) - 30);
            }
        }
        float[] s = new float[list.size()];
        for (int l = 0; l < list.size(); l++) {
            s[l] = list.get(l);
        }
        //画线段
        canvas.drawLines(s, mPaint);

        //右文字刻度
        int d = 0;
        for (float t = width / 2; t < width; t++) {
            if (t % 100 == 0) {
                d += 10;
                canvas.drawText(d + "", t + 10, (float) (height / 2) - 30, mPaint);
            }
        }
        //左边
        int c = 0;
        for (float t = width / 2; t >= 0; t--) {
            if (t % 100 == 0) {
                if (c != 0)
                    canvas.drawText(c + "", t + 10, (float) (height / 2) - 30, mPaint);

                c += 10;
            }
        }

        //横线小坐标
        List<Float> list_s = new ArrayList<>();
        for (float line_x = 0; line_x < width; line_x++) {
            if (line_x % 10 == 0) {
                list_s.add(line_x + 10);
                list_s.add((float) (height / 2));
                list_s.add(line_x + 10);
                list_s.add((float) (height / 2) - 10);
            }
        }
        float[] s1 = new float[list_s.size()];
        for (int l = 0; l < list_s.size(); l++) {
            s1[l] = list_s.get(l);
        }
        canvas.drawLines(s1, mPaint);

        //竖线大坐标
        List<Float> list_y = new ArrayList<>();
        for (float line_y = 0; line_y < height; line_y++) {
            if (line_y % 50 == 0) {
                list_y.add((float) (width / 2));
                list_y.add(line_y - 15);
                list_y.add((float) (width / 2) + 30);
                list_y.add(line_y - 15);
            }
        }
        float[] sy = new float[list_y.size()];
        for (int l = 0; l < list_y.size(); l++) {
            sy[l] = list_y.get(l);
        }
        //画线段
        canvas.drawLines(sy, mPaint);

        //竖线小坐标
        List<Float> list_s_y = new ArrayList<>();
        for (float line_x = 0; line_x < height; line_x++) {
            if (line_x % 10 == 0) {
                list_s_y.add((float) (width / 2));
                list_s_y.add(line_x - 15);
                list_s_y.add((float) (width / 2) + 10);
                list_s_y.add(line_x - 15);
            }
        }
        float[] sy1 = new float[list_s_y.size()];
        for (int l = 0; l < list_s_y.size(); l++) {
            sy1[l] = list_s_y.get(l);
        }
        canvas.drawLines(sy1, mPaint);

        //上文字刻度
        int dy = 0;
        for (float t = height / 2; t >= 0; t--) {
            if (t % 100 == 0) {
                dy += 10;
                canvas.drawText(dy + "", (float) (width / 2) + 30, t - 15, mPaint);
            }
        }
        //下文字刻度
        int by = 0;
        for (float t = height / 2; t < height; t++) {
            if (t % 100 == 0) {
                if (by != 0) canvas.drawText(by + "", (float) (width / 2) + 30, t - 15, mPaint);

                by += 10;
            }
        }
    }
}
