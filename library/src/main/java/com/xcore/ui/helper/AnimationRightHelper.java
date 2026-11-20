package com.xcore.ui.helper;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/**
 * View滑动显示/隐藏动画工具类
 */
public class AnimationRightHelper {

    // 默认动画时长（ms）
    private static final long DEFAULT_DURATION = 500;
    // 默认插值器（加速减速，更自然）
    private static final Interpolator DEFAULT_INTERPOLATOR = new AccelerateDecelerateInterpolator();


    /**
     * View从左往右滑出并隐藏
     *
     * @param view 目标View
     */
    public static void slideOutToRight(View view) {
        slideOutToRight(view, DEFAULT_DURATION, DEFAULT_INTERPOLATOR);
    }

    /**
     * 自定义时长和插值器的滑出隐藏
     *
     * @param view         目标View
     * @param duration     动画时长（ms）
     * @param interpolator 插值器
     */
    public static void slideOutToRight(View view, long duration, Interpolator interpolator) {
        if (view == null || view.getVisibility() == View.GONE) {
            return;
        }

        // 重置View状态
        view.setAlpha(1.0f);
        view.setTranslationX(0);

        // 获取View宽度（适配未测量完成的情况）
        int viewWidth = getViewWidth(view);

        // 创建属性动画：X从0 → viewWidth
        ValueAnimator animator = ValueAnimator.ofFloat(0, viewWidth);
        animator.setDuration(duration);
        animator.setInterpolator(interpolator);

        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            view.setTranslationX(value);
            // 同步调整透明度，增强视觉效果
            view.setAlpha(1 - (value / viewWidth));
        });

        animator.addListener(new android.animation.Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(android.animation.Animator animation) {
            }

            @Override
            public void onAnimationEnd(android.animation.Animator animation) {
                // 动画结束后隐藏View
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
     * View从右往左滑入并显示
     *
     * @param view 目标View
     */
    public static void slideInFromRight(View view) {
        slideInFromRight(view, DEFAULT_DURATION, DEFAULT_INTERPOLATOR);
    }

    /**
     * 自定义时长和插值器的滑入显示
     *
     * @param view         目标View
     * @param duration     动画时长（ms）
     * @param interpolator 插值器
     */
    public static void slideInFromRight(View view, long duration, Interpolator interpolator) {
        if (view == null) {
            return;
        }

        // 获取View宽度
        int viewWidth = getViewWidth(view);

        // 初始化View状态：置于屏幕右侧，透明，可见
        view.setVisibility(View.VISIBLE);
        view.setAlpha(0.0f);
        view.setTranslationX(viewWidth);

        // 创建属性动画：X从viewWidth → 0
        ValueAnimator animator = ValueAnimator.ofFloat(viewWidth, 0);
        animator.setDuration(duration);
        animator.setInterpolator(interpolator);

        animator.addUpdateListener(animation -> {
            float value = (float) animation.getAnimatedValue();
            view.setTranslationX(value);
            // 同步调整透明度
            view.setAlpha(value == 0 ? 1.0f : 1 - (value / viewWidth));
        });

        animator.start();
    }

    /**
     * 安全获取View宽度（适配未测量、wrap_content等情况）
     */
    private static int getViewWidth(View view) {
        int width = view.getWidth();
        if (width <= 0) {
            width = view.getMeasuredWidth();
        }
        if (width <= 0) {
            width = view.getLayoutParams().width;
        }
        // 若仍为0（wrap_content），使用屏幕宽度
        if (width <= 0) {
            width = view.getResources().getDisplayMetrics().widthPixels;
        }
        return width;
    }
}
