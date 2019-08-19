package com.cloud.roc.consumer.demo.controller;

import com.cloud.roc.base.AbstractBaseController;
import com.cloud.roc.business.demo.model.TOrder;
import com.cloud.roc.business.demo.service.OrderService;
import com.cloud.roc.dto.AbstractBaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocpeng
 */
@RestController
@RequestMapping("demo-consumer")
public class DemoController extends AbstractBaseController {

    @Autowired
    private OrderService orderService;

    @GetMapping("{id}")
    public AbstractBaseResult getOrder(@PathVariable int id) {
        try {
            TOrder order = orderService.getOrder(id);
            return this.success(request.getRequestURI(), order);
        } catch (Exception e) {
            return this.error("查询订单失败", e.getMessage());
        }
    }

}
