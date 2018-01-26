package com.abuarquemf.class1;

public class Account {
	
	private String name;
	private double balance;

	public Account(String name, double balance) {
		this.name = name;
		if(balance > 0)
			this.balance = balance;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0)
			balance += depositAmount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "Account {'name'=" + name + "}";
	}
	
	

}
