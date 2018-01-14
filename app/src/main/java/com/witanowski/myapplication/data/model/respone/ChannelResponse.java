package com.witanowski.myapplication.data.model.respone;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Michal on 2018-01-14.
 */

public class ChannelResponse {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("externalIds")
    @Expose
    private ExternalIds externalIds;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("highlights")
    @Expose
    private List<Highlight> highlights = null;
    @SerializedName("urlSections")
    @Expose
    private String urlSections;
    @SerializedName("additionalProperties")
    @Expose
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ExternalIds getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(ExternalIds externalIds) {
        this.externalIds = externalIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Highlight> getHighlights() {
        return highlights;
    }

    public void setHighlights(List<Highlight> highlights) {
        this.highlights = highlights;
    }

    public String getUrlSections() {
        return urlSections;
    }

    public void setUrlSections(String urlSections) {
        this.urlSections = urlSections;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
