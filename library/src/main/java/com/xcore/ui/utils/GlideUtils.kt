package com.xcore.ui.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.DrawableImageViewTarget

import com.xcore.core.ui.R
import com.xcore.ui.widget.image.CircleImageView
import com.xcore.ui.widget.image.SquareImageView


/**
 *  图片处理工具类
 * author: Created by 闹闹 on 2018-10-14
 * version: 1.0.0
 */
object GlideUtils {

    /**
     * ImageView
     */
    @JvmStatic
    fun load(url: String?): String {
        return "$url"
    }

    @JvmStatic
    fun loadView(context: Context, url: String, view: ImageView) {
        if (url.isNullOrEmpty()) {
            Glide.with(context).load(R.mipmap.ic_image).into(view)
        } else {
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_image)
                .error(R.mipmap.ic_image)
            Glide.with(context).load(url).apply(requestOptions).into(view)
        }
    }

    @JvmStatic
    fun loadNet(context: Context, url: String?, view: ImageView) {
        if (url.isNullOrBlank()) {
            Glide.with(context).load(R.mipmap.ic_image).into(view)
        } else {
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_image)
                .error(R.mipmap.ic_image)
            Glide.with(context).load(load(url)).apply(requestOptions).into(view)
        }
    }

    @JvmStatic
    fun loadNet(context: Context, url: String?, view: CircleImageView) {
        if (url.isNullOrBlank()) {
            Glide.with(context).load(R.mipmap.ic_image).into(view)
        } else {
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_image)
                .error(R.mipmap.ic_image)
            Glide.with(context).load(load(url)).apply(requestOptions).into(view)
        }
    }

    @JvmStatic
    fun loadImageView(context: Context, url: String?, view: ImageView) {
        if (url.isNullOrBlank()) {
            Glide.with(context).load(R.mipmap.ic_image).into(view)
        } else {
            val layoutParams = view.layoutParams
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_image)
                .error(R.mipmap.ic_image)
            Glide.with(context).load(load(url)).apply(requestOptions)
                .override(layoutParams.width, Integer.MAX_VALUE).into(view)
        }
    }

    @JvmStatic
    fun loadHeader(context: Context, url: String?, view: ImageView) {
        if (url.isNullOrBlank()) {
            Glide.with(context).load(R.mipmap.ic_header).into(view)
        } else {
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_header)
                .error(R.mipmap.ic_header)
            Glide.with(context).load(load(url)).apply(requestOptions).into(view)
        }
    }

    @JvmStatic
    fun loadLogo(context: Context, url: String?, view: ImageView) {
        if (url == null) {
            Glide.with(context).load(R.mipmap.ic_logo_default).into(view)
        } else {
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_logo_default)
                .error(R.mipmap.ic_logo_default)
            Glide.with(context).load(load(url)).apply(requestOptions).into(view)
        }
    }

    /**
     * 正方形ImageView
     */
    @JvmStatic
    fun loadSquareView(context: Context, url: String, view: SquareImageView) {
        if (url.isNullOrEmpty()) {
            Glide.with(context).load(R.mipmap.ic_image).into(view)
        } else {
            val requestOptions = RequestOptions()
                .placeholder(R.mipmap.ic_image)
                .error(R.mipmap.ic_image)
            Glide.with(context).load(load(url)).apply(requestOptions).into(view)
        }
    }

    @JvmStatic
    fun loadRoundedView(context: Context, url: String, radius: Int, view: ImageView) {
        //设置图片圆角角度
        val roundedCorners = RoundedCorners(radius)
        val requestOptions = RequestOptions
            .bitmapTransform(roundedCorners)
            .override(300, 300)
            .placeholder(R.mipmap.ic_image)
            .error(R.mipmap.ic_image)
        Glide.with(context).load(load(url)).apply(requestOptions).into(view)
    }

    @JvmStatic
    fun loadRoundedView(context: Context, resId: Int, radius: Int, view: ImageView) {
        //设置图片圆角角度
        val roundedCorners = RoundedCorners(radius)
        val requestOptions = RequestOptions
            .bitmapTransform(roundedCorners)
            .override(300, 300)
            .placeholder(R.mipmap.ic_image)
            .error(R.mipmap.ic_image)
        Glide.with(context).load(resId).apply(requestOptions).into(view)
    }

    /**
     * 加载图片配合监听
     */
    @JvmStatic
    fun loadWithListener(context: Context, url: String, mRequestListener: DrawableImageViewTarget) {
        //设置路径。
        Glide.with(context).load(url)
            .override(500, 500)
            .error(R.mipmap.ic_image)
            .placeholder(R.mipmap.ic_image)
            .into<DrawableImageViewTarget>(mRequestListener)
    }

}
