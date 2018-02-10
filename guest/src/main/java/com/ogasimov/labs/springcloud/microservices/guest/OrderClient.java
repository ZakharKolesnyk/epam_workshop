package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("Order")
public interface OrderClient {

    @PostMapping("/order/{tableId}")
    Integer createOrder(@PathVariable("tableId") Integer tableId, @RequestParam("menuItems") List<Integer> menuItems);
}
