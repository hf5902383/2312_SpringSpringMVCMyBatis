package fanghou.email.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class WeiboMapper {
    /*
        Resource 装配对象和接口数据
        根据Spring Bean 对象名称进行装配 【该注解的name 参数值】
        未指定名称， 吧属性名作为Spring Bean对象的名称进行装配
        如果属性名和Spring Bean对象的名称也不一致， 则根据类型进行装配
     */
    @Resource(name = "resMapperImpl1")
    private ResMapper resMapper;

}
