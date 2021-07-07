package com.epam.unit08.bank.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.epam.unit08.customer.bean.Customer;

public class BankLogic {
	public long minCreditCardNumberValue = 1000_0000_0000_0000L;
	public long maxCreditCardNumberValue = 4000_0000_0000_0000L;

	public List<Customer> sortByLastName(List<Customer> customers) {
		Collections.sort(customers, new Comparator<Customer>() {
			public int compare(Customer o1, Customer o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		return customers;
	}

	public List<Customer> getCustomersWithCreditCardNumberBetweenMinAndMax(List<Customer> customers) {
		List<Customer> customersWithCreditCardNumberBetweenMinAndMax = new ArrayList<>();
		for (Customer customer : customers) {
			if (customer.getCreditCardNumber() < maxCreditCardNumberValue
					&& customer.getCreditCardNumber() > minCreditCardNumberValue) {
				customersWithCreditCardNumberBetweenMinAndMax.add((Customer) customer);
			}
		}
		return customersWithCreditCardNumberBetweenMinAndMax;

	}

}
