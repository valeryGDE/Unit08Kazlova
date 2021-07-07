package com.epam.unit08.bank.bean;

import java.util.ArrayList;
import java.util.List;

import com.epam.unit08.customer.bean.Customer;

public class Bank {

	private List<Customer> customers;

	public Bank() {
		customers = new ArrayList<Customer>();
	}

	public List<Customer> getcustomers() {
		return customers;
	}

	public void setBooks(List<Customer> customers) {
		this.customers = customers;
	}

	public void add(Customer b) {
		customers.add(b);
	}

	@Override
	public String toString() {
		return "Bank [customers=" + customers + "]";
	}

}
