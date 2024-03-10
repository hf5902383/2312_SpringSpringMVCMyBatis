package fanghou.email._05WEIBO.controller;
import fanghou.email._05WEIBO.common.response.JsonResult;
import fanghou.email._05WEIBO.common.response.ServiceCodeEnum;
import fanghou.email._05WEIBO.interceptor.UserLoginInterceptor;
import fanghou.email._05WEIBO.mapper.WeiboMapper;
import fanghou.email._05WEIBO.pojo.dto.WeiboDTO;
import fanghou.email._05WEIBO.pojo.entity.Weibo;
import fanghou.email._05WEIBO.pojo.vo.UserVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/v1/weibo/")
@Api(tags = "WeiboController interface")
public class WeiboController {

    @Autowired
    private WeiboMapper weiboMapper;

    //发布微博
    @PostMapping("insert")
    @ApiOperation("发布微博")
    public JsonResult contentWeibo(@RequestBody @Validated WeiboDTO weiboDTO, @ApiIgnore HttpSession session){
        /**
         * TRACE[详细调试信息] < DEBUG[调试级别]开发时用 < INFO[默认级别]项目上线用 < WARN[警告级别] < ERROR[错误]
         * 只会发生该日志级别及以上级别
         */

        //快速失败
//        List<String> checkError = slowFailed(weiboDTO);
//        if (!CollectionUtils.isEmpty(checkError)) {
//            return new JsonResult(ServiceCodeEnum.USERCONTROLLER_LOGIN_USERNAME_ERROR);
//        }

        log.debug("weiboDTO = " + weiboDTO);
        //通过session.setAttribute("user", userVo);已经存储了 名为"user"的 数据在 userVo中
        UserVo userVo = (UserVo) session.getAttribute("user");
//        if (userVo == null){
//            return new JsonResult(ServiceCodeEnum.WEIBOCONTROLLER_CONTENTWEIBO_NOTLOGIN_ERROR);
//        }

        Weibo weibo = new Weibo();
        BeanUtils.copyProperties(weiboDTO, weibo);
        weibo.setCreated(new Date());
        weibo.setUserId(userVo.getId());
        weiboMapper.insertWeibo(weibo);
        return JsonResult.ok();
    }

    //2。首页显示
    @ApiOperation("显示微博首页功能")
    @GetMapping("selectIndex")
    public JsonResult selectIndexWeibo(){

        return JsonResult.ok(weiboMapper.selectWeiboIndex());
        //return weiboMapper.selectWeiboIndex();
    }



    //3。详情页
    @ApiOperation("微博详情页面功能")
    @GetMapping("selectById")
    @ApiImplicitParam(name = "id",value = "WEIboid", required = true, dataType = "Long")
    public JsonResult selectByIdWeiBo(Long id){
        //return weiboMapper.selectWeiboDetail(id);
        return JsonResult.ok(weiboMapper.selectWeiboDetail(id));
    }


//    public List<String> slowFailed(WeiboDTO weiboDTO){
//        List<String> list = new ArrayList<>();
//        if (weiboDTO.getContent() == null){
//            String a = "weiboDTO 不能为空" + weiboDTO.getContent();
//            list.add(a);
//        }else if(CollectionUtils.isEmpty((Collection<?>) weiboDTO)){
//
//        }
//        return list;}

}
