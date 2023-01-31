package com.xhn.bilibili.common.utils;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xhn
 * @date 2022/1/2 15:23
 * @description: 统一结果返回
 */
@Data
public class Result {
    /**
     * 是否成功
     */
    private Boolean success;

    /**
     * 返回码
     */
    private Integer code;

    /**
     * 返回消息
     */
    private String message;

    /**
     * 返回数据
     */
    private Map<String, Object> data = new HashMap<String, Object>();

    //构造方法私有
    private Result(){}

    //成功的静态方法
    public static Result ok(){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage("成功");
        return result;
    }
    //成功的静态方法
    public static Result ok(String message){
        Result result=new Result();
        result.setSuccess(true);
        result.setCode(ResultCode.SUCCESS);
        result.setMessage(message);
        return result;
    }

    //失败的静态方法
    public static Result error(){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage("失败");
        return result;
    }

    public static Result error(String message){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.ERROR);
        result.setMessage(message);
        return result;
    }

    //失败的静态方法
    public static Result forbidden(){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.FORBIDDEN);
        result.setMessage("没有相关权限");
        return result;
    }
    //未登录返回结果
    public static Result unauthorized(){
        Result result=new Result();
        result.setSuccess(false);
        result.setCode(ResultCode.UNAUTHORIZED);
        result.setMessage("暂未登录或token已经过期");
        return result;
    }


    public Result success(Boolean success){
        this.setSuccess(success);
        return this;
    }

    public Result message(String message){
        this.setMessage(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key, Object value){
        this.data.put(key, value);
        return this;
    }

    public Result data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
