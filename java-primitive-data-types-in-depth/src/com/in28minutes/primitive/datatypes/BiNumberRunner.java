package com.in28minutes.primitive.datatypes;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2,3);
		System.out.println(numbers.add()); // 5
		System.out.println(numbers.multiply()); // 6

		numbers.doubleValue();
		
		System.out.println(numbers.getI()); // 4
		System.out.println(numbers.getJ()); // 6
	}

}
