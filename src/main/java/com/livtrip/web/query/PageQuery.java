package com.livtrip.web.query;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Created by xierongli on 17/6/17.
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
