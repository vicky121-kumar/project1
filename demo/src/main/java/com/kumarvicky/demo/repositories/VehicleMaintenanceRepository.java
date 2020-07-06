package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.VehicleMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance,Integer> {
}
