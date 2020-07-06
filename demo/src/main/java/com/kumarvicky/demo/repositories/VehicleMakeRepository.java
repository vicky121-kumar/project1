package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.VehicleMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface VehicleMakeRepository extends JpaRepository<VehicleMake,Integer> {
}
