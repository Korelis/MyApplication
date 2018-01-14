package com.witanowski.myapplication.data.remote;

/**
 * Created by Michal Witanowski on 2017-08-17.
 */

public class APIUtils {

    public static final String BASE_URL = "https://btv.leankr.com/api/v1/";

    public static APIService getAPIService() {
        return RetrofitClient.getClient(BASE_URL).create(APIService.class);
    }
}
