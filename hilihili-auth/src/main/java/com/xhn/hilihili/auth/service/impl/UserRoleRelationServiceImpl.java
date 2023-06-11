package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.UserRoleRelation;
import com.xhn.hilihili.auth.service.UserRoleRelationService;
import com.xhn.hilihili.auth.mapper.UserRoleRelationMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【user_role_relation(用户和角色关联表)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class UserRoleRelationServiceImpl extends ServiceImpl<UserRoleRelationMapper, UserRoleRelation>
    implements UserRoleRelationService{

}




