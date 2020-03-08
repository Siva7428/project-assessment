package com.boot.rest.dao;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.boot.rest.model.Customer;
import com.boot.rest.model.CustomersModel;

@Repository
public class CustomerDao {
	private static CustomersModel list = new CustomersModel();

	static {
		list.getCustomersList().add(new Customer(12345, "Siva", "Savings", "INR", "12345.22", new Date()));
		list.getCustomersList().add(new Customer(78965, "Prasanna", "Current", "INR", "16785.22", new Date()));
		list.getCustomersList().add(new Customer(67542, "Lakshmi", "Savings", "INR", "12675.22", new Date()));
		list.getCustomersList().add(new Customer(12564, "Naidu", "Current", "INR", "67845.22", new Date()));

	}

	public CustomersModel getAllCustomers() {
		return list;
	}

	public void addCustomer(Customer customer) {
		list.getCustomersList().add(customer);
	}

}
