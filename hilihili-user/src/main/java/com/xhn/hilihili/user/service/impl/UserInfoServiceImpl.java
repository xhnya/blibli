package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.UserInfoEntity;
import com.xhn.hilihili.user.service.UserInfoService;
import com.xhn.hilihili.user.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【user_info(用户信息表)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfoEntity>
    implements UserInfoService{

}




