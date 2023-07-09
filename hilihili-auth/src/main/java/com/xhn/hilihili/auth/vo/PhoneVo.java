package com.xhn.hilihili.auth.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/6/12 11:06
 * @description:
 */
@Data
public class PhoneVo {
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = "^1[3-9]\\d{9}$", message = "手机号格式不正确")
    private Integer phone;
    @NotBlank(message = "验证码不能为空")
    private Integer code;
}
