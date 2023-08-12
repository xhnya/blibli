package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.ResourcePermissionEntity;
import com.xhn.hilihili.user.service.ResourcePermissionService;
import com.xhn.hilihili.user.mapper.ResourcePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【resource_permission(资源和权限关联表，用于建立资源和权限之间的关联关系)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class ResourcePermissionServiceImpl extends ServiceImpl<ResourcePermissionMapper, ResourcePermissionEntity>
    implements ResourcePermissionService{

}




