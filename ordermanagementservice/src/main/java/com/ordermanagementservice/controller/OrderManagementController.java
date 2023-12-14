package com.ordermanagementservice.controller;

import com.ubs.common.model.Stock;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderManagementController {

    @PostMapping("/stocks")
    public Stock getStocks(@RequestBody Stock stock) {
        log.info("Received stock request : {}", stock);

        //TODO Add stock in DB
        return stock;
    }
}
