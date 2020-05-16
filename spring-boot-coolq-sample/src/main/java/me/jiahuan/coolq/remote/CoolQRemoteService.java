package me.jiahuan.coolq.remote;

import me.jiahuan.coolq.remote.pojo.CoolQSendMessageRequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CoolQRemoteService {
    @POST("/send_msg")
    Call<Object> sendMessage(@Body CoolQSendMessageRequestBody coolQSendMessageRequestBody);
}
