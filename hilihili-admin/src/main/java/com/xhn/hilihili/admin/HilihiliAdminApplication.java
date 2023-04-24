package com.xhn.hilihili.admin;

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
@ComponentScan(basePackages = {"com.xhn.hilihili"})
@MapperScan("com.xhn.hilihili.admin.mapper")
public class HilihiliAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(HilihiliAdminApplication.class, args);
	}

}
