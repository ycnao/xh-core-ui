package com.xcore.ui.model;

import android.widget.ImageView;

import java.io.Serializable;
import java.util.Date;

/**
 * 相册/影集
 */
public class AlbumItem implements Serializable, Cloneable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String duration;
    private boolean image;
    private Date t;
    private long size;
    private String path;

    public boolean no_player;
    public ImageView image_view;
    public String video_path;
    public String file_name;
    public boolean selected = false;

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public boolean getImage() {
        return image;
    }

    public void setImage(boolean image) {
        this.image = image;
    }

    public Date getDate() {
        return t;
    }

    public void setDate(Date t) {
        this.t = t;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean equals(Object obj) {
        if (this == obj) {//���������ͬһ��ʵ��
            return true;
        }
        if (obj != null && obj instanceof AlbumItem) {
            AlbumItem u = (AlbumItem) obj;
            return this.image == u.image && this.t.equals(u.t);
        } else {
            return false;
        }
    }

    /*
     * 不重写Object.clone()方法的话在目标类内部仍然可以调用目标类.clone()，但浅层拷贝导致共享同一个StringBuffer对象，这是很危险的。
     * */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //return super.clone();
        AlbumItem item = new AlbumItem();
        item.setImage(this.image);
        item.setSize(this.size);
        item.setDate(this.t);
        item.setPath(this.path);
        item.video_path = this.video_path;
        item.file_name = this.file_name;
        return item;
    }
}
