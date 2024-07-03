package com.ljj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
//springmvc管理表现层，扫描config包是为了把springMvcSupport扫描进去
@ComponentScan({"com.ljj.controller","com.ljj.config"})
@EnableWebMvc
public class SpringMvcConfig {
}

