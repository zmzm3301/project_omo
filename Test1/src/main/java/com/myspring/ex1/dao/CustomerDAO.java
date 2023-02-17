package com.myspring.ex1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.myspring.ex1.dto.Customer;

@Repository
public interface CustomerDAO {

	List<Customer> getCustomers();

}
