package com.community.qa;

public class BankAccount {

	private String name = "Paul";
	private double money = 20.50;
	private int accountNumber = 271625;

	// CONSTRUCTOR

	// GETTER
	public String getName() {
		return this.name;
	}

	// SETTER
	public void setName(String name) {
		this.name = name;
	}

	// GETTER
	public int getAccountNumber() {
		return accountNumber;
	}

	// SETTER
	public static void setAccountNumber(int accountNumber) {
	}

	// GETTER
	public double getMoney() {
		return money;
	}

	// SETTER
	public void setMoney(double money) {
		this.money = money;
	}

}
