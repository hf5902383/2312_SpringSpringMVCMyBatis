package fanghou.email.spring.eg3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CommentMapper {
    @Autowired
    @Qualifier(value = "sMapper")
    private Mapper mapper;
}
