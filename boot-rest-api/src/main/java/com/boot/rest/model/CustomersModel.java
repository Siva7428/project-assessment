package com.boot.rest.model;

import java.util.ArrayList;
import java.util.List;

public class CustomersModel {
	private List<Customer> customerList;

	public List<Customer> getCustomersList() {
		if (customerList == null) {
			customerList = new ArrayList<>();
		}
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

}
