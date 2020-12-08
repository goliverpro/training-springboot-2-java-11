package com.trainingspring.estudosistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingspring.estudosistema.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
