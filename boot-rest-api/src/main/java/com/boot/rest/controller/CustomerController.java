package com.boot.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.rest.dao.CustomerDao;
import com.boot.rest.model.CustomersModel;

@RestController
@RequestMapping("/all")
public class CustomerController {

	@Autowired
	private CustomerDao customerDao;

	@GetMapping(path = "/getAllCustomers", produces = "application/json")
	public CustomersModel getCustomers() {
		return customerDao.getAllCustomers();
	}

}
