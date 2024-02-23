package fanghou.email.spring.eg2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {
    @Value("dda")
    private String title;
    @Value("123")
    private int num;
    private String comment;

    @Value("bbc")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "product{" +
                "title='" + title + '\'' +
                ", num=" + num +
                ", comment='" + comment + '\'' +
                '}';
    }
}
