package com.xzero.core.ui.widget.spotsdialog;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.xzero.core.ui.R;


/**
 * Created by Maxim Dybarsky | maxim.dybarskyy@gmail.com on 13.01.15 at 17:34
 */
public class ProgressLayout extends FrameLayout {

    private static final int DEFAULT_COUNT = 5;

    private int spotsCount;

    public ProgressLayout(Context context) {
        this(context, null);
    }

    public ProgressLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ProgressLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, defStyleAttr, 0);
    }

    // @TargetApi(Build.VERSION_CODES.KITKAT)
    // public ProgressLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
    //// super(context, attrs, defStyleAttr, defStyleRes);
    // init(attrs, defStyleAttr, defStyleRes);
    // }

    private void init(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.DialogSpots, defStyleAttr, defStyleRes);
        spotsCount = a.getInt(R.styleable.DialogSpots_DialogSpotCount, DEFAULT_COUNT);
        a.recycle();
    }

    public int getSpotsCount() {
        return spotsCount;
    }
}
