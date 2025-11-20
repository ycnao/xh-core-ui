package com.xcore.ui.base

import android.content.Context
import com.xcore.libs.base.IBasePresenter
import com.xcore.libs.base.IBaseView

/**
 *
 * author: Created by 闹闹 on 2018-09-12
 * version: 1.0.0
 */
open class BasePresenter<T : IBaseView> : IBasePresenter<T> {

    private var mView: T? = null
    lateinit var mContext: Context

    override fun attachView(view: T) {
        mView = view
        mContext = mView!!.getContextView()
    }

    override fun detachView() {
        if (mView != null) {
            mView = null
        }
    }

    private fun isViewAttached() = mView != null

    fun getMvpView(): T? = mView

    fun checkViewAttached() {
        if (!isViewAttached()) throw MvpViewNotAttachedException()
    }

    class MvpViewNotAttachedException :
        RuntimeException("Please call Presenter.attachView(MvpView) before" + " requesting data to the Presenter")
}
