package cn.tedu._04mybaits.pojo.vo;

public class WeiboMapV01 {
    private Long id;
    private String content;
    private Long userId;

    @Override
    public String toString() {
        return "WeiboMapV01{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", userId=" + userId +
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
