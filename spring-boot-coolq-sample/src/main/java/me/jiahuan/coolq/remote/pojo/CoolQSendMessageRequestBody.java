package me.jiahuan.coolq.remote.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//    {
//        "message_type": "private",
//            "user_id": 461866620,
//            "group_id": 1020213551,
//            "message": "test"
//    }
@Data
@Builder
public class CoolQSendMessageRequestBody {
    private String message_type;

    private Long user_id;

    private Long group_id;

    private String message;
}
