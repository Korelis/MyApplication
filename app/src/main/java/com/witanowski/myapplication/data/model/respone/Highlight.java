package com.witanowski.myapplication.data.model.respone;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Michal on 2018-01-14.
 */

public class Highlight {

    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("pics")
    @Expose
    private List<Pic> pics = null;
    @SerializedName("broadcast_id")
    @Expose
    private Integer broadcastId;

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public List<Pic> getPics() {
        return pics;
    }

    public void setPics(List<Pic> pics) {
        this.pics = pics;
    }

    public Integer getBroadcastId() {
        return broadcastId;
    }

    public void setBroadcastId(Integer broadcastId) {
        this.broadcastId = broadcastId;
    }

}
