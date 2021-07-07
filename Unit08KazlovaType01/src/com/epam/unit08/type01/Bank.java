package com.epam.unit08.type01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bank {

	private List<Customer> customers;
	long minCreditCardNumberValue = 1000_0000_0000_0000L;
	long maxCreditCardNumberValue = 4000_0000_0000_0000L;

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

	public Bank sortByLastName() {
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		return this;
	}

	public List<Customer> getCustomersWithCreditCardNumberBetweenMinAndMax() {
		List<Customer> customersWithCreditCardNumberBetweenMinAndMax = new ArrayList<>();
		for (Customer customer : customers) {
			if (customer.getCreditCardNumber() < maxCreditCardNumberValue
					&& customer.getCreditCardNumber() > minCreditCardNumberValue) {
				customersWithCreditCardNumberBetweenMinAndMax.add((Customer) customer);
			}
		}
		return customersWithCreditCardNumberBetweenMinAndMax;
	}

	@Override
	public String toString() {
		return "Bank [customers=" + customers + "]";
	}

}
