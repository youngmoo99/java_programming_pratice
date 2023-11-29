package secondproject;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ManyAPI {

	public static void main(String[] args) {
		// LocalDate 연도 월 일 2000-01-01
		LocalDate now1 = LocalDate.now();

		System.out.println(now1); // 연도-월-일
		System.out.println(now1.getYear());

		// 윤년인지 궁금
		System.out.println(now1.isLeapYear());
		System.out.println(now1.plusDays(200)); // 200일후 날짜
		System.out.println(now1.minusDays(100)); // 100일전

		LocalDate yesterday = LocalDate.of(2023, 10, 25);
		System.out.println(yesterday);
		System.out.println(yesterday.withYear(2022));
		System.out.println(yesterday.withDayOfMonth(3));

		// LocalDateTime
		LocalDateTime now2 = LocalDateTime.now();

		System.out.println(now2); // 시간까지 다나옴


	}

}
