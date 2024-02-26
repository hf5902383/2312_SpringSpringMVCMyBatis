package cn.tedu._04mybaits.pojo.entity;

import java.util.Date;

/**
 * 和数据库的user表做映射
 * 数据映射器（Data Mapper）： 数据映射器是一种设计模式，用于将一个对象的数据表示映射到另一个对象的数据表示，通常用于将数据从一种格式映射到另一种格式。在对象关系映射（ORM）中，数据映射器用于将对象模型映射到数据库表结构，或者反之。
 */
public class User {
    private Long id;
    private String username;
    private  String password;
    private String nickname;
    private Date created;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", created=" + created +
                '}';
    }
}
