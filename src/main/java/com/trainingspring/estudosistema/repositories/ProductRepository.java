package com.trainingspring.estudosistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingspring.estudosistema.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
