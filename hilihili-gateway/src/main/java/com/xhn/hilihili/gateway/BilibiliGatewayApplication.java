package com.xhn.hilihili.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BilibiliGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilibiliGatewayApplication.class, args);
    }

}
