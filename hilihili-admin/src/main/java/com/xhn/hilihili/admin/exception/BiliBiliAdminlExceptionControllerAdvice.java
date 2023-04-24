package com.xhn.hilihili.admin.exception;

import com.xhn.hilihili.common.exception.BizCodeEnum;
import com.xhn.hilihili.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/4/13 9:44
 * @description: 集中处理异常
 */
@Slf4j
@RestControllerAdvice(basePackages = "com.xhn.bilibili.admin.controller")
public class BiliBiliAdminlExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result handleVaildException(MethodArgumentNotValidException e){
        log.error("数据校验出现问题{}，异常类型{}",e.getMessage(),e.getClass());
        BindingResult result = e.getBindingResult();
        Map<String,String> errorMap=new HashMap<String,String>();
        result.getFieldErrors().forEach((item)->{
            errorMap.put(item.getField(), item.getDefaultMessage());
        });
        return Result.error(BizCodeEnum.VAILD_EXCEPTION.getMsg()).code(BizCodeEnum.VAILD_EXCEPTION.getCode()).data("data",errorMap);
    }


    @ExceptionHandler(value = Throwable.class)
    public Result handleException(Throwable throwable){
        log.error("======>>>>>错误>>>>>{}>>>>>{}",BizCodeEnum.UNKNOW_EXCEPTION.getCode(), BizCodeEnum.UNKNOW_EXCEPTION.getMsg());
        return Result.error(BizCodeEnum.UNKNOW_EXCEPTION.getMsg()).code(BizCodeEnum.UNKNOW_EXCEPTION.getCode());
    }
}
