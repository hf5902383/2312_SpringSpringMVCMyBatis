package cn.tedu._05mvcboot02.controller;

import cn.tedu._05mvcboot02.mapper.UserMapper;
import cn.tedu._05mvcboot02.pojo.dto.AddUserDTO;
import cn.tedu._05mvcboot02.pojo.entity.User;
import cn.tedu._05mvcboot02.pojo.vo.UserListVo1;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Controller : 接收返回http文件
 * ResponseBody： 接收返回JSON格式 文件
 * @RestController 两者结合
 */
@RestController
@RequestMapping("v1/users")
public class UserController {
    //自动装配
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/insert")
    public String addUser(AddUserDTO addUserDTO){
        //soutp
        System.out.println("addUserDTO = " + addUserDTO);

        User user = new User();
        //赋值属性
        //user.setUserName(addUserDTO.getUserName());
        BeanUtils.copyProperties(addUserDTO, user);
        user.setCreated(new Date());
        //调用接口方法，插入数据
        userMapper.insertUser(user);
        return "add Users success";
    }

    /**
     * 查询所有的用户密码
     */
    @RequestMapping("userList")

    public List<UserListVo1> userList(){

        return userMapper.selectUser();
    }

    @RequestMapping("userDelete")
    public String userDelete(Integer id){
        userMapper.deleteUser(id);
        return "删除成功" + id;
    }

    @RequestMapping("userUpdate")
    public String userUpdate(User user){
        userMapper.userUpdate(user);
        return "update Success";
    }

}
