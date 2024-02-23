package fanghou.email.spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.scope");
        UserController userController1 = context.getBean(UserController.class);
        UserController userController = context.getBean(UserController.class);
        System.out.println(userController);
        System.out.println(userController1);


    }
}
