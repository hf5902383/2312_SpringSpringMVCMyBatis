package cn.tedu._04mybaits.mapper;

import cn.tedu._04mybaits.pojo.entity.Comment;
import cn.tedu._04mybaits.pojo.vo.Commentvo1;
import cn.tedu._04mybaits.pojo.vo.Commentvo2;
import cn.tedu._04mybaits.pojo.vo.Weibovo1;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {
    @Insert("INSERT INTO comment (content,created,user_id,weibo_id) VALUES (#{content},#{created},#{userId},#{weiboId})")
    int insertProduct(Comment comment);

    @Update("UPDATE comment SET id=#{id},content=#{content},created=#{created},user_id=#{userId},weibo_id=#{weiboId} WHERE id=#{id}")
    int UpdateById(Comment comment);

    @Delete("DELETE FROM comment WHERE id=#{id}")
    int deleteById(Long id);

    @Select("SELECT content, user_id AS userId, weibo_id AS weiboId FROM comment WHERE id=#{id}")
    Commentvo1 selectCommentById1(Long id);

    @Select("SELECT content, user_id AS userId FROM comment WHERE id=#{id}")
    List<Commentvo2> selectCommentById2(Long weiboId);
}
