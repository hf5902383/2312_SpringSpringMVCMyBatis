package fanghou.email._05WEIBO.mapper;

import fanghou.email._05WEIBO.pojo.entity.User;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import org.springframework.stereotype.Repository;



//可以不加，会飘红
@Repository
public interface UserMapper {

    /**
     *  1. 注册功能，查询接口
     *   *关于查询什么字段的问题
     *   *注册功能【id】：任何字段都可以，比如id
     *
     *  对于登陆功能【password】：
     *   *未查到用户名：用户名错误
     *   *查到：比较密码
     *
     *   获取当前用户功能【nickname】：
     *    *查询nickname
     *
     *   一条sql解决上述功能：Select id, password, nickname From blog.user
     */

    //插入数据
    int regUser(User user);

    //注册功能： 通过username去查找对错
    UserVo selectByUsername(String username);






}
