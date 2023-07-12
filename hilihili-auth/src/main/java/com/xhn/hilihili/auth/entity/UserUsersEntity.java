package com.xhn.hilihili.auth.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户表
 * @TableName user_users
 */
@TableName(value ="user_users")
@Data
public class UserUsersEntity implements Serializable {
    /**
     * 用户id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户的登录名
     */
    private String userName;

    /**
     * 真实姓名
     */
    private String fullName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     *  用户编码
     */
    private String userCode;

    /**
     * 手机号
     */
    private Integer mobile;

    /**
     * 用户角色
     */
    private Long userRole;

    /**
     * 注册时间
     */
    private Date registerTime;

    /**
     * 默认字段
     */
    private Integer status;

    /**
     * 删除标志
     */
    private Integer isDel;

    /**
     * 默认字段
     */
    private Date createTime;

    /**
     * 默认字段
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}