package com.xcore.ui.http.model;

import org.json.JSONArray;
import org.json.JSONObject;

/**
* 接口统一返回json对象对应的bean
* author：created by 闹闹 on 2025/10/29
* version：v1.0.0
*/
public class ResponseJsonBean {

    private int code;
    private String msg; //描述
    private Object data; //返回结果数据。不定类型,根据具体情况在转型处理。

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return msg;
    }

    public void setMessage(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public <T> T getData(Class<T> class1) {
        if (data == null) {
            throw new NullPointerException("data == null");
        }
        if (data instanceof String) {
            String data1 = (String) data;
            return (T) data1;
        } else if (data instanceof JSONObject) {
            JSONObject data1 = (JSONObject) data;
            return (T) data1;
        } else if (data instanceof Boolean) {
            Boolean data1 = (Boolean) data;
            return (T) data1;
        } else if (data instanceof Long) {
            Long data1 = (Long) data;
            return (T) data1;
        } else if (data instanceof Double) {
            Double data1 = (Double) data;
            return (T) data1;
        } else if (data instanceof JSONArray) {
            JSONArray data1 = (JSONArray) data;
            return (T) data1;
        } else if (data instanceof Integer) {
            Integer data1 = (Integer) data;
            return (T) data1;
        } else {
            return null;
        }
    }


    @Override
    public String toString() {
        return "ResponseJsonBean{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}

