package fanghou.email.spring.example;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*
            通过new方式创建对象
         */
        User user = new User();
        user.run();

        /*
        方式2 通过反射的方式
         */
        Class zz = Class.forName("fanghou.email.spring.example.User");
        User user2 = (User)zz.newInstance();
        user2.run();

        /*
            方式3 通过SpringFramework的方式 创建对象
                   1.SpringFramework 扫描所有指定路径下的类， 将所有加着@Component注解得类， 创建Spring Bean对象，
                   将这些Bean对象放入 Ioc容器
                   2. getBean()方法，可以将Ioc容器中获取制定类的Bean对象
                   3. 调用user3 中的run()方法
         */
        //扫描所有的目录,是一个接口              赋值  注解配置的扫描所有目录
        ApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.example");
        //创建一个 User类型的对象   赋值  Ioc容器中的Bean对象 //通过反射获取 User类型Type类型的Ioc文件中的Bean对象
        User user3 = context.getBean(User.class);


        user3.run();
    }
}
