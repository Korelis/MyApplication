package com.witanowski.myapplication.data.remote;

import com.witanowski.myapplication.data.model.respone.ChannelResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;

/**
 * Created by Michal on 2018-01-14.
 */

public interface APIService {
    @GET("channels")
    Call<List<ChannelResponse>> getChannels();
}
