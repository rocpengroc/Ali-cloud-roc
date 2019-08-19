package com.cloud.roc.base;


import com.cloud.roc.dto.AbstractBaseModel;
import com.github.pagehelper.PageInfo;

/**
 * @author rocpeng
 */
public interface BaseService<T extends AbstractBaseModel> {

    /**
     * 查询属性值是否唯一
     *
     * @param property
     * @param value
     * @return true:唯一;false:不唯一
     */
    default boolean unique(String property, String value) {
        return false;
    }

    /**
     * 保存
     *
     * @param domain
     * @return
     */
    default T saveOrUpdate(T domain) {
        return null;
    }

    /**
     * 分页
     *
     * @return
     */
    default PageInfo<T> page(T domain, int pageNum, int pageSize) {
        return null;
    }
}
