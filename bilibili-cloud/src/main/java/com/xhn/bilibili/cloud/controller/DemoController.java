package com.xhn.bilibili.cloud.controller;

import com.xhn.bilibili.cloud.utils.ConstantPropertiesUtils;
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
//    @GetMapping("/userName")
//    public String userName()   {
//        return ConstantPropertiesUtils.BUCKET_NAME+"====="+
//                ConstantPropertiesUtils.ACCESS_KEY_ID+"====="+
//                ConstantPropertiesUtils.ACCESS_KEY_SECRET+"====="+
//                ConstantPropertiesUtils.END_POIND;
//    }


}
