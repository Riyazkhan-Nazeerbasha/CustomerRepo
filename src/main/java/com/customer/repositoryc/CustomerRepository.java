package com.customer.repositoryc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.Entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer>{

}
