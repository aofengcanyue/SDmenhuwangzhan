package com.regex.web.common.utils;

import java.io.Serializable;
import java.util.List;

/**
 * 分页结果�?
 * @author ocean
 *
 */
public class QueryResult <T> implements Serializable {
	/**
     */
    private static final long serialVersionUID = 1L;

    private List<T> datas;

    private Boolean isLastPage;

    private Integer totalDataCount;

    private int     pageNumber;

    private int     pageSize;

    private Integer pageCount;

    private int     indexNumber;

    /**
     * @param totalDataCount 总数据件�?
     * @param pageSize 每页显示条数
     * @param pageNumber 当前的页�?
     */
    public QueryResult(int totalDataCount, int pageSize, int pageNumber) {
        super();
        this.totalDataCount = totalDataCount;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        if (this.pageNumber < 1) {
            this.pageNumber = 1;
        }
        if (this.totalDataCount <= 0) {
            return;
        }
        // 如果查询页数大于总页数，则取�?后一�?
        if (this.totalDataCount <= (this.pageNumber - 1) * this.pageSize) {
            this.pageNumber = (this.totalDataCount + this.pageSize - 1) / this.pageSize;
        }
        this.indexNumber = (this.pageNumber - 1) * this.pageSize;
        // 总页�?
        this.pageCount = (this.totalDataCount + this.pageSize - 1) / this.pageSize;
        // 是否为最后一�?
        this.isLastPage = (this.pageNumber == this.pageCount ? true : false);
    }

    public QueryResult() {
        super();
    }

    /**
     * 返回的数据集
     * @return the datas
     */
    public List<T> getDatas() {
        return datas;
    }

    /**
     * @param datas the datas to set
     */
    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    /**
     * 满足查询条件的�?�记录数�? null 意味�?未知。注：只在查询第�?页时返回正确的�?�记录数，其它页码时，返�?-1
     * @return the totalDataCount
     */
    public Integer getTotalDataCount() {
        return totalDataCount;
    }

    /**
     * @param totalDataCount the totalDataCount to set
     */
    public void setTotalDataCount(Integer totalDataCount) {
        this.totalDataCount = totalDataCount;
    }

    /**
     * 页码,�?1�?�?
     * @return the pageNumber
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * @param pageNumber the pageNumber to set
     */
    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * 满足查询条件的�?�页数， null 意味�?未知。注：只在查询第�?页时返回正确的�?�记录数，其它页码时，返�?-1
     * 
     * @return the pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     * @param pageCount the pageCount to set
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     * 每页大小，缺省为20条记�?/�?
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * @param pageSize the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * 标志是否�?后一页，True: 是最后一页，False: 不是，null：未�?
     * @return the lastPage
     */
    public Boolean getIsLastPage() {
        return isLastPage;
    }

    /**
     * @param lastPage the lastPage to set
     */
    public void setIsLastPage(Boolean lastPage) {
        this.isLastPage = lastPage;
    }

    /**
     * 计算�?始数
     * @return the lastPage
     */
    public int getIndexNumber() {
        return indexNumber;
    }
}
