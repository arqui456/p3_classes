package com.abuarquemf.class1;

import java.util.Scanner;

public class AccountRunner {

	public static void main(String[] args) {
		Account account1 = new Account("Linus Torvalds", 0);
		Account account2 = new Account("Bill Gates", 0);
		
		System.out.println(String.format("Account1 name is %s", account1.getName()));
		System.out.println(String.format("Account2 name is %s", account2.getName()));
	}
}
