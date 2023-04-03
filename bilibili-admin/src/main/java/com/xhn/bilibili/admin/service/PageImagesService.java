package com.xhn.bilibili.admin.service;

import com.xhn.bilibili.admin.entity.PageImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xhn.bilibili.common.utils.PageRequest;
import com.xhn.bilibili.common.utils.PageUtils;

/**
* @author xhn
* @description 针对表【page_images】的数据库操作Service
* @createDate 2023-02-04 14:56:14
*/
public interface PageImagesService extends IService<PageImagesEntity> {

    void addPageImages(PageImagesEntity pageImages);

    PageUtils getPageImageList(PageRequest pageRequest);
}
