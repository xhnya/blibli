package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.UserUsersEntity;
import com.xhn.hilihili.auth.service.UserUsersService;
import com.xhn.hilihili.auth.mapper.UserUsersMapper;
import com.xhn.hilihili.auth.vo.PhoneVo;
import com.xhn.hilihili.auth.vo.UserInfoVo;
import com.xhn.hilihili.common.constant.UserConstant;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
* @author xhn
* @description 针对表【user_users(用户表)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class UserUsersServiceImpl extends ServiceImpl<UserUsersMapper, UserUsersEntity>
    implements UserUsersService{

    /**
     * 用户登录：用户通过手机号进行登录
     * 首次登录自动注册
     * @param phoneVo
     * @return
     */
    @Transactional
    @Override
    public UserInfoVo loginForPhone(PhoneVo phoneVo) {
        //查询用户是否存在

        Long count = baseMapper.selectCount(new QueryWrapper<UserUsersEntity>().eq("mobile", phoneVo.getPhone()));
        if (count == 0){
            //用户不存在，自动注册
            UserUsersEntity userUsersEntity = new UserUsersEntity();
            userUsersEntity.setMobile(phoneVo.getPhone());
            //生成用户名
            userUsersEntity.setUserName("用户"+phoneVo.getPhone());
            //设置状态
            userUsersEntity.setStatus(UserConstant.UserStatusEnum.NEW.getCode());
            //设置角色
            userUsersEntity.setUserRole(UserConstant.UserRoleEnum.USER.getCode());
            userUsersEntity.setRegisterTime(new Date());
            baseMapper.insert(userUsersEntity);
            //TODO: 设置用户信息
        }
        return null;
    }
}




