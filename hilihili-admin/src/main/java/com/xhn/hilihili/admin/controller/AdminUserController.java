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
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/admin/user")
public class AdminUserController {

    @PostMapping("/login")
    public Result loginAdmin(@RequestParam Map<String,Object> params){
        log.info(String.valueOf(params));
        String jwtToken = JwtUtils.getJwtToken(1L, "1");
        return Result.ok().data("token",jwtToken);
        //throw LightException.from(ResultCode.LOGIN_ERROR);
    }
    @GetMapping("/info")
    public Result info(){
        return Result.ok()
                .data("roles","[admin]")
                .data("name","admin")
                .data("avatar","http://img.xhnya.top/img/vae.jpg");
    }


}
