package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.UserRolesEntity;
import com.xhn.hilihili.auth.service.UserRolesService;
import com.xhn.hilihili.auth.mapper.UserRolesMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【user_roles(角色表)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class UserRolesServiceImpl extends ServiceImpl<UserRolesMapper, UserRolesEntity>
    implements UserRolesService{

}




