package com.xcore.ui.base

import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.xcore.core.libs.base.IBaseActivity
import com.xcore.core.libs.base.IBaseFragment
import com.xcore.core.libs.base.IBaseView
import com.xcore.ui.widget.spotsdialog.SpotsDialog
import com.xcore.core.ui.R
import org.greenrobot.eventbus.EventBus

/**
 *
 * author: Created by 闹闹 on 2018-09-12
 * version: 1.0.0
 */
abstract class BaseFragment<A : IBaseActivity<A>, F : Fragment> : IBaseFragment<A, F>(), IBaseView {

    lateinit var spotsDialog: SpotsDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

//    /**
//     * 	动态设置状态栏高度
//     */
//    fun initTopView() {
//        if (topView != null) {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//                topView.visibility = View.VISIBLE
//                //获取当前控件的布局对象
//                val params = topView.layoutParams as LinearLayout.LayoutParams
//                //设置当前控件布局的高度
//                params.height = StatusBarUtils.getStatusBarHeight(act)
//                //将设置好的布局参数应用到控件中
//                topView.layoutParams = params
//            } else {
//                topView.visibility = View.GONE
//            }
//        }
//    }

    override fun showLoading(msg: String?) {
        spotsDialog = SpotsDialog(activity, if (msg.isNullOrEmpty()) getString(R.string.please_wait) else msg)
        spotsDialog.setCancelable(true)
        spotsDialog.setCanceledOnTouchOutside(true)
        spotsDialog.show()
    }

    override fun hideLoading() = spotsDialog.dismiss()

    override fun toastShowShort(rId: Int) = act.toastShow(rId)

    override fun toastShowShort(msg: String) = act.toastShow(msg)

    override fun showError(imageId: Int, text: String, status: Int) {}

    override fun getContextView(): Activity = requireActivity()

    /**
     * 事件
     */
    fun registerEventBus(subscriber: Any) {
        if (!EventBus.getDefault().isRegistered(subscriber)) {
            EventBus.getDefault().register(subscriber)
        }
    }

    fun unregisterEventBus(subscriber: Any) {
        if (EventBus.getDefault().isRegistered(subscriber)) {
            EventBus.getDefault().unregister(subscriber)
        }
    }

}
