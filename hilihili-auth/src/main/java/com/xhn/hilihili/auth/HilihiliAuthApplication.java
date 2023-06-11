package com.xhn.hilihili.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 用户认证中心
 * @Auther: xhn
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.xhn.hilihili"})
@MapperScan("com.xhn.hilihili.auth.mapper")
public class HilihiliAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HilihiliAuthApplication.class, args);
    }

}
