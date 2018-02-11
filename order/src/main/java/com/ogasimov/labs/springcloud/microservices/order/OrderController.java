package com.ogasimov.labs.springcloud.microservices.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/{tableId}")
    public Integer createOrder(@PathVariable Integer tableId, @RequestParam("menuItems") List<Integer> menuItems) {
        return orderService.createOrder(tableId, menuItems);
    }
}
