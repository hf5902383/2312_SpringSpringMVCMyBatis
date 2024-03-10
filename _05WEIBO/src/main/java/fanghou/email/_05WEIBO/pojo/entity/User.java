package fanghou.email._05WEIBO.pojo.entity;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private String username;
    private Long id;
    private String password;
    private String nickname;
    private Date created;

}
