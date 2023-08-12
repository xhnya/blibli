package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.MenuEntity;
import com.xhn.hilihili.user.service.MenuService;
import com.xhn.hilihili.user.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【menu(系统菜单表，用于定义系统中的菜单项，如导航菜单、侧边栏菜单等)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuEntity>
    implements MenuService{

}




