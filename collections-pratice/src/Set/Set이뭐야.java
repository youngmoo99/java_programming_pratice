package Set;

import java.util.HashSet;
import java.util.Set;

public class Set이뭐야 {

	public static void main(String[] args) {
		Set<String> set = Set.of("Apple", "Banana", "Orange");
		// set.add("melon"); set은 기본적으로 변경을 허용하지 않음

		// hashset 사용
		// set 정리 순서가없고 중복 불가 + 일반적인 set으론 추가가 불가 hashset 사용해야함

		Set<String> set2 = new HashSet<String>(set); // 순서가없음
		set2.add("Apple"); // 이미 있어서 추가안됨
		System.out.println(set2);

	}

}
