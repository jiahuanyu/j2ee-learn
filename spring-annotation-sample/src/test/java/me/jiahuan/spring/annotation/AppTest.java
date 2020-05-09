package me.jiahuan.spring.annotation;

import me.jiahuan.spring.annotation.config.AppConfig;
import me.jiahuan.spring.annotation.pojo.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class AppTest {

    @Test
    public void testAnnotationConfig() {
        System.out.println("============== testAnnotationConfig Start ==============");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Arrays.stream(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
        User user = applicationContext.getBean(User.class);
        System.out.println(user);
        System.out.println("============== testAnnotationConfig End ==============");
    }
}
