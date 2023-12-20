package com.ordermanagementservice.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ubs.common.model.OrderType;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "order")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderEntity {
    private Long orderId;
    private String scriptName;
    private int quantity;
    private double price;
    private OrderType orderType;
}
