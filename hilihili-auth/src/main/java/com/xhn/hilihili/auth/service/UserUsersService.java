package com.xhn.hilihili.auth.service;

import com.xhn.hilihili.auth.entity.UserUsersEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xhn.hilihili.auth.vo.PhoneVo;
import com.xhn.hilihili.auth.vo.UserInfoVo;

/**
* @author xhn
* @description 针对表【user_users(用户表)】的数据库操作Service
* @createDate 2023-06-11 19:46:15
*/
public interface UserUsersService extends IService<UserUsersEntity> {

    UserInfoVo loginForPhone(PhoneVo phoneVo);
}
