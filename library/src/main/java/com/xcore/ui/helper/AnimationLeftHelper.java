package com.xcore.ui.helper;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * View 左右滑动显示/隐藏动画工具类
 * 支持：从右往左滑出隐藏、从左往右滑入显示
 */
public class AnimationLeftHelper {

    // 默认动画时长（毫秒）
    public static final long DEFAULT_DURATION = 500;
    // 默认插值器（加速减速，动效更自然）
    public static final Interpolator DEFAULT_INTERPOLATOR = new AccelerateDecelerateInterpolator();

    /**
     * View 从右往左滑出并隐藏（默认参数）
     *
     * @param view 目标View
     */
    public static void slideOutToLeft(View view) {
        slideOutToLeft(view, DEFAULT_DURATION, DEFAULT_INTERPOLATOR);
    }

    /**
     * View 从右往左滑出并隐藏（自定义参数）
     *
     * @param view         目标View
     * @param duration     动画时长（ms）
     * @param interpolator 插值器（控制动画速度曲线）
     */
    public static void slideOutToLeft(View view, long duration, Interpolator interpolator) {
        if (view == null || view.getVisibility() == View.GONE) {
            return;
        }

        // 重置View初始状态（避免上次动画残留）
        view.setAlpha(1.0f);
        view.setTranslationX(0);

        // 安全获取View宽度（适配未测量、wrap_content等场景）
        int viewWidth = getViewWidth(view);
        // 动画值范围：0 → -viewWidth（向左滑出屏幕）
        ValueAnimator animator = ValueAnimator.ofFloat(0, -viewWidth);
        animator.setDuration(duration);
        animator.setInterpolator(interpolator);

        // 实时更新View位置和透明度
        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            view.setTranslationX(value);
            // 透明度随滑动距离同步变化（0→1）
            view.setAlpha(1 - Math.abs(value / viewWidth));
        });

        // 动画结束处理
        animator.addListener(new android.animation.Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(android.animation.Animator animation) {
            }

            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                view.setVisibility(View.GONE);
                // 重置属性，方便下次复用
                view.setTranslationX(0);
                view.setAlpha(1.0f);
            }

            @Override
            public void onAnimationCancel(android.animation.Animator animation) {
            }

            @Override
            public void onAnimationRepeat(android.animation.Animator animation) {
            }
        });

        animator.start();
    }

    /**
     * View 从左往右滑入并显示（默认参数）
     *
     * @param view 目标View
     */
    public static void slideInFromLeft(View view) {
        slideInFromLeft(view, DEFAULT_DURATION, DEFAULT_INTERPOLATOR);
    }

    /**
     * View 从左往右滑入并显示（自定义参数）
     *
     * @param view         目标View
     * @param duration     动画时长（ms）
     * @param interpolator 插值器
     */
    public static void slideInFromLeft(View view, long duration, Interpolator interpolator) {
        if (view == null) {
            return;
        }

        // 安全获取View宽度
        int viewWidth = getViewWidth(view);
        // 初始化View状态：置于屏幕左侧外、透明、可见
        view.setVisibility(View.VISIBLE);
        view.setAlpha(0.0f);
        view.setTranslationX(-viewWidth);

        // 动画值范围：-viewWidth → 0（向右滑入屏幕）
        ValueAnimator animator = ValueAnimator.ofFloat(-viewWidth, 0);
        animator.setDuration(duration);
        animator.setInterpolator(interpolator);

        // 实时更新View位置和透明度
        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            view.setTranslationX(value);
            // 透明度随滑动距离同步变化（0→1）
//            view.setAlpha(Math.abs(value / viewWidth));
            view.setAlpha(value == 0 ? 1.0f : 1 - (value / viewWidth));
        });

        animator.start();
    }

    /**
     * 安全获取View宽度（适配未测量、wrap_content、match_parent）
     */
    private static int getViewWidth(View view) {
        int width = view.getWidth();
        if (width <= 0) {
            width = view.getMeasuredWidth(); // 优先取测量宽度
        }
        if (width <= 0) {
            width = view.getLayoutParams().width; // 取布局参数宽度
        }
        // 若仍为0（wrap_content），使用屏幕宽度兜底
        if (width <= 0) {
            width = view.getResources().getDisplayMetrics().widthPixels;
        }
        return width;
    }
}