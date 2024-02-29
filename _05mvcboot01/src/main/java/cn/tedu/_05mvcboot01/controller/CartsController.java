package cn.tedu._05mvcboot01.controller;

import cn.tedu._05mvcboot01.pojo.dto.UpdateDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CartsController {
    /**
     * 1。添加购物车功能 GET方法
     */
    @RequestMapping(value = "v1/carts/addCart")
    @ResponseBody
    public String addCart(HttpServletRequest request){
        String title = request.getParameter("title");
        String price = request.getParameter("price");
        return "添加购物车成功"+"Title: "+title+"\n Price: "+price;
    }

    @RequestMapping(value = "v1/carts/deleteCart")
    @ResponseBody
    public String deleteCart(String username, Integer id){

        return "删除成功"+ username + id;
    }


    @RequestMapping(value = "v1/carts/updateCart")
    @ResponseBody
    public String updateCart(UpdateDTO updateDTO){
        String title = updateDTO.getTitle();
        Integer price = updateDTO.getPrice();
        Integer number = updateDTO.getNumber();
        return "upload success" + title + price + number;
    }



}
