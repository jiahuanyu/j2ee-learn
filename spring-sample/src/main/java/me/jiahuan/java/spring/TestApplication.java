package me.jiahuan.java.spring;

import me.jiahuan.java.spring.pojo.User;
import me.jiahuan.java.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("me.jiahuan.java.spring")
public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TestApplication.class);
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        User user2 = applicationContext.getBean("user", User.class);
        System.out.println(user == user2);

        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.get();
    }
}
