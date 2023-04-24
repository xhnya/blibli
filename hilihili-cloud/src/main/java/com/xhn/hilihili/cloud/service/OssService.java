package com.xhn.hilihili.cloud.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author xhn
 * @date 2021/12/7 22:30
 */
public interface OssService {
    String uploadFileAvatar(MultipartFile file);
}
