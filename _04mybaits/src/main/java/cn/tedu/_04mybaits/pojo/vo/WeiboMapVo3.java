package cn.tedu._04mybaits.pojo.vo;

import cn.tedu._04mybaits.pojo.entity.Comment;

import java.util.List;

public class WeiboMapVo3 {
    private Long id;
    private String content;
    private List<Comment> commentList;

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

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    @Override
    public String toString() {
        return "WeiboMapVo3{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", commentList=" + commentList +
                '}';
    }
}
