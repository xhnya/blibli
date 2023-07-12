package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.UserInfoEntity;
import com.xhn.hilihili.auth.service.UserInfoService;
import com.xhn.hilihili.auth.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-07-11 14:23:37
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfoEntity>
    implements UserInfoService{

}




