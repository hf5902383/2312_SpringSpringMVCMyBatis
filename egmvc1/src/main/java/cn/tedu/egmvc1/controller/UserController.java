package cn.tedu.egmvc1.controller;

import cn.tedu.egmvc1.pojo.dto.AddDTO;
import cn.tedu.egmvc1.pojo.dto.UpdateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/v1/users/insert")
    @ResponseBody
    public String addUser(AddDTO addDTO){
        String username= addDTO.getUsername();
        String password = addDTO.getPassword();
        String nickname = addDTO.getNickname();
        return "登录成功" + username +"\n"+ password+"\n"+nickname;
    }

    @RequestMapping("/v1/users/userList")
    @ResponseBody
    public String userList(){
        return "查询用户列表成功";
    }

    @RequestMapping(value = "/v1/users/delete")
    @ResponseBody
    public String deleteUser(Integer userid){
        return "Success delete" + userid;
    }

    @RequestMapping("/v1/users/update")
    @ResponseBody
    public String updateUser(UpdateDTO updateDTO){
        String username = updateDTO.getUsername();
        String password = updateDTO.getPassword();
        String nickname = updateDTO.getNickname();
        Integer userId = updateDTO.getUserId();
        return "Success update" + username +"\n"+ password +"\n"+ nickname  +"\n"+ userId;
    }
}
