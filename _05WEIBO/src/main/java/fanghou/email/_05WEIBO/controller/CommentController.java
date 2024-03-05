package fanghou.email._05WEIBO.controller;

import fanghou.email._05WEIBO.mapper.CommentMapper;
import fanghou.email._05WEIBO.pojo.dto.CommentDTO;
import fanghou.email._05WEIBO.pojo.entity.Comment;
import fanghou.email._05WEIBO.pojo.vo.CommentVo;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/comment/")
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;

    @RequestMapping("insert")
    public int insertComment(@RequestBody CommentDTO commentDTO, HttpSession session){
        UserVo userVo = (UserVo) session.getAttribute("user");
        if (userVo == null){
            return 2;
        }
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO,comment);
        comment.setUserId(userVo.getId());
        comment.setCreated(new Date());
        commentMapper.insertComment(comment);
        return 1;
    }

    @RequestMapping("selectByWeiboId")
    public List<CommentVo> selectComment(Long id){
        return commentMapper.selectComment(id);
    }




}
