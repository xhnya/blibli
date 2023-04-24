package com.xhn.hilihili.video;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.xhn.hilihili"})
@MapperScan("com.xhn.hilihili.video.mapper")
public class HilihiliVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HilihiliVideoApplication.class, args);
    }

}
