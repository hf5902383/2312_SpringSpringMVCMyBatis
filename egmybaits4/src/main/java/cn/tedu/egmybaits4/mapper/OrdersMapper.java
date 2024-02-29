package cn.tedu.egmybaits4.mapper;

import cn.tedu.egmybaits4.pojo.entity.Orders;
import cn.tedu.egmybaits4.pojo.vo.OrderListVo1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OrdersMapper {
    int insertOrders(Orders orders);

    List<OrderListVo1> selectOrderMap(String name);

    int dynamicUpdateById(Orders orders);

}
