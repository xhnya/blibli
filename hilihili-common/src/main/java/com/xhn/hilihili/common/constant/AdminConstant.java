package com.xhn.hilihili.common.constant;

import lombok.Getter;
import lombok.Setter;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/4/11 10:56
 * @description:
 */
public class AdminConstant {

    /**
     * 页面位置的枚举类
     */
    public enum PageLocationEnum{
        Rotation_CHAART(10001,"轮播图");
        PageLocationEnum(int code, String msg){
            this.code = code;
            this.msg = msg;
        }
        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
        private int code;
        private String msg;
    }

}
