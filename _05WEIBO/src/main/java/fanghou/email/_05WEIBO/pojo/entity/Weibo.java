package fanghou.email._05WEIBO.pojo.entity;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class Weibo {
    private Long id;
    private String content;
    private Date created;
    private Long userId;


}
