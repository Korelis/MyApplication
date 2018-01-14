package com.witanowski.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.witanowski.myapplication.data.model.respone.ChannelResponse;
import com.witanowski.myapplication.data.remote.APIService;
import com.witanowski.myapplication.data.remote.APIUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        APIService service = APIUtils.getAPIService();
        Call<List<ChannelResponse>> call = service.getChannels();
        call.enqueue(new Callback<List<ChannelResponse>>() {
            @Override
            public void onResponse(Call<List<ChannelResponse>> call, Response<List<ChannelResponse>> response) {
                Log.d("blabla", response.raw().toString());
                if(response.isSuccessful()) {
                    if(response.body().get(0).getName() != null) {
                        Log.d("blabla", response.body().get(0).getName());
                    }
                    else
                        Log.d("blabla", "getName() null");
                }
                else
                    Log.d("blabla", "respone unsuccessful");

            }

            @Override
            public void onFailure(Call<List<ChannelResponse>> call, Throwable t) {
                Log.d("blabla", "fail");
            }
        });
    }
}
