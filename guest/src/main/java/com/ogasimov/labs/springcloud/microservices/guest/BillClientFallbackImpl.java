package com.ogasimov.labs.springcloud.microservices.guest;

public class BillClientFallbackImpl implements BillClient {

    @Override
    public void payBills(Integer tableId) {
        System.out.printf("service unavailable, pay for table #%s not performed\n", tableId);
    }
}
