package com.xhn.hilihili.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xhn.hilihili.auth.entity.Log;
import com.xhn.hilihili.auth.service.LogService;
import com.xhn.hilihili.auth.mapper.LogMapper;
import org.springframework.stereotype.Service;

/**
* @author xhn
* @description 针对表【log(系统日志表，用于记录用户操作日志或系统日志，用于审计和追踪)】的数据库操作Service实现
* @createDate 2023-06-11 19:46:31
*/
@Service
public class LogServiceImpl extends ServiceImpl<LogMapper, Log>
    implements LogService{

}




