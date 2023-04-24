package com.xhn.hilihili.admin.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.validation.annotation.Validated;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName page_images
 */
@TableName("page_images")
public class PageImagesEntity implements Serializable {
    /**
     * 
     */
    @TableId()
    private Long id;

    /**
     * 图片url
     */
    private String imageUrl;

    /**
     * 描述
     */
    private String des;

    /**
     * 图片位置
     */
    private Integer type;

    /**
     * 显示状态 0，不显示，1显示
     */
    private Integer showStatus;

    /**
     * 
     */
    private Integer status;


    private Integer sort;

    /**
     * 
     */
    private Long updateId;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /**
     * 
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 图片url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * 图片url
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * 描述
     */
    public String getDes() {
        return des;
    }

    /**
     * 描述
     */
    public void setDes(String des) {
        this.des = des;
    }

    /**
     * 图片位置
     */
    public Integer getType() {
        return type;
    }

    /**
     * 图片位置
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 显示状态 0，不显示，1显示
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * 显示状态 0，不显示，1显示
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * 
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 
     */
    public Long getUpdateId() {
        return updateId;
    }

    /**
     * 
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /**
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }



    @Override
    public String toString() {
        return "PageImagesEntity{" +
                "id=" + id +
                ", imageUrl='" + imageUrl + '\'' +
                ", des='" + des + '\'' +
                ", type=" + type +
                ", showStatus=" + showStatus +
                ", status=" + status +
                ", sort=" + sort +
                ", updateId=" + updateId +
                ", updateTime=" + updateTime +
                ", createTime=" + createTime +
                '}';
    }


}