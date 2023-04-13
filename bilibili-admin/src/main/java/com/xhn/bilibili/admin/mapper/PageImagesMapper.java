package com.xhn.bilibili.admin.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xhn.bilibili.admin.entity.PageImagesEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xhn.bilibili.admin.vo.PageImagesListVo;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author xhn
* @description 针对表【page_images】的数据库操作Mapper
* @createDate 2023-02-04 14:56:14
* @Entity com.xhn.bilibili.admin.entity.PageImages
*/
@Mapper
public interface PageImagesMapper extends BaseMapper<PageImagesEntity> {


    List<PageImagesEntity> getPageImageList(Page<PageImagesEntity> page);

    List<Map<Long, String>>  getPageImageDesList(@Param(value = "value") String value);

    List<PageImagesEntity> getPageImagesList(Page<PageImagesEntity> page, PageImagesListVo pageImagesListVo);
}




