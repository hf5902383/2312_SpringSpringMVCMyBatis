package fanghou.email._05WEIBO.mapper;

import fanghou.email._05WEIBO.pojo.entity.Weibo;
import fanghou.email._05WEIBO.pojo.vo.WeiboDetailVo;
import fanghou.email._05WEIBO.pojo.vo.WeiboIndexVo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeiboMapper {

    int insertWeibo(Weibo weibo);

    List<WeiboIndexVo> selectWeiboIndex();

    WeiboDetailVo selectWeiboDetail(Long id);
}
