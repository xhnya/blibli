package com.xhn.bilibili.admin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 页面的图片。
 * @TableName page_images
 */
public class PageImages implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 图片链接
     */
    private String url;

    /**
     * 描述
     */
    private String describe;

    /**
     * 图片的位置
     */
    private Integer type;

    /**
     * 更新人
     */
    private String updateName;

    /**
     * 
     */
    private Date createTime;

    /**
     * 
     */
    private Date updateTime;

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
     * 图片链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * 图片链接
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 描述
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * 图片的位置
     */
    public Integer getType() {
        return type;
    }

    /**
     * 图片的位置
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 更新人
     */
    public String getUpdateName() {
        return updateName;
    }

    /**
     * 更新人
     */
    public void setUpdateName(String updateName) {
        this.updateName = updateName;
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

    /**
     * 
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PageImages other = (PageImages) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getDescribe() == null ? other.getDescribe() == null : this.getDescribe().equals(other.getDescribe()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getUpdateName() == null ? other.getUpdateName() == null : this.getUpdateName().equals(other.getUpdateName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getDescribe() == null) ? 0 : getDescribe().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getUpdateName() == null) ? 0 : getUpdateName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", describe=").append(describe);
        sb.append(", type=").append(type);
        sb.append(", updateName=").append(updateName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}