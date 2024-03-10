package fanghou.email._05WEIBO.pojo.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class WeiboDetailVo {
    private Long id;
    private String content;
    //调整时区 和日期格式  yyyy MM dd HH mm ss
    //yyyy-MM-dd HH:mm:ss  GMT+8   Asia/Shanghai
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    private Date created;
    private String nickname;

}
