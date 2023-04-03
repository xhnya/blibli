package com.xhn.bilibili.admin.controller;

import com.xhn.bilibili.admin.entity.PageImagesEntity;
import com.xhn.bilibili.admin.service.PageImagesService;
import com.xhn.bilibili.common.utils.PageRequest;
import com.xhn.bilibili.common.utils.PageUtils;
import com.xhn.bilibili.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/2/1 12:53
 * @description:
 */
@RestController
@RequestMapping("/admin/images/")
public class PageImagesController {

    @Autowired
    private PageImagesService pageImagesService;


    @GetMapping("getPageImages")
    public Result getPageImages(@RequestParam PageRequest pageRequest) {
        PageUtils result=pageImagesService.getPageImageList(pageRequest);
        return Result.ok().data("data",result);
    }


    /**
     * 添加方法
     * @param pageImages 对应的实体类
     * @return
     */
    @PostMapping("add")
    public Result addPageImages(@RequestBody PageImagesEntity pageImages) {
        pageImagesService.addPageImages(pageImages);
        return Result.ok("Success");
    }


    @GetMapping("errors")
    public Result errorTestPage(@RequestParam String message,@RequestParam int code){
        return Result.error(message).code(code);
    }



}
