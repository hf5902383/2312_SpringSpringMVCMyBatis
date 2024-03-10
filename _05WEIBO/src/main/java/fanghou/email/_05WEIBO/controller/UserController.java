package fanghou.email._05WEIBO.controller;

import fanghou.email._05WEIBO.common.response.JsonResult;
import fanghou.email._05WEIBO.common.response.ServiceCodeEnum;
import fanghou.email._05WEIBO.mapper.UserMapper;
import fanghou.email._05WEIBO.pojo.dto.UserLoginDTO;
import fanghou.email._05WEIBO.pojo.dto.UserRegDTO;
import fanghou.email._05WEIBO.pojo.entity.User;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Slf4j//日志注解 lombok提供
@RestController//可以同时接收发送信息跟client端
@RequestMapping("/v1/users/")//映射位置
@Api(tags = "UserController interface")
public class UserController {

    @Autowired
    private UserMapper userMapper;


    @ApiOperation("注册用户信息")
    @PostMapping("reg")
    //@RequestBody: 将前端的javascript对象格式转变成 json格式 并赋值到DTO中
    public JsonResult regUser(@RequestBody UserRegDTO userRegDTO){
        /**
         * 梳理逻辑，确定接口
         * 1.接收客户端传递来的数据
         * 2.校验合法性
         * 3.确定是否被占用【查询数据接口】
         * 4/未被占用，插入数据 return 1
         * 5.被占用，return 2
         */
        //日志方式打印输出
        log.debug("userRegDTO =" + userRegDTO);

        //查询是否被占用
        UserVo userVo = userMapper.selectByUsername(userRegDTO.getUsername());
        if (userVo != null){
            return new JsonResult(ServiceCodeEnum.USERCONTROLLER_REG_USERNAME_EXIST_ERROR);
        }else {
            User user = new User();
            BeanUtils.copyProperties(userRegDTO,user);
            user.setCreated(new Date());
            userMapper.regUser(user);
            return JsonResult.ok();
        }
    }

    @ApiOperation("微博登陆功能")
    @PostMapping("login")
    public JsonResult login(@RequestBody UserLoginDTO userLoginDTO, @ApiIgnore HttpSession session){
        System.out.println("userLoginDTO = " + userLoginDTO);
        UserVo userVo = userMapper.selectByUsername(userLoginDTO.getUsername());
        if (userVo == null){
            return new JsonResult(ServiceCodeEnum.USERCONTROLLER_LOGIN_USERNAME_ERROR);
        }

        if (userLoginDTO.getPassword().equals(userVo.getPassword())){
            session.setAttribute("user", userVo);
            return new JsonResult(ServiceCodeEnum.SUCCESS, userLoginDTO.getUsername());

        }
        return new JsonResult(ServiceCodeEnum.USERCONTROLLER_LOGIN_PASSWORD_ERROR);
    }

    //获取当前用户功能
    @ApiOperation("获取当前用户信息")
    @GetMapping("currentUser")
    public JsonResult currentUser(@ApiIgnore HttpSession session){
        UserVo userVo = (UserVo) session.getAttribute("user");
        return new JsonResult(ServiceCodeEnum.SUCCESS, userVo);
        //return userVo;

    }
    //退出登陆
    @ApiOperation("退出登陆功能")
    @GetMapping("logout")
    public JsonResult logout(@ApiIgnore HttpSession session){
        session.removeAttribute("user");
        return new JsonResult(ServiceCodeEnum.SUCCESS);
    }



}
