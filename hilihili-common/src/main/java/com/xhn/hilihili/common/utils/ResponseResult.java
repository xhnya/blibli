
package com.xhn.hilihili.common.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

@ApiModel("返回结果")
public class ResponseResult<T> implements Serializable {
    static final String DEFAULT_OK_MSG = "OK";
    static final String DEFAULT_WARN_MSG = "WARN";
    static final String DEFAULT_ERROR_MSG = "ERROR";
    static final int OK_CODE = 200;
    static final int WARN_CODE = 400;
    static final int ERROR_CODE = 500;
    @ApiModelProperty(
        value = "结果",
        position = 1,
        dataType = "Boolean"
    )
    private Boolean result = true;
    @ApiModelProperty(
        value = "编码",
        position = 2,
        dataType = "String"
    )
    private Integer code = 200;
    @ApiModelProperty(
        value = "消息",
        position = 3,
        dataType = "String"
    )
    private String msg = "";
    @ApiModelProperty(
        value = "数据",
        position = 4,
        dataType = "Object"
    )
    private T data = null;

    public ResponseResult() {
    }

    private ResponseResult(Boolean result, Integer code, String msg, T data) {
        this.result = result;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> ResponseResult<T> ok() {
        return new ResponseResult(true, 200, "OK", (Object)null);
    }

    public static <T> ResponseResult<T> ok(String msg) {
        return new ResponseResult(true, 200, msg, (Object)null);
    }

    public static <T> ResponseResult<T> ok(T data) {
        return new ResponseResult(true, 200, "OK", data);
    }

    public static <T> ResponseResult<T> ok(String msg, T data) {
        return new ResponseResult(true, 200, msg, data);
    }

    public static <T> ResponseResult<T> warn() {
        return new ResponseResult(false, 400, "WARN", (Object)null);
    }

    public static <T> ResponseResult<T> warn(String msg) {
        return new ResponseResult(false, 400, msg, (Object)null);
    }

    public static <T> ResponseResult<T> warn(Integer code) {
        return new ResponseResult(false, code, "WARN", (Object)null);
    }

    public static <T> ResponseResult<T> warn(Integer code, String msg) {
        return new ResponseResult(false, code, msg, (Object)null);
    }

    public static <T> ResponseResult<T> warn(String msg, T data) {
        return new ResponseResult(false, 400, msg, data);
    }

    public static <T> ResponseResult<T> warn(Integer code, String msg, T data) {
        return new ResponseResult(false, code, msg, data);
    }

    public static <T> ResponseResult<T> error() {
        return new ResponseResult(false, 500, "ERROR", (Object)null);
    }

    public static <T> ResponseResult<T> error(String msg) {
        return new ResponseResult(false, 500, msg, (Object)null);
    }

    public static <T> ResponseResult<T> error(Integer code) {
        return new ResponseResult(false, code, "ERROR", (Object)null);
    }

    public static <T> ResponseResult<T> error(Integer code, String msg) {
        return new ResponseResult(false, code, msg, (Object)null);
    }

    public static <T> ResponseResult<T> error(String msg, T data) {
        return new ResponseResult(false, 500, msg, data);
    }

    public static <T> ResponseResult<T> error(Integer code, String msg, T data) {
        return new ResponseResult(false, code, msg, data);
    }

    public Boolean getResult() {
        return this.result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public Integer getCode() {
        return this.code;
    }

    public ResponseResult<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public ResponseResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
