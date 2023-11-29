package secondproject;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String daymost = "";
		for (String day : daysOfWeek) {
			if (day.length() > daymost.length()) {
				daymost = day;
			}
		}
		System.out.println(daymost);

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
	}

}
