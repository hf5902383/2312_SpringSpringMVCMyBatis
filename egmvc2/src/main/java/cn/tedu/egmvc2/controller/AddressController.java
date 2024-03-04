package cn.tedu.egmvc2.controller;

import cn.tedu.egmvc2.mapper.AddressMapper;
import cn.tedu.egmvc2.pojo.entity.Address;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/address/")
public class AddressController {

    @Autowired
    private AddressMapper addressMapper;

    @RequestMapping(value = "insert")
    public String insertAddress(Address address){
        addressMapper.insertAddress(address);
        return "成功添加";
    }

    @RequestMapping("select")
    public List<Address> selectAddress(){
        return addressMapper.selectAddress();
    }


    @RequestMapping("update")
    public String updateAddress(Address address){
        addressMapper.updateAddress(address);
        return "Update Success";
    }

    @RequestMapping("delete")
    public String deleteAddress(){
        addressMapper.deleteAddress(1);
        return "Delete Success";
    }




}
