package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Customer;

public interface CustomerRespository extends JpaRepository<Customer, Long>{

}
