package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.MenuPermission;
import com.xhn.hilihili.auth.service.MenuPermissionService;
import com.xhn.hilihili.auth.mapper.MenuPermissionMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【menu_permission(菜单和权限关联表，用于建立菜单和权限之间的关联关系)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class MenuPermissionServiceImpl extends ServiceImpl<MenuPermissionMapper, MenuPermission>
    implements MenuPermissionService{

}




