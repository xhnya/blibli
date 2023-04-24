package com.xhn.hilihili.admin.controller;

import com.xhn.hilihili.admin.entity.PagePosition;
import com.xhn.hilihili.admin.service.PagePositionService;
import com.xhn.hilihili.common.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/2/10 17:23
 * @description:
 */
@RestController
@RequestMapping("/admin/admin/")
public class AdminController {

    @Autowired
    private PagePositionService pagePositionService;

    /**
     * 获取门户位置
     * @return
     */
    @GetMapping("/getPagePosition")
    public Result getPagePosition(){
        return Result.ok();
    }

    /**
     * 增加门户位置
     * @param pagePosition
     * @return
     */
    @GetMapping("/addPagePosition")
    public Result addPagePosition(PagePosition pagePosition){
        pagePositionService.save(pagePosition);
        return Result.ok();
    }

}

