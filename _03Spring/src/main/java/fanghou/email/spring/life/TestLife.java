package fanghou.email.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class TestLife {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.life");
        Life life = context.getBean(Life.class);

        //使用阶段
        System.out.println("4.使用阶段");

        context.close();


    }

}
