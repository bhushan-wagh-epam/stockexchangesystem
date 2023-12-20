package com.ordermanagementservice.controller;

import com.ordermanagementservice.service.OrderManagementService;
import com.ubs.common.model.Order;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class OrderManagementController {

    private final OrderManagementService orderManagementService;

    @PostMapping("/order")
    public Order getStocks(@RequestBody Order order) {
        log.info("Received order request : {}", order);
        orderManagementService.addOrder(order);
        return order;
    }
}
