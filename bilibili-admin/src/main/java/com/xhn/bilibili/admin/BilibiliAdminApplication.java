package com.xhn.bilibili.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.xhn.bilibili.admin.mapper")
public class BilibiliAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(BilibiliAdminApplication.class, args);
	}

}
