package com.cloud.roc.business.demo.service;

import com.cloud.roc.business.demo.model.TOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rocpeng
 *
 * 这里的 service 既是提供者的 service 接口类 , 又是消费之的 feignCline
 * 所以在开发中,提供者和消费者的 pom中都需要一来这个模块, 同时这个模块的所有的实体类也都在 api 模块中
 *
 */
@FeignClient(value = "demo-provider")
public interface OrderService {

    @RequestMapping("{id}")
    TOrder getOrder(@PathVariable int id) throws Exception;
}
