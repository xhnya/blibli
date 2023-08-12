package com.xhn.hilihili.admin.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xhn.hilihili.admin.entity.PageImagesEntity;
import com.xhn.hilihili.admin.service.PageImagesService;
import com.xhn.hilihili.admin.vo.PageImagesListVo;
import com.xhn.hilihili.common.utils.PageRequest;
import com.xhn.hilihili.common.utils.PageUtils;
import com.xhn.hilihili.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

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
    public Result getPageImages(@RequestParam Integer page) {
        PageRequest pageRequest = new PageRequest(page);
        PageUtils result=pageImagesService.getPageImageList(pageRequest);
        return Result.ok().data("data",result);
    }

    /**
     * 获取图片列表
     * @param pageImagesListVo
     * @return
     */
    @GetMapping("getPageImagesList")
    public Result getPageImagesList(@Valid PageImagesListVo pageImagesListVo) {
       List<PageImagesEntity> result=pageImagesService.list(pageImagesListVo);
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


    /**
     * 模糊查询描述----选择框
     * @param value
     * @return
     */
    @GetMapping("selectRotationChartDes")
    public Result selectRotationChartDes(@RequestParam String value) {

        List<Map<Long, String>> result =pageImagesService.getPageImageDesList(value);

        return Result.ok().data("data",result);
    }

}
