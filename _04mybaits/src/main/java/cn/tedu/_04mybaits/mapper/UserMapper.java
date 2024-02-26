package cn.tedu._04mybaits.mapper;

import cn.tedu._04mybaits.pojo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Mapper注解： MyBatis框架的注解，会为该接口创建实现类
 */
@Mapper
public interface UserMapper {
    /**
     * 用户表插入一条数据
     */
    @Insert("INSERT INTO user(id,username,password,nickname,created) VALUES(#{id},#{username},#{password},#{nickname},#{created})")
    int insertUser(User user);
}
