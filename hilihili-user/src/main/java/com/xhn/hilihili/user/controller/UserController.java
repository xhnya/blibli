package com.xhn.hilihili.user.controller;

import com.xhn.hilihili.common.utils.JwtUtils;
import com.xhn.hilihili.common.utils.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xhn
 * @date 2023/7/23 21:18
 * @description:
 */
@RestController
@RequestMapping("/user/")
public class UserController {


    /**
     * 获取用户信息
     * @return
     */
    @PostMapping("getUserInfo")
    public Result getUserInfo(HttpServletRequest request){

        Long id = JwtUtils.getUserInfoByJwtToken(request);
        return Result.ok();
    }


    
    
}
