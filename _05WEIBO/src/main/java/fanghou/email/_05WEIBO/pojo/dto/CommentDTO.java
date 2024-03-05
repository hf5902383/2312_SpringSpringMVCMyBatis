package fanghou.email._05WEIBO.pojo.dto;

public class CommentDTO {
    private String content;
    private Long weiboId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(Long weiboId) {
        this.weiboId = weiboId;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "content='" + content + '\'' +
                ", weiboId=" + weiboId +
                '}';
    }
}
