package fanghou.email.egmybatis3;

import fanghou.email.egmybatis3.mapper.ProductMapper;
import fanghou.email.egmybatis3.pojo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class Egmybatis3ApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
    }

    @Test
    void insertProductTest(){
        Product product = new Product();
        product.setPrice(200);
        product.setStock(25);
        product.setTitle("ipad");
        System.out.println(productMapper.insertProduct(product));
    }

    @Test
    void selectSingleProductTest(){
        System.out.println(productMapper.selectSingleProduct(5));
    }

    @Test
    void deleteProductTest(){
        System.out.println(productMapper.deleteProduct(6));
    }

    @Test
    void deleteProduct1Test(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        System.out.println(productMapper.deleteProduct1(list));
    }

    @Test
    void dynamicUpdateTest(){
        Product product = new Product();
        product.setTitle("iWatch");
        product.setId(2);
        product.setPrice(200);
        System.out.println(productMapper.dynamicUpdate(product));
    }

    @Test
    void selectCountTest(){
        System.out.println(productMapper.selectCount());
    }



}
