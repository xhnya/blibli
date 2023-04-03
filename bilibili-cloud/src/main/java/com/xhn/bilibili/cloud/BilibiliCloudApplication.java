package com.xhn.bilibili.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BilibiliCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilibiliCloudApplication.class, args);
    }

}
