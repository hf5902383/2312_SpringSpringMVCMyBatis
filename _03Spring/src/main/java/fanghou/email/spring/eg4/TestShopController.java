package fanghou.email.spring.eg4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestShopController {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("fanghou.email.spring.eg4");
        ShopController shopController = context.getBean(ShopController.class);
        System.out.println("4.使用对象");
        context.close();
    }
}
