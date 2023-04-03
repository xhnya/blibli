package com.xhn.bilibili.common.utils;

import com.xhn.bilibili.common.constant.PageConstant;

/**
 * @author xhn
 * @email hain.xiao@outlook.com
 * @date 2023/2/16 14:47
 * @description:
 */
public class PageRequest {
    private int page;
    private int size= PageConstant.PAGE_SIZE_TEN;
    private String sortBy;
    private boolean isAsc;

    public PageRequest(int page, int size, String sortBy, boolean isAsc) {
        this.page = page;
        this.size = size;
        this.sortBy = sortBy;
        this.isAsc = isAsc;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

    public String getSortBy() {
        return sortBy;
    }

    public boolean isAsc() {
        return isAsc;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public void setAsc(boolean isAsc) {
        this.isAsc = isAsc;
    }

    public int getOffset() {
        return (page - 1) * size;
    }

    public String getOrderClause() {
        String order = isAsc ? "ASC" : "DESC";
        return "ORDER BY " + sortBy + " " + order;
    }
}
