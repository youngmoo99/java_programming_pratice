package ifandswitch;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// 타입 obj = new 타입(argument);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number1: ");
		int number1 = sc.nextInt();
		System.out.println("The number you entered is - " + number1);

		System.out.println(todays(number1));
	}

	private static String todays(int daynum) {
		String result = "";
		switch (daynum) {
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		default:
			result = "unknown";
		}
		return result;
	}

}
