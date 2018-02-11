package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.Collections;
import java.util.List;

public class TableClientFallbackImpl implements TableClient {

    @Override
    public List<Integer> getFreeTables() {
        System.out.println("service unavailable, free tables unknown");
        return Collections.singletonList(-1);
    }

    @Override
    public void freeTable(Integer id) {
        System.out.printf("service unavailable, free operation for table #%s not performed\n", id);
    }

    @Override
    public void occupyTable(Integer id) {
        System.out.printf("service unavailable, occupy operation for table #%s not performed\n", id);
    }
}
