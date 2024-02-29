package cn.tedu.egmybaits4;

import cn.tedu.egmybaits4.mapper.OrdersMapper;
import cn.tedu.egmybaits4.pojo.entity.Customers;
import cn.tedu.egmybaits4.pojo.entity.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class OrderApplicationTests {
    @Autowired
    private OrdersMapper ordersMapper;
    @Test
    void insertCustomersTest(){
        Orders orders = new Orders();
        orders.setOrderId("202301020004");
        orders.setOrderDate(new Date());
        orders.setCustId("0004");
        orders.setStatus(3);
        orders.setProductsNum(4);
        orders.setAmt(800.88);

        System.out.println(ordersMapper.insertOrders(orders));
    }
    @Test
    void selectOrderTest1(){
        System.out.println(ordersMapper.selectOrderMap("Jerry"));
    }

    @Test
    void dynamicUpdateById(){
        Orders orders = new Orders();
        orders.setCustId("0003");
        orders.setOrderId("202301020002");
        orders.setStatus(10);
        System.out.println(ordersMapper.dynamicUpdateById(orders));
    }
}
