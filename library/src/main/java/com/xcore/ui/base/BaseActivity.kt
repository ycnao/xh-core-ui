package com.xcore.ui.base

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import android.view.inputmethod.InputMethodManager
import androidx.core.app.ActivityCompat
import androidx.lifecycle.lifecycleScope

import com.xcore.libs.lstener.CountDownListener
import com.xcore.libs.utils.AppUtils
import com.xcore.libs.base.IBaseActivity
import com.xcore.libs.base.IBaseView
import com.xcore.ui.widget.spotsdialog.SpotsDialog
import com.xcore.ui.R

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

/**
 *登录页面
 * author: Created by 闹闹 on 2018-09-11
 * version: 1.0.0
 */
abstract class BaseActivity<T : Activity> : IBaseActivity<T>(), IBaseView {

    lateinit var spotsDialog: SpotsDialog
    lateinit var inputMethodManager: InputMethodManager

    private var job: Job? = null // 用于管理协程生命周期
    private var mCountDownListener: CountDownListener? = null

    abstract fun initParameter(bundle: Bundle?)

    abstract fun initLayout(): Int

    abstract fun afterInjectView()

    override fun onCreate(savedInstanceState: Bundle?) {
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        //设置状态栏字体颜色
        isActionBarBlackColor(true)
        initParameter(intent.extras)

        setContentView(initLayout())
        afterInjectView()

        //全屏
        hideSystemBars()
//        //全屏
//        StatusBarUtils.with(this).fullScreen(this)
//        //设置全屏
//        val FLAG_FULLSCREEN = WindowManager.LayoutParams.FLAG_FULLSCREEN
//        window.setFlags(FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

    }

    private fun hideSystemBars() {
        // 配置隐藏模式
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.systemBars())
            // 可选：设置交互模式（触摸屏幕边缘时是否显示导航栏）
            window.insetsController?.systemBarsBehavior =
                WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        } else {
            window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    or View.SYSTEM_UI_FLAG_FULLSCREEN
                    or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY)
        }
    }

    /**
     * 设置状态栏 0 为白色
     */
    fun isActionBarBlackColor(black: Boolean) {
        window.decorView.systemUiVisibility = if (black) View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR else 0
    }

    fun requestPermissions() {
        if (Build.VERSION.SDK_INT >= 23) {
            val mPermissionList = arrayOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION,
                Manifest.permission.READ_LOGS,
                Manifest.permission.READ_PHONE_STATE
            )
            ActivityCompat.requestPermissions(this, mPermissionList, 123)
        }
    }

    override fun showLoading(msg: String?) {
        val txt = getString(R.string.loading)
        spotsDialog = SpotsDialog(this, if (msg.isNullOrEmpty()) txt else msg)
        spotsDialog.setCancelable(true)
        spotsDialog.setCanceledOnTouchOutside(true)
        spotsDialog.show()
    }

    override fun hideLoading() = spotsDialog.dismiss()

    override fun toastShowShort(msg: String) = toastShow(msg)

    override fun toastShowShort(rId: Int) = toastShow(rId)

    override fun showError(imageId: Int, text: String, status: Int) {}

    override fun getContextView(): Activity = this

    fun startActivity(clazz: Class<*>) {
        startActivity(Intent(instance, clazz))
    }

    fun getResStr(id: Int): String = resources.getString(id)

    fun getResList(id: Int): Array<String> {
        return resources.getStringArray(id)
    }

    fun getVersion(): String {
        val versionInfo = AppUtils.versionInfo(this)
        return versionInfo.name
    }

    fun toWifiSettings() {
        val intent = Intent(Settings.ACTION_WIFI_SETTINGS)
        // 判断设备上是否已经有能响应该intent的Activity
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // 处理找不到目标activity的情况
            startActivity(Intent(Settings.ACTION_SETTINGS))
        }
    }

    fun countDown(listener: CountDownListener) {
        mCountDownListener = listener
        cancelTime() // 取消之前的任务
        // 启动协程收集数据流（类似 subscribe）
        if (job == null) {
            // 创建倒计时 Flow
            val countDownFlow: Flow<Long> = flow {
                delay(200) // 初始延迟 200ms
                repeat(5) { index ->
                    emit(index.toLong()) // 发送 0-4 的事件
                    delay(400) // 每次间隔 400ms
                }
            }.flowOn(Dispatchers.IO) // 指定生产者所在线程（类似 subscribeOn）

            job = lifecycleScope.launch { // 假设在 Android 中使用 lifecycleScope
                countDownFlow
                    .onEach { mCountDownListener?.startTask() } // 对应 doOnNext
                    .onCompletion { mCountDownListener?.endTask() } // 对应 doOnComplete
                    .collect()
                // 开始收集数据（挂起函数）
            }
        }
    }

    // 取消任务（对应 Disposable.dispose()）
    fun cancelTime() {
        if (job != null) {
            job?.cancel()
            job = null
        }
    }


    /**
     * 去系统设置页面
     */
    fun toSystemSetting() {
        val intent = Intent()
        intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
        intent.data = Uri.fromParts("package", applicationContext.packageName, null)
        startActivity(intent)
    }
}



