package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.RolePermissionEntity;
import com.xhn.hilihili.auth.service.RolePermissionService;
import com.xhn.hilihili.auth.mapper.RolePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【role_permission(角色和权限关联表)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermissionEntity>
    implements RolePermissionService{

}




