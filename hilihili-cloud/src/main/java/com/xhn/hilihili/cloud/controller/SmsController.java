package com.xhn.hilihili.cloud.controller;

import com.xhn.hilihili.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/7/12 15:08
 * @description:
 */
@RestController
@RequestMapping("/cloud/sms")
public class SmsController {

    @Autowired
    private RedisTemplate<String,Object> redisTemplate;


    @PostMapping("upload")
    public Result send(String phone){
        redisTemplate.opsForValue().set(phone,"1216");
        return Result.ok();
    }

}
