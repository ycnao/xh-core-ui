package com.xhuman.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hjq.permissions.OnPermissionCallback
import com.hjq.permissions.XXPermissions

/**
 * 启动页
 * author：created by 闹闹 on 2025/10/27
 * version：v1.0.0
 */
class StartAppActivity : AppCompatActivity() {

    private val isG2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        initPermission()
    }

    private fun initPermission() {
//        val list = Utils.permissions()
////        XXPermissions.setCheckMode(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
//        XXPermissions.with(this).permission(list).request(object : OnPermissionCallback {
//
//            override fun onGranted(permissions: List<String>, all: Boolean) {
//            }
//
//            override fun onDenied(permissions: List<String>, neverShowAgain: Boolean) {
//                // The user has refused permission and no longer prompts
//                // Guide users to manually open permissions in the settings
//            }
//        })
    }



    override fun onDestroy() {
        super.onDestroy()
    }
}
