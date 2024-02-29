package cn.tedu.egmybaits4.mapper;

import cn.tedu.egmybaits4.pojo.entity.Customers;
import cn.tedu.egmybaits4.pojo.vo.CustomeVo1;
import cn.tedu.egmybaits4.pojo.vo.CustomeVo2;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomersMapper {
    int insertCustomers(Customers customers);

    CustomeVo1 selectMapCustomers(String custId);

    List<CustomeVo2> selectMapCustomers1(String city);


}
