package cn.tedu._04mybaits;

import cn.tedu._04mybaits.mapper.CommentMapper;
import cn.tedu._04mybaits.mapper.UserMapper;
import cn.tedu._04mybaits.mapper.WeiboMapper;
import cn.tedu._04mybaits.pojo.entity.Comment;
import cn.tedu._04mybaits.pojo.entity.User;
import cn.tedu._04mybaits.pojo.entity.Weibo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Date;

@SpringBootTest
class ApplicationTests {

    @Test
    void contextLoads() {
    }

    /**object DI 自动装配 @Autowire 第一步寻找[接口类型] 通过@Mapper创建
     * @Mapper 自动给 Mybatis 创建一个实现类 UserMapper
     * SpringFramework 创建一个IOC容器 放入 SpringBean 对象 userMapperImpl
     * DI 回到 userMapper
     * 调用方法 void insertUser（User user） 将该SQL转为底层JDBC代码，操作数据库
     */
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private WeiboMapper weiboMapper;
    @Autowired
    private CommentMapper commentMapper;

    @Test
    void insertUserTest(){
        User user = new User();
        user.setId(111L);
        user.setUsername("传奇叔叔");
        user.setPassword("123456");
        user.setNickname("范传奇");
        user.setCreated(new Date());
        userMapper.insertUser(user);

    }

    @Test
    void insertWeiboTest(){
        Weibo weibo = new Weibo();
        weibo.setContent("tom的第4条微博");
        weibo.setCreated(new Date());
        weibo.setUserId(101L);

        weiboMapper.insertWeibo(weibo);
    }

    @Test
    void deleteByIdTest(){
        System.out.println(weiboMapper.deleteById(111L));
    }

    @Test
    void updateByIdTest(){
        Weibo weibo = new Weibo();
        weibo.setId(200L);
        weibo.setContent("good good study day day up");
        weibo.setCreated(new Date());
        weibo.setUserId(110L);
        System.out.println(weiboMapper.updateById(weibo));
    }

    @Test
    void selectByIdTest(){
        System.out.println(weiboMapper.selectById(200L));
    }

    @Test
    void selectAllTest(){
        System.out.println(weiboMapper.selectAll());
    }

    @Test
    void selectWeiboIdTest(){
        System.out.println(weiboMapper.selectByWeiboId(200L));
    }

    @Test
    void insertCommentTest(){
        Comment comment = new Comment();
        comment.setContent("Fang said yes Mother Fucker");
        comment.setCreated(new Date());
        comment.setUserId(103L);
        comment.setWeiboId(202L);
        System.out.println(commentMapper.insertProduct(comment));
    }

    @Test
    void updateCommentTest(){
        Comment comment = new Comment();
        comment.setId(305L);
        comment.setContent("Fang lose 100 box cause toxic");
        comment.setCreated(new Date());
        comment.setWeiboId(203L);
        comment.setUserId(102L);
        System.out.println(commentMapper.UpdateById(comment));
    }

    @Test
    void deleteCommentTest(){
        System.out.println(commentMapper.deleteById(305L));
    }

    @Test
    void selectCommentById1(){
        System.out.println(commentMapper.selectCommentById1(300L));
    }

    @Test
    void selectCommentById2(){
        System.out.println(commentMapper.selectCommentById2(300L));
    }

    @Test
    void dynamicUpdateTest(){

        Comment comment = new Comment();
        comment.setId(302L);
        comment.setCreated(new Date());
        comment.setContent("good poem");
        System.out.println(commentMapper.dynamicUpdate(comment));
    }

    @Test
    void dynamicDeleteTest(){
        Long[] delete = {304L,305L};
        System.out.println(commentMapper.dynamicDelete(delete));
    }

    @Test
    void dynamicDeleteTest1(){
        ArrayList<Long> delete = new ArrayList<>();
        delete.add(303L);
        delete.add(304L);
        delete.add(305L);
        System.out.println(commentMapper.dynamicDelete1(delete));

    }
    @Test
    void selectCount(){
        System.out.println(commentMapper.selectCount());
    }

}
