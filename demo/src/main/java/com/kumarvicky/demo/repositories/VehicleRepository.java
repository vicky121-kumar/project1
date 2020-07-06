package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
