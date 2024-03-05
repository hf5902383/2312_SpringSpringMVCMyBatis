package fanghou.email._05WEIBO.controller;

import fanghou.email._05WEIBO.mapper.WeiboMapper;
import fanghou.email._05WEIBO.pojo.dto.WeiboDTO;
import fanghou.email._05WEIBO.pojo.entity.Weibo;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import fanghou.email._05WEIBO.pojo.vo.WeiboDetailVo;
import fanghou.email._05WEIBO.pojo.vo.WeiboIndexVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/v1/weibo/")
public class WeiboController {

    @Autowired
    private WeiboMapper weiboMapper;

    //发布微博
    @PostMapping("insert")
    public int contentWeibo(@RequestBody WeiboDTO weiboDTO, HttpSession session){
        System.out.println("weiboDTO = " + weiboDTO + ", session = " + session);
        //通过session.setAttribute("user", userVo);已经存储了 名为"user"的 数据在 userVo中
        UserVo userVo = (UserVo) session.getAttribute("user");
        if (userVo == null){
            return 2;
        }
        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO, weibo);
        weibo.setCreated(new Date());
        weibo.setUserId(userVo.getId());
        weiboMapper.insertWeibo(weibo);
        return 1;
    }

    //2。首页显示
    @GetMapping("selectIndex")
    public List<WeiboIndexVo> selectIndexWeibo(){
        return weiboMapper.selectWeiboIndex();
    }



    //3。详情页
    @GetMapping("selectById")
    public List<WeiboDetailVo> selectByIdWeiBo(Long id){
        return weiboMapper.selectWeiboDetail(id);
    }

}
