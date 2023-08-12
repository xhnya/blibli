package com.xhn.hilihili.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.user.entity.LogEntity;
import com.xhn.hilihili.user.service.LogService;
import com.xhn.hilihili.user.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author 93095
* @description 针对表【log(系统日志表，用于记录用户操作日志或系统日志，用于审计和追踪)】的数据库操作Service实现
* @createDate 2023-08-11 23:34:26
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, LogEntity>
    implements LogService{

}




