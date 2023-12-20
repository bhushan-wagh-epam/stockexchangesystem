package com.ubs.common.model;

import lombok.Data;

@Data
public class Order {
    private String scriptName;
    private int quantity;
    private double price;
    private OrderType orderType;
}
