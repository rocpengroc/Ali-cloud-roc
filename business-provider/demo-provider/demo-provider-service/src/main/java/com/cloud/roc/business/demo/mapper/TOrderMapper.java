package com.cloud.roc.business.demo.mapper;

import com.cloud.roc.business.demo.model.TOrder;
import org.springframework.stereotype.Repository;

/**
 * @author rocpeng
 */
@Repository
public interface TOrderMapper {

    /**
     * 查询 demo
     *
     * @param id
     * @return
     */
    TOrder findById(int id);
}