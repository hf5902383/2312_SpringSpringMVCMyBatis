package cn.tedu.egmvc2.mapper;

import cn.tedu.egmvc2.pojo.entity.Address;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressMapper {

    int insertAddress(Address address);

    List<Address> selectAddress();

    int deleteAddress(Integer id);

    int updateAddress(Address address);
}
