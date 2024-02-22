package fanghou.email.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDao {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.bean");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("userDao: "+ userDao);

    }
}
