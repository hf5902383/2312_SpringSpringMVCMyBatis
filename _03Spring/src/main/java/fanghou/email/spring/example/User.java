package fanghou.email.spring.example;
import org.springframework.stereotype.Component;

//吧User class 通过注解的方式 交给框架
@Component
public class User {
    public void run(){
        System.out.println("Hello, Spring Framework");
    }
}
