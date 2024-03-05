package fanghou.email._05WEIBO.mapper;

import fanghou.email._05WEIBO.pojo.entity.Comment;
import fanghou.email._05WEIBO.pojo.vo.CommentVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentMapper {
    int insertComment(Comment comment);

    List<CommentVo> selectComment(Long id);
}
