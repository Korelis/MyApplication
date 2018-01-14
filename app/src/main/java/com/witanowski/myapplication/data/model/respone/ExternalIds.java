package com.witanowski.myapplication.data.model.respone;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Michal on 2018-01-14.
 */

public class ExternalIds {

    @SerializedName("plurimedia")
    @Expose
    private Integer plurimedia;

    public Integer getPlurimedia() {
        return plurimedia;
    }

    public void setPlurimedia(Integer plurimedia) {
        this.plurimedia = plurimedia;
    }

}
