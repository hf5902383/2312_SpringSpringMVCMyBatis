package fanghou.email.spring.eg4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class ShopController {
    private String add;

    public ShopController() {
        System.out.println("1初始化");
    }

    @Value("zzz")
    public void setAdd(String add) {
        this.add = add;
        System.out.println("2 set ");
    }

    @PostConstruct
    public void init(){
        System.out.println("3 init");
    }

    @PreDestroy
    public void close(){
        System.out.println("5. close");
    }

}
