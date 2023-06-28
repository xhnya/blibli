package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.ResourcePermissionEntity;
import com.xhn.hilihili.auth.service.ResourcePermissionService;
import com.xhn.hilihili.auth.mapper.ResourcePermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【resource_permission(资源和权限关联表，用于建立资源和权限之间的关联关系)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class ResourcePermissionServiceImpl extends ServiceImpl<ResourcePermissionMapper, ResourcePermissionEntity>
    implements ResourcePermissionService{

}




