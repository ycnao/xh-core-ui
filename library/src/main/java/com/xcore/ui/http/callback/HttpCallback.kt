package com.xcore.ui.http.callback

/**
 *
 * author: Created by 闹闹 on 2018-09-29
 * version: 1.0.0
 */
interface HttpCallback  {

    /**
     * 准备开始请求，可在UI主线程做交互
     */
    fun onStart()

    /**
     * 请求服务端失败。失败情况统一处理回调。
     *
     * @param description 返回description。
     */
    fun onFailure(description: String)

    /**
     * 请求成功。只有一种情形是成功的，返回客户端所期望的值的时候。否则就是失败的。
     *
     * @param responseJsonString 返回json字符串。
     */
    fun onSuccess(responseJsonString: String)

    /**
     * 请求完成后。该方法总是会在最后执行。
     */
    fun onFinish()

}
