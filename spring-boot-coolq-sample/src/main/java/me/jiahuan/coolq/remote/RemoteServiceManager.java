package me.jiahuan.coolq.remote;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RemoteServiceManager {

    private static Retrofit retrofit;

    private RemoteServiceManager() {

    }

    public static RemoteServiceManager getInstance() {
        retrofit = new Retrofit.Builder()
                .baseUrl("http://172.18.0.1:5700/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return new RemoteServiceManager();
    }


    public CoolQRemoteService getCoolQRemoteService() {
        return retrofit.create(CoolQRemoteService.class);
    }
}
