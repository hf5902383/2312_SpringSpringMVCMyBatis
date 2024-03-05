package cn.tedu._05mvcboot02.controller;

import cn.tedu._05mvcboot02.mapper.UserMapper;
import cn.tedu._05mvcboot02.pojo.dto.AddUserDTO;
import cn.tedu._05mvcboot02.pojo.entity.User;
import cn.tedu._05mvcboot02.pojo.vo.UserListVo1;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //@RequestMapping(value = "/insert",method = RequestMethod.POST)
    @PostMapping("insert")
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
    //@RequestMapping("userList")
    @GetMapping("userList")
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

    //查询指定用户信息：【路径传递数据】

    @GetMapping("{uid}")
    public User selectByUid(@PathVariable Integer uid){
        return userMapper.userSelectByid(uid);
    }

}
