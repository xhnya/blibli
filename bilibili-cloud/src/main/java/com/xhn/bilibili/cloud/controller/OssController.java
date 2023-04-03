package com.xhn.bilibili.cloud.controller;

import com.xhn.bilibili.cloud.service.OssService;
import com.xhn.bilibili.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/4/3 14:25
 * @description:
 */
@RestController
@RequestMapping("/cloud/oss")
public class OssController {
    @Autowired
    private OssService ossService;

    @PostMapping("upload")
    public Result uploadOssFile(MultipartFile file){
        String url=ossService.uploadFileAvatar(file);
        return Result.ok().data("url",url);
    }
}
