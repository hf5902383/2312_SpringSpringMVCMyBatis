package cn.tedu._04mybaits.pojo.vo;

import java.util.Date;

public class CommentVo4 {
    private Long id;
    private String content;
    private Date created;

    @Override
    public String toString() {
        return "CommentVo04{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", created=" + created +
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

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
