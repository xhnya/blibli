package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.RolePermissionEntity;
import com.xhn.hilihili.user.service.RolePermissionService;
import com.xhn.hilihili.user.mapper.RolePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【role_permission(角色和权限关联表)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermissionEntity>
    implements RolePermissionService{

}




