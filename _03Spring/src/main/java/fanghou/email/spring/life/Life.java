package fanghou.email.spring.life;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Life {

    private String destiny;

    public Life() {
        System.out.println("1.Declaration ,调用无参构造");
    }

    @Value("Student hard")
    public void setDestiny(String destiny) {
        this.destiny = destiny;
        System.out.println("2.属性赋值【调用set方法】");
    }

    //生命周期初始化方法
    @PostConstruct
    public void init(){
        System.out.println("3.初始化开始执行 【init方法】");
    }

    //销毁阶段
    @PreDestroy
    public void destory(){
        System.out.println("5.销毁阶段 执行destory方法");
    }
}
