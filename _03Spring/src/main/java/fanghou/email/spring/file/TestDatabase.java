package fanghou.email.spring.file;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDatabase {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.file");
        Database database = context.getBean(Database.class);
        System.out.println(database);
    }
}
