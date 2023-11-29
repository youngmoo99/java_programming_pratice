package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setpratice {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>(); // 삽입순서나 정렬순서가 없음 중복 x
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(1); // 중복이라 추가 x

		System.out.println("hashset" + numbers);

		Set<Integer> numbers2 = new LinkedHashSet<>(); // 삽입 순서있음 정렬 순서 없음 중복 x
		numbers2.add(1);
		numbers2.add(2);
		numbers2.add(3);
		numbers2.add(1);

		System.out.println("linked hasetset" + numbers2);

		Set<Integer> numbers3 = new TreeSet<>(); // 정렬 순서 있음 삽입순서가 없음
		numbers3.add(1);
		numbers3.add(2);
		numbers3.add(3);
		numbers3.add(1);

		System.out.println("TREEset" + numbers3);

	}

}
