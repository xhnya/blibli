package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.UserPermission;
import com.xhn.hilihili.auth.service.UserPermissionService;
import com.xhn.hilihili.auth.mapper.UserPermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【user_permission(用户权限表
)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class UserPermissionServiceImpl extends ServiceImpl<UserPermissionMapper, UserPermission>
    implements UserPermissionService{

}




