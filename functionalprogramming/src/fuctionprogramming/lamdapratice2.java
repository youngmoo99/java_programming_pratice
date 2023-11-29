package fuctionprogramming;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class lamdapratice2 {

	public static void main(String[] args) {
		int sum1 = IntStream.range(1, 11).reduce(0, (n1, n2) -> n1 + n2);
		System.out.println(sum1);

		Optional<Integer> max1 = List.of(23, 34, 55, 67, 11).stream().filter(n -> n % 2 == 0)
				.max((n1, n2) -> Integer.compare(n1, n2));
		System.out.println(max1);
	}

}
