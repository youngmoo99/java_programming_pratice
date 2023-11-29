package enumenum;

enum Season {
	WINTER, SPRING, SUMMER, FALL;
	// 0, 1, 2, 3 번째 순으로 정해짐
}

public class enumwhat {

	public static void main(String[] args) {
		// Season season ="Winter"; //유효한 값이 아니라고뜸
		Season season = Season.WINTER;
		// 열거형으로 허용

		Season season1 = Season.valueOf("WINTER"); // 정확이 일치해야함
		System.out.println(season1);
		System.out.println(season1.name());
		System.out.println(Season.FALL.ordinal()); // FALL순서 3 출력

	}

}
