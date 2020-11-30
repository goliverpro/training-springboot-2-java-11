package com.trainingspring.estudosistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingspring.estudosistema.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
