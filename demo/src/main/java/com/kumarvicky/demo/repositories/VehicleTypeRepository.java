package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.VehicleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface VehicleTypeRepository extends JpaRepository<VehicleType,Integer> {
}
