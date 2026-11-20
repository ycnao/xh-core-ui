package com.xcore.ui.widget.view;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * 辅助线
 */
public class LineGuideView extends View {

    private Paint paint;
    private Camera camera;
    private Matrix matrix;

    //尺度标记得长短，可调整
    private int tran = 200;
    //笔粗细，由近到远是由粗到细，变化跟倾斜得角度有关，可调整
    private int strokeWidth = 70;

    public LineGuideView(Context context) {
        super(context);
        init();
    }

    public LineGuideView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init(){
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(strokeWidth);

        //矩阵变化所需要的东西
        camera = new Camera();
        matrix = new Matrix();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        camera.save();
        matrix.reset();
        //z轴移动，z可调整，-放大，+缩小
        camera.translate(0, 0, 0);
        //旋转度数可以调整
        camera.rotateX(50);
        camera.getMatrix(matrix);
        camera.restore();
        //设置坐标位置
        matrix.preTranslate(-(getWidth() / 2), -getHeight());
        matrix.postTranslate(getWidth() / 2, getHeight());
        //将变换后的矩阵给canvashao
        canvas.concat(matrix);

        int height = getHeight();
        int width = getWidth();
        //每个刻度之间的长度，可调整
        int h_coefficient = 1000;
        //左右边界距离，可调整
        int w_coefficient = width / 6;
        //可适当调整俩条线之间的角度
        int skewing = 300;

        //计算画布旋转角度
        double v = Math.sqrt(Math.pow(h_coefficient, 2) - Math.pow(skewing, 2));
        double angle = angle(v, skewing, h_coefficient);
        long round = Math.round(angle);

        //需要将画布旋转得角度
        if(round != 0){
            canvas.rotate(-round, w_coefficient, height);
        }

        paint.setColor(Color.parseColor("#dc474e"));
        canvas.drawLine(w_coefficient, height, w_coefficient, height - h_coefficient, paint);

        paint.setColor(Color.parseColor("#f2f542"));
        canvas.drawLine(w_coefficient, height - h_coefficient, w_coefficient, height - h_coefficient * 2, paint);

        paint.setColor(Color.parseColor("#4ee826"));
        canvas.drawLine(w_coefficient, height - h_coefficient * 2, w_coefficient, height - h_coefficient * 3, paint);
        canvas.drawLine(w_coefficient, height - h_coefficient * 3, w_coefficient, height - h_coefficient * 4, paint);

        paint.setColor(Color.parseColor("#dc474e"));
        canvas.drawLine(w_coefficient - strokeWidth / 2, height - h_coefficient, w_coefficient - strokeWidth / 2 + tran, height - h_coefficient, paint);

        paint.setColor(Color.parseColor("#f2f542"));
        canvas.drawLine(w_coefficient - strokeWidth / 2, height - h_coefficient * 2, w_coefficient - strokeWidth / 2 + tran, height - h_coefficient * 2, paint);

        paint.setColor(Color.parseColor("#4ee826"));
        canvas.drawLine(w_coefficient - strokeWidth / 2, height - h_coefficient * 3, w_coefficient - strokeWidth / 2 + tran, height - h_coefficient * 3, paint);
        canvas.drawLine(w_coefficient - strokeWidth / 2, height - h_coefficient * 4, w_coefficient - strokeWidth / 2 + tran, height - h_coefficient * 4, paint);

        if(round != 0){
            //上面画布被逆时针旋转了，所以先要把画布归位，再旋转画布
            canvas.rotate(round, w_coefficient, height);
            canvas.rotate(round, getWidth() - w_coefficient, height);
        }

        paint.setColor(Color.parseColor("#dc474e"));
        canvas.drawLine(getWidth() - w_coefficient, height, getWidth() - w_coefficient, height - h_coefficient, paint);

        paint.setColor(Color.parseColor("#f2f542"));
        canvas.drawLine(getWidth() - w_coefficient, height - h_coefficient, getWidth() - w_coefficient, height - h_coefficient * 2, paint);

        paint.setColor(Color.parseColor("#4ee826"));
        canvas.drawLine(getWidth() - w_coefficient, height - h_coefficient * 2, getWidth() - w_coefficient, height - h_coefficient * 3, paint);
        canvas.drawLine(getWidth() - w_coefficient, height - h_coefficient * 3, getWidth() - w_coefficient, height - h_coefficient * 4, paint);

        paint.setColor(Color.parseColor("#dc474e"));
        canvas.drawLine(getWidth() - w_coefficient + strokeWidth / 2, height - h_coefficient, getWidth() - w_coefficient + strokeWidth / 2 - tran, height - h_coefficient, paint);

        paint.setColor(Color.parseColor("#f2f542"));
        canvas.drawLine(getWidth() - w_coefficient + strokeWidth / 2, height - h_coefficient * 2, getWidth() - w_coefficient + strokeWidth / 2 - tran, height - h_coefficient * 2, paint);

        paint.setColor(Color.parseColor("#4ee826"));
        canvas.drawLine(getWidth() - w_coefficient + strokeWidth / 2, height - h_coefficient * 3, getWidth() - w_coefficient + strokeWidth / 2 - tran, height - h_coefficient * 3, paint);
        canvas.drawLine(getWidth() - w_coefficient + strokeWidth / 2, height - h_coefficient * 4, getWidth() - w_coefficient + strokeWidth / 2 - tran, height - h_coefficient * 4, paint);

        if(round != 0){
            //将画布转回原位
            canvas.rotate(-round, getWidth() - w_coefficient, height);
        }

//        paint.setColor(Color.parseColor("#dc474e"));
//        canvas.drawLine(w_coefficient, height, w_coefficient, height - h_coefficient, paint);
//        canvas.drawLine(w_coefficient - 20, height - h_coefficient, w_coefficient + tran, height - h_coefficient, paint);
//        canvas.drawLine(getWidth() - w_coefficient, height, getWidth() - w_coefficient, height - h_coefficient, paint);
//        canvas.drawLine(getWidth() - w_coefficient + 20, height - h_coefficient, getWidth() - w_coefficient - tran, height - h_coefficient, paint);

//        paint.setColor(Color.parseColor("#dc474e"));
//        canvas.drawLine(w_coefficient, height - h_coefficient - 20, w_coefficient, height - h_coefficient * 2 - 20, paint);
//        canvas.drawLine(w_coefficient - 20, height - h_coefficient * 2 - 20, w_coefficient + tran, height - h_coefficient * 2 - 20, paint);
//        canvas.drawLine(getWidth() - w_coefficient, height - h_coefficient - 20, getWidth() - w_coefficient, height - h_coefficient * 2 - 20, paint);
//        canvas.drawLine(getWidth() - w_coefficient + 20, height - h_coefficient * 2 - 20, getWidth() - w_coefficient - tran, height - h_coefficient * 2 - 20, paint);

//        paint.setColor(Color.parseColor("#4ee826"));
//        canvas.drawLine(w_coefficient, height - h_coefficient * 2 - 40, w_coefficient, height - h_coefficient * 3 - 40, paint);
//        canvas.drawLine(w_coefficient - 20, height - h_coefficient * 3 - 40, w_coefficient + tran, height - h_coefficient * 3 - 40, paint);
//        canvas.drawLine(getWidth() - w_coefficient, height - h_coefficient * 2 - 40, getWidth() - w_coefficient, height - h_coefficient * 3 - 40, paint);
//        canvas.drawLine(getWidth() - w_coefficient + 20, height - h_coefficient * 3 - 40, getWidth() - w_coefficient - tran, height - h_coefficient * 3 - 40, paint);

//        canvas.drawLine(w_coefficient, height - h_coefficient * 3 - 60, w_coefficient, height - h_coefficient * 4 - 60, paint);
//        canvas.drawLine(w_coefficient - 20, height - h_coefficient * 4 - 60, w_coefficient + tran, height - h_coefficient * 4 - 60, paint);
//        canvas.drawLine(getWidth() - w_coefficient, height - h_coefficient * 3 - 60, getWidth() - w_coefficient, height - h_coefficient * 4 - 60, paint);
//        canvas.drawLine(getWidth() - w_coefficient + 20, height - h_coefficient * 4 - 60, getWidth() - w_coefficient - tran, height - h_coefficient * 4 - 60, paint);

    }

    private double angle(double a, int b, int c){
        if(b == 0)return 0;
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);
        double acos = Math.acos((a2 + c2 - b2) / (2 * a * c));
        double v = Math.toDegrees(acos);
        return v;
    }
}
