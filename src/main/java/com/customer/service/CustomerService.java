package com.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.customer.Dao.CustomerDao;
import com.customer.Entity.CustomerEntity;

@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;
	
	public String postAll(List<CustomerEntity> p) {
		return cd.postAll(p);
	}

}
