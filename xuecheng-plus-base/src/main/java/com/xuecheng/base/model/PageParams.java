package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * 分页查询通用参数
 */
@Data
@ToString
public class PageParams {
    private Long pageNo = 1L;
    private Long pageSize = 30L;

    public PageParams() {}
    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
