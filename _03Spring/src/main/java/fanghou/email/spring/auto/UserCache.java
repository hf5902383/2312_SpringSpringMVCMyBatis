package fanghou.email.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserCache {
    @Autowired
    @Qualifier(value = "two")
    private Cache cache;

    @Override
    public String toString() {
        return "UserCache{" +
                "cache=" + cache +
                '}';
    }
}
