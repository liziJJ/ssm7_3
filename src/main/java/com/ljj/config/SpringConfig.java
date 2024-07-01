package com.ljj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//设置他是一个配置类
@Configuration
//spring管理业务bean和功能bean（SQL)
@ComponentScan({"com.ljj.service"})
@PropertySource("jdbc.properties")
//加载这两个类的时候，可以把这两个类里面的bean加载进去
@Import({JdbcConfig.class,MybatisConfig.class})
@EnableTransactionManagement
public class SpringConfig {
}
