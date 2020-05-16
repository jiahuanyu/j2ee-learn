package me.jiahuan.coolq.controller;

import me.jiahuan.coolq.pojo.EventNotifyForm;
import me.jiahuan.coolq.remote.RemoteServiceManager;
import me.jiahuan.coolq.remote.pojo.CoolQSendMessageRequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.io.IOException;


@RestController
@Validated
public class EventController {

    private final Logger logger = LoggerFactory.getLogger(EventController.class);

    @PostMapping("/event")
    public String notifyEvent(@RequestBody @Valid EventNotifyForm eventNotifyForm) throws IOException {
        logger.info(eventNotifyForm + "");

        String postType = eventNotifyForm.getPost_type();

        if (!"message".equals(postType)) {
            return "";
        }

        String message = eventNotifyForm.getMessage();

        if (message == null) {
            return "";
        }

        String messageType = eventNotifyForm.getMessage_type();

        if (messageType == null) {
            return "";
        }

        boolean isGroupMessage = eventNotifyForm.getGroup_id() != null;

        String language = "";

        if (message.toLowerCase().matches("(.*p.*y.*t.*h.*o.*n.*)")) {
            logger.info("python");
            language = "python";
        } else if (message.toLowerCase().contains("java")) {
            logger.info("java");
            language = "java";
        } else if (message.toLowerCase().contains("tcp/ip")) {
            logger.info("tcp/ip");
            language = "tcp/ip";
        } else if (message.toLowerCase().contains("c++")) {
            logger.info("c++");
            language = "c++";
        } else if (message.toLowerCase().contains("数据库")) {
            logger.info("数据库");
            language = "数据库";
        }

        if (language.isEmpty() && isGroupMessage) {
            return "";
        }

        String messageInfo;

        if (isGroupMessage) {
            messageInfo = "您好，请问您是有" + language + "的相关需求吗，可以加我们的官方微信号：leekceo" +
                    " 聊聊，如果您是个人项目，请注明语言，并在添加成功后发送需求文件及截止日期。如果您是公司项目，请在添加成功后发送需求文档以便我们进行项目评估及报价。（9:00A.M-9:00P.M. " +
                    "周一到周六）";
        } else {
            messageInfo = "您好，可以加我们的官方微信号：leekceo " +
                    "聊聊，如果您是个人项目，请注明语言，并在添加成功后发送需求文件及截止日期。如果您是公司项目，请在添加成功后发送需求文档以便我们进行项目评估及报价。（9:00A.M-9:00P.M. 周一到周六）";
        }

        RemoteServiceManager.getInstance().getCoolQRemoteService().sendMessage(
                CoolQSendMessageRequestBody
                        .builder()
                        .message_type("private")
                        .user_id(eventNotifyForm.getUser_id())
                        .message(messageInfo)
                        .build()
        ).execute();

        return "";
    }
}
