package cn.tedu._05mvcboot02.mapper;

import cn.tedu._05mvcboot02.pojo.entity.User;
import cn.tedu._05mvcboot02.pojo.vo.UserListVo1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {
    /**
     * Insert User[使用实体类]
     */
    int insertUser(User user);

    /**
     * 查询 User
     * @return
     */
    List<UserListVo1> selectUser();

    int deleteUser(Integer id);

    int userUpdate(User user);

    User userSelectByid(Integer uid);


}
