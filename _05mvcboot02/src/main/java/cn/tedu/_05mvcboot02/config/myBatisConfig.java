package cn.tedu._05mvcboot02.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 设置自动扫描的类
 * \Configuration标识此类为配置类，工程启动自动加载
 * MapperScan自动扫描注解；将地址内所有的包及子孙包添加Mapper注解
 */
@Configuration
@MapperScan(value = "cn.tedu._05mvcboot02.mapper")
public class myBatisConfig {
}
