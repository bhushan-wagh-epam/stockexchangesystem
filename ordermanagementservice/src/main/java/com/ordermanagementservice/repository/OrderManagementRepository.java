package com.ordermanagementservice.repository;

import com.ordermanagementservice.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderManagementRepository extends MongoRepository<OrderEntity, Long> {
}
