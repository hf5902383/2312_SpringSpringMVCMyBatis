package fanghou.email.spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestWeiboMapper {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.resource");
        WeiboMapper weiboMapper = context.getBean(WeiboMapper.class);
        System.out.println(weiboMapper);
    }
}
