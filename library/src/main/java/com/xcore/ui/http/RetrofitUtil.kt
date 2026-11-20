package com.xcore.ui.http

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

/**
 *
 * author: Created by 闹闹 on 2018-09-29
 * version: 1.0.0
 */

class RetrofitUtil {

    private var retrofit: Retrofit? = null
    private val client = OkHttpClient.Builder()
        .connectTimeout(100, TimeUnit.SECONDS)
        .readTimeout(100, TimeUnit.SECONDS)
        .writeTimeout(100, TimeUnit.SECONDS).build()

    fun <T> createApi(baseUrl: String, clazz: Class<T>): T {
        if (retrofit == null) {
            synchronized(RetrofitUtil::class.java) {
                if (retrofit == null) {
                    val builder = Retrofit.Builder()
                    builder.baseUrl(baseUrl)
                    builder.client(client)
                    //设置数据解析器
                    // builder.addConverterFactory(GsonConverterFactory.create());
                    // builder.addCallAdapterFactory(RxJavaCallAdapterFactory.create());
                    retrofit = builder.build()
                }
            }
        }
        return retrofit!!.create(clazz)
    }
}
