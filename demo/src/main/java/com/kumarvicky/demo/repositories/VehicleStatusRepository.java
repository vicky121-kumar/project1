package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.VehicleStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface VehicleStatusRepository extends JpaRepository<VehicleStatus,Integer> {
}
