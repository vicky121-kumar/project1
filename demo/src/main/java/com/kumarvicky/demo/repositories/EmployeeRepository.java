package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
