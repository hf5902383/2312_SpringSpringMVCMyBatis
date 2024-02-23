package fanghou.email.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserCache {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.auto");
        UserCache userCache = context.getBean(UserCache.class);
        System.out.println(userCache);
    }
}
