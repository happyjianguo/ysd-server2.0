package com.ysd.base.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * 查询出来的数据 带分页信息
 */
public class PageResult extends Page {
    private Long start;//当前页 开始行
    private Long end;//当前页 结束行

    private Long totalPageCount;//总页数

    private Long totalSize;//总数据量

    private List dataList = new ArrayList();//数据

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public Long getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(Long totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public Long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
    }

    public List getDataList() {
        return dataList;
    }

    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    public PageResult(Page page,Long totalSize) {
        if (page != null) {
            setPageNo(page.getPageNo());
            setPageSize(page.getPageSize());
        }
        long pageSize = getPageSize();
        long mod = (int)(totalSize % pageSize);
        totalPageCount = mod > 0?totalSize/pageSize+ 1:totalSize/pageSize;

        start = pageSize * (getPageNo() - 1) + 1;
        if (totalPageCount == getPageNo()){
            end = totalSize;
        } else {
            end = pageSize * getPageNo();
        }

        this.totalSize = totalSize;
    }

    public PageResult(Page page,Long totalSize,List list) {
        this(page,totalSize);
        this.dataList.addAll(list);
    }
}
