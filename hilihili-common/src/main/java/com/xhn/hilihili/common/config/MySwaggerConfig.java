package com.xhn.hilihili.common.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/4/12 9:49
 * @description:
 */
@Configuration
@EnableOpenApi
public class MySwaggerConfig {
    @Bean
    public Docket initDocket() {
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("服务接口文档")
                .description("接口文档")
                .contact(new Contact("xhn", "http://www.xhnya.top", "hain.xiao@outlook.com "))
                .version("1.0")
                .build();
    }
}
