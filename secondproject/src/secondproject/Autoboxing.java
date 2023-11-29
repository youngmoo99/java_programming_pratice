package secondproject;

public class Autoboxing {

	public static void main(String[] args) {
		Integer seven = Integer.valueOf(7);
		Integer eight = 8; // 자동으로 해줌 ==> 오토박싱

		// 오토박싱은 valueOf 사용

		System.out.println(seven + " " + eight);

	}

}
