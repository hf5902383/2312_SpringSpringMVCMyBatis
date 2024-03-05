package fanghou.email._05WEIBO.pojo.dto;

public class WeiboDTO {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "WeiboDTO{" +
                "content='" + content + '\'' +
                '}';
    }
}
