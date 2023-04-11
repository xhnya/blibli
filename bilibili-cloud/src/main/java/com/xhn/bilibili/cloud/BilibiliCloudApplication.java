package com.xhn.bilibili.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@EnableWebMvc
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BilibiliCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilibiliCloudApplication.class, args);
    }

}
