package com.xhn.bilibili.common.enums;

/**
 * @author ：xhn
 * @date ：2022/2/14 15:38
 * @description：
 */
public interface  IResultCode {
    /**
     *  获取响应码
     * @return 响应码
     */
    Integer getCode();


    /**
     * 获取响应信息
     *
     * @return 响应信息
     */
    String getMsg();
}
