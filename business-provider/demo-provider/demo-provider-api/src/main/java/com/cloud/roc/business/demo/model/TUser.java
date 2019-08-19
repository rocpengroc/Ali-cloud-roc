package com.cloud.roc.business.demo.model;

import com.cloud.roc.dto.AbstractBaseModel;
import com.cloud.roc.utils.RegexpUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @author rocpeng
 */
@Data
@Table(name = "t_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TUser extends AbstractBaseModel {

    /**
     * 名称
     */
    @NotNull(message = "名称不能为空")
    @Length(min = 1, max = 20, message = "用户名长度必须介于 1 和 20 之间")
    private String name;

    /**
     * 年龄
     * JsonIgnore : 忽略回显该属性
     */
    @JsonIgnore
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    @Pattern(regexp = RegexpUtils.PHONE, message = "手机号格式不正确")
    private String tel;
}