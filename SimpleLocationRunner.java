package com.abuarquemf.class1;

public class SimpleLocationRunner {

	public static void main(String[] args) {
		
		SimpleLocation local1 = new SimpleLocation(505, -505);
		System.out.println(local1);
		
		SimpleLocation local2 = new SimpleLocation(0, 10);
		System.out.println(local2);
		
		System.out.println(String.format("Distance: %.2f", local1.distance(local2)));
	}
}
