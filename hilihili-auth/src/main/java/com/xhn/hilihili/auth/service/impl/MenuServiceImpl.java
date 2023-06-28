package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.MenuEntity;
import com.xhn.hilihili.auth.service.MenuService;
import com.xhn.hilihili.auth.mapper.MenuMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【menu(系统菜单表，用于定义系统中的菜单项，如导航菜单、侧边栏菜单等)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, MenuEntity>
    implements MenuService{

}




