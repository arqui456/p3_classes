package com.abuarquemf.class1;

import java.util.Scanner;

public class Comparison {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Type first integer: ");
		int number1= input.nextInt();
		
		System.out.print("Type second integer: ");
		int number2 = input.nextInt();
				
		if(number1 == number2)
			System.out.println(String.format("%d == %d", number1, number2));
		
		if(number1 != number2)
			System.out.println(String.format("%d != %d", number1, number2));
		
		if(number1 < number2)
			System.out.println(String.format("%d < %d", number1, number2));
		
		if(number1 > number2)
			System.out.println(String.format("%d > %d", number1, number2));
		
		if(number1 <= number2)
			System.out.println(String.format("%d <= %d", number1, number2));
		
		if(number1 >= number2)
			System.out.println(String.format("%d >= %d", number1, number2));
		
		input.close();
	}

}
