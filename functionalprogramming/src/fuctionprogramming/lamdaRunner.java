package fuctionprogramming;

import java.util.List;

public class lamdaRunner {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 66, 80).stream().filter(n -> n % 2 == 0).forEach(e -> System.out.println(e));

	}

}
