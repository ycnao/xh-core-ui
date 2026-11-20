package com.xcore.ui.http.model;

/**
* 请求对象对应的bean
* author：created by 闹闹 on 2025/10/29
* version：v1.0.0
*/
public class RequestBean {

    private String host;
    private String service;

    public RequestBean(String host, String service) {
        this.host = host;
        this.service = service;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}

