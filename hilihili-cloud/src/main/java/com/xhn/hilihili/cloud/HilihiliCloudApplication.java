package com.xhn.hilihili.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@EnableWebMvc
@ComponentScan(basePackages = {"com.xhn.hilihili"})
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HilihiliCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(HilihiliCloudApplication.class, args);
    }

}
