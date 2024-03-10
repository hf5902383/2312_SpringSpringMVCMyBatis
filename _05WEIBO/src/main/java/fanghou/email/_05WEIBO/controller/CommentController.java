package fanghou.email._05WEIBO.controller;
import fanghou.email._05WEIBO.common.response.JsonResult;
import fanghou.email._05WEIBO.common.response.ServiceCodeEnum;
import fanghou.email._05WEIBO.mapper.CommentMapper;
import fanghou.email._05WEIBO.pojo.dto.CommentDTO;
import fanghou.email._05WEIBO.pojo.entity.Comment;
import fanghou.email._05WEIBO.pojo.vo.CommentVo;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/v1/comment/")
@Api(tags = "CommentController interface")
public class CommentController {
    @Autowired
    private CommentMapper commentMapper;

    @PostMapping("insert")
    @ApiOperation("添加评论功能")
    //RequestBody以http body的格式拆解json
    // RequestPara 以query 的形式
    public JsonResult insertComment(@RequestBody CommentDTO commentDTO, @ApiIgnore HttpSession session){
        log.debug("commentDTO = " + commentDTO);
        UserVo userVo = (UserVo) session.getAttribute("user");
//        if (userVo == null){
//            return new JsonResult(ServiceCodeEnum.WEIBOCONTROLLER_CONTENTWEIBO_NOTLOGIN_ERROR);
//        }
        Comment comment = new Comment();
        BeanUtils.copyProperties(commentDTO,comment);
        comment.setUserId(userVo.getId());
        comment.setCreated(new Date());
        commentMapper.insertComment(comment);
        return JsonResult.ok();
    }

    @ApiOperation("显示评论功能")
    @PostMapping("selectByWeiboId")
    @ApiImplicitParam(name = "id", value = "commentId", required = true, dataType = "Long")
    public JsonResult selectComment(Long id){
        return JsonResult.ok(commentMapper.selectComment(id));
        //return commentMapper.selectComment(id);
    }




}
