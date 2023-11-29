package ifandswitch;

public class ifrunner {

	public static void main(String[] args) {
		int i = 26;

		if (i == 25) {
			System.out.println("i = 25");
		} else {
			System.out.println("i != 25");
		}

		puzzle1();
	}

	private static void puzzle1() {
		int k = 15;
		if (k > 20) {
			System.out.println(1);
		} else if (k > 10) {
			System.out.println(2);
		} else if (k < 20) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}

	}

}
