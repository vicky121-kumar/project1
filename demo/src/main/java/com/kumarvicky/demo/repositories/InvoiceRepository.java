package com.kumarvicky.demo.repositories;

import com.kumarvicky.demo.models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
}
