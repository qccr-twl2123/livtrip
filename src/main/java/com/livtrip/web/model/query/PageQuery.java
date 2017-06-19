package com.livtrip.web.model.query;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author xierongli
 * @version $Id:PageQuery.java v 0.1 2017年01月10日 11:51 xierongli
 */
public class PageQuery {

    public static final int defaultPageSize = 20;
    public static final int defaultPageNo = 1;

    private Integer pageSize = defaultPageSize;
    private Integer pageNumber = defaultPageNo;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize == null ? defaultPageSize : pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber == null|| pageNumber <= 0? defaultPageNo : pageNumber;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}
