package fanghou.email._05WEIBO.pojo.vo;

public class WeiboIndexVo {
    private String nickname;
    private String content;
    private Long id;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "WeiboIndexVo{" +
                "nickname='" + nickname + '\'' +
                ", content='" + content + '\'' +
                ", id=" + id +
                '}';
    }
}
