package fanghou.email.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserXml {
    public static void main(String[] args) {
        /*
        1.创建Ioc容器【xml】
        2.获取Spring Bean 对象
        3。测试
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserXml userXml = context.getBean(UserXml.class);
        userXml.run();
        System.out.println("UserXml=" + userXml);
    }
}
