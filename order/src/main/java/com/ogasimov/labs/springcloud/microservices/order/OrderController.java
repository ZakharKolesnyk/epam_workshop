package com.ogasimov.labs.springcloud.microservices.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/order/{tableId}")
    public Integer createOrder(@PathVariable Integer tableId, @RequestParam List<Integer> menuItems) {
        return orderService.createOrder(tableId,menuItems);
    }
}
