package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface UserRepository extends JpaRepository<User,Integer> {
}
