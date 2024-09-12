package com.customer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.Entity.CustomerEntity;
import com.customer.service.CustomerService;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
	@Autowired
	CustomerService cs;
	@Autowired
	RestTemplate rt;
	
	@PostMapping(value="/postCustomerBranch")
	public String postAll(@RequestBody List<CustomerEntity> p) {
		String url="http://localhost:8080/bank/getByIFSC/";
		p.forEach(x-> {
			String b=x.getIfsccode();
			ResponseEntity<String> ce=rt.exchange(url+b, HttpMethod.GET,null,String.class);
			String cb=ce.getBody();
			x.setBranchname(cb);
		});
		
		
		return cs.postAll(p);
		
	}

}
