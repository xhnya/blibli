package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.ResourceEntity;
import com.xhn.hilihili.user.service.ResourceService;
import com.xhn.hilihili.user.mapper.ResourceMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【resource(系统资源表，用于定义系统中的资源，如文件、图片、视频等)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, ResourceEntity>
    implements ResourceService{

}




