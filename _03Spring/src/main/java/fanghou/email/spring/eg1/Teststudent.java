package fanghou.email.spring.eg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststudent {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-student.xml");
        Student student= context.getBean(Student.class);
        System.out.println(student);

    }
}
