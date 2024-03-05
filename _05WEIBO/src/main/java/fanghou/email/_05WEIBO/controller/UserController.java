package fanghou.email._05WEIBO.controller;

import fanghou.email._05WEIBO.mapper.UserMapper;
import fanghou.email._05WEIBO.pojo.dto.UserLoginDTO;
import fanghou.email._05WEIBO.pojo.dto.UserRegDTO;
import fanghou.email._05WEIBO.pojo.entity.User;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;

@RestController
@RequestMapping("/v1/users/")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @PostMapping("reg")
    //@RequestBody: 将前端的javascript对象格式转变成 json格式 并赋值到DTO中
    public int regUser(@RequestBody UserRegDTO userRegDTO){
        /**
         * 梳理逻辑，确定接口
         * 1.接收客户端传递来的数据
         * 2.校验合法性
         * 3.确定是否被占用【查询数据接口】
         * 4/未被占用，插入数据 return 1
         * 5.被占用，return 2
         */
        System.out.println("userRegDTO = " + userRegDTO);//接收前端测试



        //查询是否被占用
        UserVo userVo = userMapper.selectByUsername(userRegDTO.getUsername());
        if (userVo != null){
            return 2;
        }else {
            User user = new User();
            BeanUtils.copyProperties(userRegDTO,user);
            user.setCreated(new Date());
            userMapper.regUser(user);
            return 1;
        }
    }

    @PostMapping("login")
    public int login(@RequestBody UserLoginDTO userLoginDTO, HttpSession session){
        System.out.println("userLoginDTO = " + userLoginDTO);
        UserVo userVo = userMapper.selectByUsername(userLoginDTO.getUsername());
        if (userVo == null){
            return 3;
        }

        if (userLoginDTO.getPassword().equals(userVo.getPassword())){
            session.setAttribute("user", userVo);
            return 1;
        }
        return 2;
    }


    //获取当前用户功能
    @GetMapping("currentUser")
    public UserVo currentUser(HttpSession session){
        UserVo userVo = (UserVo) session.getAttribute("user");
        return userVo;

    }

    //退出登陆
    @GetMapping("logout")
    public void logout(HttpSession session){
        session.removeAttribute("user");
    }



}
