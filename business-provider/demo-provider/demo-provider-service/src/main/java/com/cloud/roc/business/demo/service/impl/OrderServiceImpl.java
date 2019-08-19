package com.cloud.roc.business.demo.service.impl;


import com.cloud.roc.business.demo.mapper.TOrderMapper;
import com.cloud.roc.business.demo.model.TOrder;
import com.cloud.roc.business.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rocpeng
 */
@RequestMapping("demo-provider")
@RestController
public class OrderServiceImpl implements OrderService {

    @Autowired
    private TOrderMapper tOrderMapper;

    @Override
    @GetMapping("{id}")
    public TOrder getOrder(@PathVariable int id) throws Exception {

        TOrder byId = tOrderMapper.findById(id);

        return tOrderMapper.findById(id);
    }

}
