package secondproject;
import java.util.Arrays;
public class 디버깅연습2 {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int[] array2 = array.clone();

		Arrays.sort(array2);

		// Arrays.sort(array, Collections.reverseOrder());
		System.out.println(array);

	}

}
