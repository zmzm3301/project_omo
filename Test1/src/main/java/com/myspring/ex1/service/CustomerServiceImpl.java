package com.myspring.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspring.ex1.dao.CustomerDAO;
import com.myspring.ex1.dto.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDAO dao;
	
	@Override
	public List<Customer> getCustomers() {
		return dao.getCustomers();
	}
}
