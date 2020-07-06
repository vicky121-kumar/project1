package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface VehicleMovementRepository extends JpaRepository<VehicleMovement,Integer> {
}
