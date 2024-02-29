package cn.tedu._04mybaits.pojo.vo;

import cn.tedu._04mybaits.pojo.entity.Weibo;

import java.util.List;

public class WeiboMapVo2 {
    private Long id;
    private String nickname;
    private List<Weibo> weiboList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Weibo> getWeiboList() {
        return weiboList;
    }

    public void setWeiboList(List<Weibo> weiboList) {
        this.weiboList = weiboList;
    }

    @Override
    public String toString() {
        return "WeiboMapVo2{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", weiboList=" + weiboList +
                '}';
    }
}
