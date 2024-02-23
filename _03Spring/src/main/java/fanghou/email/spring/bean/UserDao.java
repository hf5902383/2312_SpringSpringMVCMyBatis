package fanghou.email.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
    //基本类型注入
    @Value("jdbc:mysql://localhost:3306")
    private String databaseUrl;
    @Value("root")
    private String username;
    //@Value("Afang19970083")
    private String password;

    @Value("Afang19970083")
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "databaseUrl='" + databaseUrl + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
