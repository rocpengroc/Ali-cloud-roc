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
 *
 * 这里我将实现类直接添加了 controller 注解
 * 简化了提供者的 controller 和 impl的写法
 * 这里还未做分布式事务的处理,不知道会不会有影响,有待后期验证
 *
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
