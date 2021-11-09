package com.community.qa;

public class Runner {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		System.out.println(bank.getName());

		bank.setMoney(25);
		System.out.println(bank.getMoney());

		System.out.println(bank.getAccountNumber());

	}

}
