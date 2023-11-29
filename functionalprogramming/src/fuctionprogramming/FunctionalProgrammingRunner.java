package fuctionprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> fruits = List.of("Apple", "Banana", "Orange", "Melon", "Watermelon");

		// printWithFP(fruits);
		printBasicWithFilter(fruits);
		printWithFPWithFiltering(fruits);

	}

	// for문 우클릭후 Refactor extract method
	private static void printBasic(List<String> fruits) {
		for (String str : fruits) {
			System.out.println(str);
		}
	}

	// stream forEach 사용
	private static void printWithFP(List<String> fruits) {
		fruits.stream().forEach(element -> System.out.println("element -" + element));
	} // ->람다 표현식

	private static void printBasicWithFilter(List<String> fruits) {
		for (String str : fruits) {
			if (str.endsWith("elon")) {
				System.out.println(str);
			}

		}
	}

	private static void printWithFPWithFiltering(List<String> fruits) {
		fruits.stream().filter(element -> element.endsWith("elon")).forEach(
				element -> System.out.println("element - " + element)
				);
	} // ->람다 표현식

}
