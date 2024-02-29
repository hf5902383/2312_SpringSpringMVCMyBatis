package cn.tedu._04mybaits.pojo.vo;

import java.util.List;

public class WeiboMapVo4 {
    private Long id;
    private String content;
    private List<CommentVo4> commentVo4List;

    public List<CommentVo4> getCommentVo4List() {
        return commentVo4List;
    }

    public void setCommentVo4List(List<CommentVo4> commentVo4List) {
        this.commentVo4List = commentVo4List;
    }

    @Override
    public String toString() {
        return "WeiboMapVo4{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", commentVo4List=" + commentVo4List +
                '}';
    }

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
}
