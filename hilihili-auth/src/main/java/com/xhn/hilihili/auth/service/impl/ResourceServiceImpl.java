package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.ResourceEntity;
import com.xhn.hilihili.auth.service.ResourceService;
import com.xhn.hilihili.auth.mapper.ResourceMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【resource(系统资源表，用于定义系统中的资源，如文件、图片、视频等)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:15
*/
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, ResourceEntity>
    implements ResourceService{

}




