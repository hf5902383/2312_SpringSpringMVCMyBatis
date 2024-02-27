package fanghou.emal.egmybatis2;

import fanghou.emal.egmybatis2.mapper.ProductMapper;
import fanghou.emal.egmybatis2.pojo.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Egmybatis2ApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private ProductMapper productMapper;

    @Test
    void insertProductTest(){
        Product product = new Product();
        product.setPrice(355);
        product.setStock(214);
        product.setTitle("iphone");
        System.out.println(productMapper.insertProduct(product));
    }

    @Test
    void selectSingleProductTest(){
        System.out.println(productMapper.selectSingleProduct(3));
    }

    @Test
    void deleteByIdTest(){
        System.out.println(productMapper.deleteById(5));
    }





}
