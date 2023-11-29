package secondproject;

import java.util.Arrays;

public class ListAndArrayList {

	public static void main(String[] args) {
		int list[] = new int[3];
		list[0] = 1;
		System.out.println(list);
		System.out.println(Arrays.toString(list));

		// 배열 디폴트값 주는법
		int marks[] = new int[5];
		Arrays.fill(marks, 100);
		System.out.println(Arrays.toString(marks));
	}

}
