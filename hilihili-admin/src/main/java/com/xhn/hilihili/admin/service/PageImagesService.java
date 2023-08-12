package com.xhn.hilihili.admin.service;

import com.xhn.hilihili.admin.entity.PageImagesEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xhn.hilihili.admin.vo.PageImagesListVo;
import com.xhn.hilihili.common.utils.PageRequest;
import com.xhn.hilihili.common.utils.PageUtils;

import java.util.List;
import java.util.Map;

/**
* @author xhn
* @description 针对表【page_images】的数据库操作Service
* @createDate 2023-02-04 14:56:14
*/
public interface PageImagesService extends IService<PageImagesEntity> {

    void addPageImages(PageImagesEntity pageImages);

    PageUtils getPageImageList(PageRequest pageRequest);

    List<Map<Long, String>> getPageImageDesList(String value);


    PageUtils getPageImagesList(PageRequest pageRequest, PageImagesListVo pageImagesListVo);

    List<PageImagesEntity> list(PageImagesListVo pageImagesListVo);
}
