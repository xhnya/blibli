package com.xhn.hilihili.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author xhn
 * @date 2023/11/14 18:34
 * @description:
 */
@Aspect
@Component
public class ControllerLoggingAspect {
    private final Logger logger = LoggerFactory.getLogger(ControllerLoggingAspect.class);

    @Before("execution(* com.xhn.hilihili.*.controller.*.*(..))")
    public void logControllerInput(JoinPoint joinPoint) {
        // 获取方法名
        String methodName = joinPoint.getSignature().getName();

        // 获取方法参数
        Object[] methodArgs = joinPoint.getArgs();

        // 构建日志信息
        StringBuilder logMessage = new StringBuilder();
        logMessage.append("方法名: ").append(methodName).append("\n");

        if (methodArgs.length > 0) {
            logMessage.append("Arguments:\n");
            for (Object arg : methodArgs) {
                logMessage.append(arg).append("\n");
            }
        } else {
            logMessage.append("没有参数\n");
        }

        // 记录日志
        logger.info(logMessage.toString());
    }

    @AfterReturning(pointcut = "execution(* com.xhn.hilihili.*.controller.*.*(..))", returning = "result")
    public void logControllerOutput(Object result) {
        logger.info("Response: {}", result);
    }
}
