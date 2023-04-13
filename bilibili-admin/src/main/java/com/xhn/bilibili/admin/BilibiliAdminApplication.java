package com.xhn.bilibili.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@SpringBootApplication
@EnableWebMvc
@ComponentScan(basePackages = {"com.xhn.bilibili"})
@MapperScan("com.xhn.bilibili.admin.mapper")
public class BilibiliAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilibiliAdminApplication.class, args);
	}

}
