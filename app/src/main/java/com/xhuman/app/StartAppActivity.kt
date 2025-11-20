package com.xhuman.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.hjq.permissions.OnPermissionCallback
import com.hjq.permissions.XXPermissions
import com.xhuman.remote.g2.ui.G2MainActivity
import com.xhuman.remote.y3.ui.Y3MainActivity
import com.xzero.core.libs.utils.Utils

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
        val list = Utils.permissions()
//        XXPermissions.setCheckMode(Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU)
        XXPermissions.with(this).permission(list).request(object : OnPermissionCallback {

            override fun onGranted(permissions: List<String>, all: Boolean) {
                if (all) startActivity()
            }

            override fun onDenied(permissions: List<String>, neverShowAgain: Boolean) {
                // The user has refused permission and no longer prompts
                // Guide users to manually open permissions in the settings
                if (neverShowAgain) startActivity()
            }
        })
    }

    private fun startActivity() {
        if (isG2 == 0) startG2() else startY3()
    }

    private fun startG2() {
        val intent = Intent(this@StartAppActivity, G2MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun startY3() {
        val intent = Intent(this@StartAppActivity, Y3MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
