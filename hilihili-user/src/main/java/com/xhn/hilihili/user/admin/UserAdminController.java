package com.xhn.hilihili.user.admin;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xhn.hilihili.common.utils.JwtUtils;
import com.xhn.hilihili.common.utils.Result;
import com.xhn.hilihili.user.entity.UserUsersEntity;
import com.xhn.hilihili.user.service.UserUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xhn
 * @date 2023/8/11 23:28
 * @description:
 */
@RestController
@RequestMapping("/userAdmin/")
public class UserAdminController {

    @Autowired
    private UserUsersService userUsersService;

    /**
     * 获取所有用户信息
     * @return
     */
    @PostMapping("getUserList")
    public Result getUserList(@RequestBody UserUsersEntity userUsersEntity){

//        QueryWrapper<UserUsersEntity> wrapper = new QueryWrapper<>();
        userUsersService.list();
        return Result.ok();
    }

}
