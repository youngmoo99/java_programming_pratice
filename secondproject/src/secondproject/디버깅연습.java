package secondproject;

public class 디버깅연습 {

	public static void main(String[] args) {
		int[] array = { 5, 4, 3, 2, 1 };
		int max = Integer.MIN_VALUE;
		int twomax = Integer.MIN_VALUE;
		int size = array.length;
		if (size < 2) {
			System.out.println("-1");
		}
		int count = 0;
		for (int i = 1; i < size; i++) {
			if (array[0] == array[i]) {
				count++;
			}
		}
		if (count == size) {
			System.out.println("-1");
		}
		for (int i = 0; i < size; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		for (int i = 0; i < size; i++) {
			if (array[i] == max) {
				array[i] = Integer.MIN_VALUE;
			}
		}

		for (int i = 0; i < size; i++) {
			if (array[i] > twomax) {
				twomax = array[i];
			}
		}
		if (twomax == Integer.MIN_VALUE) {
			System.out.println("-1");
		}

		System.out.println("twomax" + twomax);
	}

}
