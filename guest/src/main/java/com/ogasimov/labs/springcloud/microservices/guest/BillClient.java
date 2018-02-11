package com.ogasimov.labs.springcloud.microservices.guest;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "Bill", fallback = BillClientFallbackImpl.class)
public interface BillClient {

    @DeleteMapping("/bills/{tableId}")
    void payBills(@PathVariable("tableId") Integer tableId);
}
