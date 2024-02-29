package cn.tedu._04mybaits.pojo.vo;

import java.util.Date;

public class WeiboDetailVO {
    private Long id;
    private String content;
    private Date created;
    private String nickname;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "WeiboDetailVO{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
                ", nickname='" + nickname + '\'' +
                '\n'+'}';
    }
}
