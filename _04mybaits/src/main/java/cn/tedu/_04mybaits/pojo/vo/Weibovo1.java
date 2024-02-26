package cn.tedu._04mybaits.pojo.vo;

/**
 * VO类： 服务端返回给客户端的数据
 */
public class Weibovo1 {
    private String content;
    private Long userId;

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

    @Override
    public String toString() {
        return "Weibovo1{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}
