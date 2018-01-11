package com.ysd.base.dto;

/**
 * 查询条件对象请继承改Page
 */
public class Page implements java.io.Serializable{

    private Long offset;//数据库查询条件
    private Long rows;//数据库查询条件

    private Long pageNo = 1L;//页码(页面传过来的参数) 第1页值为1

    private Long pageSize = 10L;//每页大小(页面传过来的参数)

    public Long getPageNo() {
        return pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getOffset() {
        offset = pageSize * (pageNo - 1);
        return offset;
    }

    public Long getRows() {
        rows = pageSize;
        return rows;
    }
}
