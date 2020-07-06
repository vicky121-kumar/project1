package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface ClientRepository extends JpaRepository<Client,Integer> {
}
