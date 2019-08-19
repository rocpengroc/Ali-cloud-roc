package com.cloud.roc.business.demo.model;

import com.cloud.roc.dto.AbstractBaseModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * @author rocpeng
 */
@Data
@Table(name = "t_order")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TOrder extends AbstractBaseModel {

    /**
     * 用户主键
     */
    @NotNull(message = "用户不能为空")
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 备注
     */
    private String remark;
}