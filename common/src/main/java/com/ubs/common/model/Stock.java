package com.ubs.common.model;

import lombok.Data;

@Data
public class Stock {
    private String scriptName;
    private int quantity;
    private double price;
    private OrderType orderType;
}
