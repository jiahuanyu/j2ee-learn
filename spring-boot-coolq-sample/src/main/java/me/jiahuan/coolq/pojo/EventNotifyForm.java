package me.jiahuan.coolq.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class EventNotifyForm {
    @NotNull
    private String post_type;

    private String message_type;

    private Long group_id;

    private Long user_id;

    private String message;
}
