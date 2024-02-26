package fanghou.email.spring.config;

import fanghou.email.spring.bean.UserDao;
import fanghou.email.spring.eg2.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试类
 */
public class TestSpringConfig {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        //获取eg2.Product
        Product product = context.getBean(Product.class);
        System.out.println("Product:" + product);
        //获取bean.UserDao
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println("UserDao"+ userDao);

    }
}
