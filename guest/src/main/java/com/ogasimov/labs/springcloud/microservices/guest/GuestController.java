package com.ogasimov.labs.springcloud.microservices.guest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GuestController {
    @Autowired
    private DinnerService dinnerService;

    @PostMapping("/dinner")
    public Integer startDinner(@RequestParam List<Integer> menuItems) {
        return dinnerService.startDinner(menuItems);
    }

    @DeleteMapping("/dinner/{tableId}")
    public void finishDinner(@PathVariable Integer tableId) {
        dinnerService.finishDinner(tableId);
    }
}
