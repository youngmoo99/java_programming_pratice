package fuctionprogramming;

import java.util.List;

public class lamdapratice {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 6, 3, 9, 6);
		// distinct() 중복제거
		System.out.println("distinct 중복제거");
		numbers.stream().distinct().forEach(e -> System.out.print(e + " "));
		// sorted() 정렬
		System.out.println();
		System.out.println("sorted 정렬");
		numbers.stream().sorted().forEach(e -> System.out.print(e + " "));

		// 둘다넣기
		System.out.println();
		numbers.stream().sorted().distinct().forEach(e -> System.out.print(e + " "));

		// map 사용
		// 제곱수 넣기
		System.out.println();
		numbers.stream().distinct().sorted().map(e -> e * e).forEach(e -> System.out.print(e + " "));

		System.out.println();
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));
		List.of("Apple", "Ant", "Bat").stream().map(s -> s.length()).forEach(p -> System.out.println(p));
	}

}
