package com.ljj.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
//springmvc管理表现层
@ComponentScan("com.ljj.controller")
@EnableWebMvc
public class SpringMvcConfig {
}

