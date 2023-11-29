package exception;

public class ExceptionRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Ended");
	}
	private static void method1() {
		method2();
		System.out.println("Method1 Ended");
	}

	private static void method2() {
		try {
			// String str = null;
			// str.length(); // 널포인트 익셉션
			int[] arr = { 1, 2 };
			int number = arr[3];
			System.out.println("Method2 Ended ");
		} catch (NullPointerException ex) {
			System.out.println("Matched Null Exception");
			ex.printStackTrace(); // 예외살행이 발생하면 stacktrace출력
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Matched ArrayIndexOut");
			ex.printStackTrace();
		} catch (Exception ex) {
			System.out.println("Matched Exception");
			ex.printStackTrace();
		}

	}

}
