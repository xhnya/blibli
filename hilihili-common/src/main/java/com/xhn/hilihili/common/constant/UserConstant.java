package com.xhn.hilihili.common.constant;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/6/15 15:45
 * @description:
 */
public class UserConstant {

    public enum UserStatusEnum{
        NEW(0,"新用户"),
        NORMAL(1,"正常"),
        LOCKED(2,"锁定"),
        DELETED(3,"删除");
        UserStatusEnum(int code, String msg){
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

    public enum UserRoleEnum{
        ADMIN(1L,"管理员"),
        USER(2L,"普通用户"),
        MEMBER(3L,"会员用户");
        UserRoleEnum(Long code, String msg){
            this.code = code;
            this.msg = msg;
        }
        public Long getCode() {
            return code;
        }

        public void setCode(Long code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
        private Long code;
        private String msg;
    }

}
