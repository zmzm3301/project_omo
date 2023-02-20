package com.myspring.ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myspring.ex1.dto.Customer;
import com.myspring.ex1.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService service;
	
	@GetMapping(path="/customer")
	public List<Customer> getCustomers() {
		return service.getCustomers();
	}
}
