package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

public class OrderClientFallbackImpl implements OrderClient {
    @Override
    public Integer createOrder(Integer tableId, List<Integer> menuItems) {
        System.out.println("service unavailable, creation order not performed");
        return -1;
    }
}
