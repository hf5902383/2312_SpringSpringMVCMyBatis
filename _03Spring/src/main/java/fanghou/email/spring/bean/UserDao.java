package fanghou.email.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class UserDao {
    private String databaseUrl;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "UserDao{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
