package cn.eg1.egmybatis1;

import cn.eg1.egmybatis1.mapper.ProductMapper;
import cn.eg1.egmybatis1.pojo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Egmybatis1ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private ProductMapper productMapper;


    @Test
    void insertProductTest(){
        Product product = new Product();
        product.setPrice(389);
        product.setStock(197);
        product.setTitle("TSLA");
        System.out.println(productMapper.insertProduct(product));

    }

    @Test
    void selectSingleProductTest(){
        System.out.println(productMapper.selectSingleProduct(2));

    }

    @Test
    void deleteByIdTest(){
        System.out.println(productMapper.deleteById(1));
    }

    @Test
    void selectManyProductTest(){
        System.out.println(productMapper.selectManyProduct());
    }



}
