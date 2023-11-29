package Set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> chara = List.of('A', 'C', 'E', 'D', 'A');

		Set<Character> treeSet = new TreeSet<>(chara); // 크기순 정렬 a는중복이라 삭제
		System.out.println(treeSet);

		TreeSet<Integer> numbers = new TreeSet<Integer>(Set.of(65, 54, 34, 12, 99));
		System.out.println(numbers);

		System.out.println(numbers.floor(34)); // floor 34 이하 반환
		System.out.println(numbers.lower(34)); // lower 34미만 반환
		System.out.println(numbers.ceiling(34)); // celing 34이상 반환
		System.out.println(numbers.higher(34)); // higher 34초과 반환
		System.out.println(numbers.subSet(20, 80)); // 20과 80사이 숫자들 반환
	}

}
