package cn.tedu.egmvc2.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * 设置自动扫描的类
 * 1.Configuration:标识此类为配置类,工程启动时会自动加载此类;
 * 2.MapperScan:自动扫描注解;
 *   2.1 该注解会为指定包路径及子孙包中的所有接口添加 @Mapper注解;
 *   2.2 添加该注解后,所有的接口上不用再添加 @Mapper 注解了.
 */
@Configuration
@MapperScan(value = "cn.tedu.egmvc2")
public class MyBatisConfig {
}
