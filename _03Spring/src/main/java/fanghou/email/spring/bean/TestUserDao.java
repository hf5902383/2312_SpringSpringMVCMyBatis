package fanghou.email.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.bean");
        UserService userService = context.getBean(UserService.class);
        System.out.println("userService: "+ userService);

    }
}
