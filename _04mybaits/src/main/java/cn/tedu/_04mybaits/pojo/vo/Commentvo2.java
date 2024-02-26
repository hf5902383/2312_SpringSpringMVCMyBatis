package cn.tedu._04mybaits.pojo.vo;

public class Commentvo2 {
    private String content;
    private long userId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Commentvo2{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
