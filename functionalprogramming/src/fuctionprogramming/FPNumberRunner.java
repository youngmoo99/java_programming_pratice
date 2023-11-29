package fuctionprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		// numbers.stream().forEach(element -> System.out.println(element));
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);

		System.out.println(sum);

		System.out.println(fpSum(numbers));

	}

	private static void normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		System.out.println(sum);
	}

	// 람다 표현식
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});


	}

}
