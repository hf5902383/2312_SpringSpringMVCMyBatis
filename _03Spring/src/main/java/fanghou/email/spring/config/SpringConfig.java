package fanghou.email.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "fanghou.email.spring")
public class SpringConfig {
    /**
     * 设置自动扫描
     * ComponentScan 注解
     * 1.自动扫描注解
     * 2.自动扫描指定的包以及子孙包的所有的类【只要有注解的都直接加载成Ioc包】
     * @Configuration
     * 标识此类为配置类，工程启动时自动加载此类【静态类有点像，和程序启动时一起启动】
     */

}
