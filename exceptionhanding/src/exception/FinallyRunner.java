package exception;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] numbers = { 12, 3, 4, 5 };
			int number = numbers[5];

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Before Scanner Close");
			if (sc != null) {
				sc.close();
			}

		}

		System.out.println("Just before closing out main");

	}

}
