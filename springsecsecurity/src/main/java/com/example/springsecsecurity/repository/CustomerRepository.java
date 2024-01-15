package com.example.springsecsecurity.repository;

import com.example.springsecsecurity.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findByEmail(String username);
}
