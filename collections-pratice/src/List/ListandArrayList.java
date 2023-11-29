package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListandArrayList {

	public static void main(String[] args) {
		// arraylist는 List.of 사용불가

		List value = List.of("A", 'A', 1, 1.0);

		System.out.println(value);
		System.out.println(value.indexOf(1));

		List<Integer> numbers = List.of(123, 12, 3, 45);

		List<Integer> numberai = new ArrayList<Integer>(numbers);

		Collections.sort(numberai);
		System.out.println(numberai);
	}

}
