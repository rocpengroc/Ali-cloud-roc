package com.cloud.roc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.google.common.collect.Lists;
import lombok.Data;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author rocpeng
 * <p>
 * 请求成功
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuccessResult<T extends AbstractBaseModel> extends AbstractBaseResult {

    private Links links;
    private List<DataBean> data;

    public SuccessResult(String self, T attributes) {
        links = new Links();
        links.setSelf(self);

        data = Lists.newArrayList();
        createDataBean("", attributes);
    }

    public SuccessResult(String self, int next, int last, List<T> attributes) {
        links = new Links();
        links.setSelf(self);
        links.setNext(self + "?page=" + next);
        links.setLast(self + "?page=" + last);

        data = Lists.newArrayList();
        if (CollectionUtils.isNotEmpty(attributes)) {
            attributes.forEach(attribute -> createDataBean(self, attribute));
        }
    }

    private void createDataBean(String self, T attributes) {
        if (data == null) {
            data = Lists.newArrayList();
        }
        DataBean dataBean = new DataBean<>();
        dataBean.setId(attributes.getId());
        dataBean.setType(attributes.getClass().getSimpleName());
        dataBean.setAttributes(attributes);

        if (StringUtils.isNoneBlank(self)) {
            Links links = new Links();
            links.setSelf(self + "/" + attributes.getId());
            dataBean.setLinks(links);
        }

        data.add(dataBean);
    }

}
