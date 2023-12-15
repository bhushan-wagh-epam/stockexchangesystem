package com.ordermanagementservice.service;

import com.ordermanagementservice.entity.OrderEntity;
import com.ordermanagementservice.repository.OrderManagementRepository;
import com.ubs.common.model.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderManagementService {

    private final OrderManagementRepository orderManagementRepository;

    public Order addOrder(Order order) {
        OrderEntity orderEntity = new OrderEntity();

        orderEntity.setScriptName(order.getScriptName());
        orderEntity.setQuantity(order.getQuantity());
        orderEntity.setPrice(order.getPrice());
        orderEntity.setOrderType(order.getOrderType());

        orderManagementRepository.save(orderEntity);

        return order;
    }
}
