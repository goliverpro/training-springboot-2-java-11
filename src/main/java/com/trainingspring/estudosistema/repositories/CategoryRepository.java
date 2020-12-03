package com.trainingspring.estudosistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingspring.estudosistema.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
