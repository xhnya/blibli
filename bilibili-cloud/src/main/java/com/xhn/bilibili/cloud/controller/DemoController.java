package com.xhn.bilibili.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/4/3 11:08
 * @description:
 */
@RestController
@RefreshScope
public class DemoController {
    @Value("${alipay.app.id}")
    private String testeName;

    @GetMapping("/naocs")
    public String getNacos()   {
        return testeName;
    }

}
