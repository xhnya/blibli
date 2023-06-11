package com.xhn.hilihili.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.xhn.hilihili"})
@MapperScan("com.xhn.hilihili.user.mapper")
public class HilihiliUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(HilihiliUserApplication.class, args);
    }

}
