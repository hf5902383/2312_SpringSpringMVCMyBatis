package cn.tedu._04mybaits.pojo.vo;

public class Commentvo1 {
    private String content;
    private long weiboId;
    private long userId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getWeiboId() {
        return weiboId;
    }

    public void setWeiboId(long weiboId) {
        this.weiboId = weiboId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Commentvo1{" +
                "content='" + content + '\'' +
                ", weiboId=" + weiboId +
                ", userId=" + userId +
                '}';
    }
}
