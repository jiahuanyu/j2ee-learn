package me.jiahuan.java.spring.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Data
public class User {
    private Long uid;
    @Value("Jiahuan")
    private String name;
}
