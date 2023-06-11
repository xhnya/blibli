package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.UserUsers;
import com.xhn.hilihili.auth.service.UserUsersService;
import com.xhn.hilihili.auth.mapper.UserUsersMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【user_users(用户表)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class UserUsersServiceImpl extends ServiceImpl<UserUsersMapper, UserUsers>
    implements UserUsersService{

}




