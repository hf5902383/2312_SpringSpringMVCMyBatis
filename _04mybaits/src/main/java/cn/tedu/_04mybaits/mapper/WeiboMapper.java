package cn.tedu._04mybaits.mapper;

import cn.tedu._04mybaits.pojo.entity.Weibo;
import cn.tedu._04mybaits.pojo.vo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface WeiboMapper {
    //@Insert("INSERT INTO weibo(content,created,user_id) VALUES(#{content},#{created},#{userId})")
    int insertWeibo(Weibo weibo);

    //@Delete("DELETE FROM weibo WHERE id=#{id}")
    int deleteById(Long id);

    //@Update("UPDATE weibo SET content=#{content},created=#{created},user_id=#{userId} WHERE id=#{id}")
    int updateById(Weibo weibo);

    //@Select("SELECT id, content, created, user_id AS userId FROM weibo WHERE id=#{id}")
    Weibo selectById(Long id);

    //@Select("SELECT id, content, created, user_id AS userId FROM weibo")
    List<Weibo> selectAll();

    //@Select("SELECT content, user_id AS userId FROM weibo WHERE id=#{id}")
    Weibovo1 selectByWeiboId(Long id);

    //多表联查：
    List<WeiboIndexVO> selectIndex();

    List<WeiboDetailVO> selectDetailById(Long id);

    WeiboMapV01 selectMap1(Long id);

    WeiboMapVo2 selectMap2(Long uid);

    WeiboMapVo3 selectMap3(Long wid);

    WeiboMapVo4 selectMap4(Long wid);

}
