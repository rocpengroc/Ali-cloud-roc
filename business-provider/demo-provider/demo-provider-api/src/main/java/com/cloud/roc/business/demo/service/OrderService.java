package com.cloud.roc.business.demo.service;

import com.cloud.roc.business.demo.model.TOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "demo-provider")
public interface OrderService {

    @RequestMapping("{id}")
    TOrder getOrder(@PathVariable int id) throws Exception;
}
