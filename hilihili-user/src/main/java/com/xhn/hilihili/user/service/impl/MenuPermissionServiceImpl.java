package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.MenuPermissionEntity;
import com.xhn.hilihili.user.service.MenuPermissionService;
import com.xhn.hilihili.user.mapper.MenuPermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【menu_permission(菜单和权限关联表，用于建立菜单和权限之间的关联关系)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class MenuPermissionServiceImpl extends ServiceImpl<MenuPermissionMapper, MenuPermissionEntity>
    implements MenuPermissionService{

}




