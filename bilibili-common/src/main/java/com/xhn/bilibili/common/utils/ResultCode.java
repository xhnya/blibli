package com.xhn.bilibili.common.utils;

public interface ResultCode {
    public static Integer SUCCESS=200; //成功状态码
    public static Integer ERROR=500; //失败状态码
    public static Integer FORBIDDEN=403; // "没有相关权限"
    public static Integer UNAUTHORIZED=401; //暂未登录或token已经过期
}
