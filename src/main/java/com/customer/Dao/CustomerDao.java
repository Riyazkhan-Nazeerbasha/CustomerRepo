package com.customer.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.Entity.CustomerEntity;
import com.customer.repositoryc.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository cr;
	
	public String postAll(List<CustomerEntity> p) {
		cr.saveAll(p);
		return "Completed";
	}
	

}
