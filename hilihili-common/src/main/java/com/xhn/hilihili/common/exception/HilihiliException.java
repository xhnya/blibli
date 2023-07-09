package com.xhn.hilihili.common.exception;


import com.xhn.hilihili.common.enums.ResultCode;
import lombok.Data;

/**
 * @author xhn
 * @date 2023/7/9 14:25
 * @description: 自定义异常
 */
@Data
public class HilihiliException extends RuntimeException{
    private Integer code;

    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public HilihiliException(Integer code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public HilihiliException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public static HilihiliException from(ResultCode resultCode) {
        return new HilihiliException(resultCode.getCode(), resultCode.getMsg());
    }


    public static HilihiliException from(String msg) {
        return new HilihiliException(msg);
    }

    @Override
    public String toString() {
        return "HilihiliException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }
}
