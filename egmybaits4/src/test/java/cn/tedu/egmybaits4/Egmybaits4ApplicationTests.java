package cn.tedu.egmybaits4;

import cn.tedu.egmybaits4.mapper.CustomersMapper;
import cn.tedu.egmybaits4.pojo.entity.Customers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Egmybaits4ApplicationTests {

    @Autowired
    private CustomersMapper customersMapper;
    @Test
    void contextLoads() {
    }

    @Test
    void insertCustomersTest(){
        Customers customers = new Customers();
        customers.setCity("成都");
        customers.setCustTel("13811112222");
        customers.setCustName("Tony");
        customers.setCustId("0005");
        System.out.println(customersMapper.insertCustomers(customers));
    }

    @Test
    void selectMapCustomers(){
        System.out.println(customersMapper.selectMapCustomers("0003"));
    }

    @Test
    void selectMapCustomers1(){
        System.out.println(customersMapper.selectMapCustomers1("北京"));
    }

}
