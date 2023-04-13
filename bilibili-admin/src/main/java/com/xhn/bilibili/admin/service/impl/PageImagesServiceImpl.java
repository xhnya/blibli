package com.xhn.bilibili.admin.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.bilibili.admin.entity.PageImagesEntity;
import com.xhn.bilibili.admin.service.PageImagesService;
import com.xhn.bilibili.admin.mapper.PageImagesMapper;
import com.xhn.bilibili.admin.vo.PageImagesListVo;
import com.xhn.bilibili.common.utils.PageRequest;
import com.xhn.bilibili.common.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author xhn
* @description 针对表【page_images】的数据库操作Service实现
* @createDate 2023-02-04 14:56:14
*/
@Service
public class PageImagesServiceImpl extends ServiceImpl<PageImagesMapper, PageImagesEntity>
    implements PageImagesService{

    @Autowired
    private PageImagesMapper pageImagesMapper;

    @Override
    public void addPageImages(PageImagesEntity pageImages) {
        this.baseMapper.insert(pageImages);
    }

    @Override
    public PageUtils getPageImageList(PageRequest pageRequest) {
        Page<PageImagesEntity> page = new Page<>(pageRequest.getPage(),pageRequest.getSize());
        List<PageImagesEntity> result=pageImagesMapper.getPageImageList(page);

        return new PageUtils(result,(int)page.getTotal(),(int)page.getSize() ,(int)page.getCurrent());
    }

    @Override
    public List<Map<Long, String>>   getPageImageDesList(String value) {
        List<Map<Long, String>>  result = pageImagesMapper.getPageImageDesList(value);

        return result;
    }

    /**
     * 获取列表
     * @param pageRequest
     * @param pageImagesListVo
     * @return
     */
    @Override
    public PageUtils getPageImagesList(PageRequest pageRequest, PageImagesListVo pageImagesListVo) {
        Page<PageImagesEntity> page = new Page<>(pageRequest.getPage(),pageRequest.getSize());
        List<PageImagesEntity> result=pageImagesMapper.getPageImagesList(page,pageImagesListVo);
        return new PageUtils(result,(int)page.getTotal(),(int)page.getSize() ,(int)page.getCurrent());
    }


}




