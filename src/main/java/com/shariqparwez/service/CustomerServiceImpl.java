package com.shariqparwez.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.shariqparwez.model.Customer;
import com.shariqparwez.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {
	
	//@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
