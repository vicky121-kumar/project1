package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface JobTitleRepository extends JpaRepository<JobTitle,Integer> {
}
