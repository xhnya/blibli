package com.xhn.hilihili.common.exception;

import com.xhn.hilihili.common.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xhn
 * @date 2023/7/9 14:28
 * @description: 全局异常处理
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return  Result.error().message("执行了全局异常处理====>>>>"+e.getMessage()).code(500);
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public Result errorArithmeticException(ArithmeticException e){
        e.printStackTrace();
        return  Result.error().message("执行了ArithmeticException异常处理");
    }

    @ExceptionHandler(HilihiliException.class)
    @ResponseBody
    public Result hilihiliException(HilihiliException e){
        log.error(e.getMessage());
        e.printStackTrace();
        return  Result.error().message(e.getMsg()).code(e.getCode());
    }
}
