package com.epam.unit08.type01;

public class App {

	public static void main(String[] args) {

//		Создать класс Customer, спецификация которого приведена ниже. Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//		Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//		Найти и вывести (критерии выбора):
//		a) список покупателей в алфавитном порядке;
//		b) список покупателей, у которых номер кредитной карточки находится в заданном интервале.

		Customer customer1 = new Customer(1, "Ziu", "Chiu", "Liu", 1134_4545_5656_9079L, "CI24-GTDE-4217-1145-8111-1233");

		Customer customer2 = new Customer(2, "Patterson", "Irina", 2345_4358_7976_9823L, "RT98-DFOK-3857-5682-3983-2979");
		Customer customer3 = new Customer(3, "Ivanova", "Ivonna", "Ivanovna", 4334_4566_8990_9786L,
				"BY24-BYUK-4417-2345-8656-1231");

		Customer customer4 = new Customer(4, "Golt", "John", 1234_4356_8976_9876L, "BY98-BROK-4847-9382-3483-8986");

		Bank bank = new Bank();

		bank.add(customer1);
		bank.add(customer2);
		bank.add(customer3);
		bank.add(customer4);

		System.out.println("Список покупателей в алфавитном порядке: " + bank.sortByLastName());
		System.out.println("Список покупателей, у которых номер кредитной карточки находится в интервале от " + bank.minCreditCardNumberValue + " до " + bank.maxCreditCardNumberValue + ": " + bank.getCustomersWithCreditCardNumberBetweenMinAndMax());

	}

}
