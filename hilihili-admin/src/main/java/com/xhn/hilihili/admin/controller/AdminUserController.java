package com.xhn.hilihili.admin.controller;

import com.xhn.hilihili.common.utils.JwtUtils;
import com.xhn.hilihili.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/2/1 13:20
 * @description: 控制后台用户登录的
 */
@Slf4j
@RestController
@RequestMapping("/admin/user")
public class AdminUserController {

    /**
     * 后台登录接口
     *
     * @param params
     * @return token，放在游览器中，每次请求携带，然后验证
     */
    @PostMapping("/login")
    public Result loginAdmin(@RequestParam Map<String,Object> params){
        log.info(String.valueOf(params));
        String jwtToken = JwtUtils.getJwtToken(1L, "1");

        return Result.ok().data("token",jwtToken).data("roles","[admin]").data("userId","admin");
        //throw LightException.from(ResultCode.LOGIN_ERROR);
    }

    /**
     * 临时登录接口
     * 在开发阶段快速登录后台
     * @return
     */
    @GetMapping("/info")
    public Result info(){
        return Result.ok()
                .data("roles","[admin]")
                .data("username","admin")
                .data("userId","admin")
                .data("realName","admin")
                .data("desc","后台管理员")
                .data("avatar","http://img.xhnya.top/img/vae.jpg");
    }


}
