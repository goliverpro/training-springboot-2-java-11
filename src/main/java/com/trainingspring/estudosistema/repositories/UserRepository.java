package com.trainingspring.estudosistema.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainingspring.estudosistema.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
