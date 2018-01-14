package com.witanowski.myapplication.data.model.respone;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Michal on 2018-01-14.
 */

public class Pic {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("size_info")
    @Expose
    private String sizeInfo;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSizeInfo() {
        return sizeInfo;
    }

    public void setSizeInfo(String sizeInfo) {
        this.sizeInfo = sizeInfo;
    }

}
