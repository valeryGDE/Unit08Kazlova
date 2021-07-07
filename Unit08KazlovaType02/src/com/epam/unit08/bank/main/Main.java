package com.epam.unit08.bank.main;

import com.epam.unit08.bank.bean.Bank;
import com.epam.unit08.bank.logic.BankLogic;
import com.epam.unit08.customer.bean.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Ziu", "Chiu", "Liu", 1134_4545_5656_9079L,
				"CI24-GTDE-4217-1145-8111-1233");

		Customer customer2 = new Customer(2, "Patterson", "Irina", 2345_4358_7976_9823L,
				"RT98-DFOK-3857-5682-3983-2979");
		Customer customer3 = new Customer(3, "Ivanova", "Ivonna", "Ivanovna", 4334_4566_8990_9786L,
				"BY24-BYUK-4417-2345-8656-1231");

		Customer customer4 = new Customer(4, "Golt", "John", 1234_4356_8976_9876L, "BY98-BROK-4847-9382-3483-8986");

		Bank bank = new Bank();
		
		BankLogic bankLogic = new BankLogic();

		bank.add(customer1);
		bank.add(customer2);
		bank.add(customer3);
		bank.add(customer4);

		System.out.println("Список покупателей в алфавитном порядке: " + bankLogic.sortByLastName(bank.getcustomers()));
		System.out.println("Список покупателей, у которых номер кредитной карточки находится в интервале от " + bankLogic.minCreditCardNumberValue + " до " + bankLogic.maxCreditCardNumberValue + ": " + bankLogic.getCustomersWithCreditCardNumberBetweenMinAndMax(bank.getcustomers()));

	}

}
