package com.xcore.ui.widget.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;

import com.xcore.ui.R;


/**
 * 十字辅助线
 */
public class LineCrossView extends View {

    private int m_iLength = 300;
    private int m_iWidth = 10;
    private int m_iColor = Color.RED;
    private int m_iRadius = 10;
    private Context m_context;
    private Paint m_paint;

    public LineCrossView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public LineCrossView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public LineCrossView(Context context) {
        super(context);
        init(context, null);
    }

    private void init(Context context, AttributeSet attrs) {
        this.m_context = context;
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.CrossView);
        m_iLength = (int) a.getDimension(R.styleable.CrossView_lineLength, 300);
        m_iWidth = (int) a.getDimension(R.styleable.CrossView_lineWidth, 10);
        m_iColor = a.getColor(R.styleable.CrossView_lineColor, Color.BLUE);

        m_paint = new Paint();
        m_paint.setColor(m_iColor);
        m_paint.setStrokeWidth(m_iWidth);
        m_paint.setAntiAlias(true);
        if (m_iWidth > m_iRadius * 2) {
            m_iRadius = m_iWidth / 2;
        }
        a.recycle();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//         method1(canvas);
        method2(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
//        Toast.makeText(m_context, "view", Toast.LENGTH_SHORT).show();
        return false;
    }

    private void method1(Canvas canvas) {
        WindowManager wm = (WindowManager) m_context.getSystemService(Context.WINDOW_SERVICE);
        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        // 1.获取状态栏的高度
        Rect frame = new Rect();
        getWindowVisibleDisplayFrame(frame);
        int stateHeight = frame.top;
        // 2.设置竖线的位置
        int startX = width / 2;
        int startY = (height - stateHeight) / 2 - m_iLength / 2;
        int stopX = startX;
        int stopY = startY + m_iLength;

        Log.d("bzy", stateHeight + "");
        canvas.drawLine(startX, startY, stopX, stopY, m_paint);
        // 3.设置横线的位置
        startX = width / 2 - m_iLength / 2;
        startY = (height - stateHeight) / 2;
        stopX = startX + m_iLength;
        stopY = startY;
        canvas.drawLine(startX, startY, stopX, stopY, m_paint);

        // 4.制作空心圆
        int cx = width / 2;
        int cy = (height - stateHeight) / 2;
        int radius = (m_iWidth + 1) / 2;
        m_paint.setColor(Color.RED);
        m_paint.setStrokeWidth(1);
        m_paint.setStyle(Style.STROKE);
        canvas.drawCircle(cx, cy, radius, m_paint);
    }

    private void method2(Canvas canvas) {
        WindowManager wm = (WindowManager) m_context.getSystemService(Context.WINDOW_SERVICE);
        int width = getWidth();
        int height = getHeight();

        // 1.获取状态栏的高度
        Rect frame = new Rect();
        getWindowVisibleDisplayFrame(frame);
        int stateHeight = frame.top;

        // 2.画横线
        // 2.1左边
        int startX = width / 2 - (m_iLength + m_iRadius * 2) / 2;
        int startY = (height - stateHeight) / 2;
        int stopX = startX + m_iLength / 2;
        int stopY = startY;
        canvas.drawLine(startX, startY, stopX, stopY, m_paint);
        // 2.2右边
        startX = stopX + m_iRadius * 2;
        stopX = startX + m_iLength / 2;
        canvas.drawLine(startX, startY, stopX, stopY, m_paint);

        // 3.画竖线
        // 3.1 左边
        startX = width / 2;
        startY = (height - stateHeight) / 2 - (m_iLength + m_iRadius * 2) / 2;
        stopX = startX;
        stopY = startY + m_iLength / 2;
        canvas.drawLine(startX, startY, stopX, stopY, m_paint);
        // 3.2右边
        startY = stopY + m_iRadius * 2;
        stopY = startY + m_iLength / 2;
        canvas.drawLine(startX, startY, stopX, stopY, m_paint);

        // 4.画圆
        int cx = width / 2;
        int cy = (height - stateHeight) / 2;
        int radius = 2;
        canvas.drawCircle(cx, cy, radius, m_paint);
    }
}
