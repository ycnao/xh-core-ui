package com.xcore.ui.model;


public class ExcelBean {

    // ExcelProperty：指定列名，index指定列的顺序
    private String id;
    private String type;
    private String text;
    private String time;

    public ExcelBean() {
    }

    public ExcelBean(String id, String type, String text, String time) {
        this.id = id;
        this.type = type;
        this.text = text;
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
