package com.xhn.hilihili.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xhn
 * @date 2023/11/14 18:34
 * @description:
 */
@Aspect
@Component
public class ControllerLoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(ControllerLoggingAspect.class);
    @Autowired
    private HttpServletRequest request;
    @Before("execution(* com.xhn.hilihili.*.controller.*.*(..))")
    public void logControllerInput(JoinPoint joinPoint) {
        // 获取方法名
        String methodName = joinPoint.getSignature().getName();

        // 获取方法参数
        Object[] methodArgs = joinPoint.getArgs();
       // 获取请求路径
        String requestPath = getRequestPath();
        // 构建日志信息
        StringBuilder logMessage = new StringBuilder();
        logMessage.append("方法名: ").append(methodName).append("\n");
        logMessage.append("请求路径: ").append(requestPath).append("\n");

        if (methodArgs.length > 0) {
            logMessage.append("请求参数:\n");
            for (Object arg : methodArgs) {
                logMessage.append(arg).append("\n");
            }
        } else {
            logMessage.append("没有传入参数\n");
        }

        // 记录日志
        logger.info(logMessage.toString());
    }

    @AfterReturning(pointcut = "execution(* com.xhn.hilihili.*.controller.*.*(..))", returning = "result")
    public void logControllerOutput(Object result) {
        logger.info("响应数据: {}", result);
    }

    private String getRequestPath() {
        // 获取请求相关信息
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (attributes != null) {
            HttpServletRequest request = attributes.getRequest();
            // 获取请求路径
            return request.getRequestURI();
        }
        return "无法获取请求路径";
    }
}
