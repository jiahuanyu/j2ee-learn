package me.jiahuan.spring.annotation.config;

import me.jiahuan.spring.annotation.condition.MacSystemCondition;
import me.jiahuan.spring.annotation.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类，替换原 xml 配置
 */
@Conditional(value = {MacSystemCondition.class})
@Configuration
public class AppConfig {
    @Bean
    public User user() {
        return new User("张三", 100);
    }
}
