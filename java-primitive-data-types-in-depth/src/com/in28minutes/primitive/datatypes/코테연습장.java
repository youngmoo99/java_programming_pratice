package com.in28minutes.primitive.datatypes;

import java.util.ArrayList;

public class 코테연습장 {

	public static void main(String[] args) {
		ArrayList<Integer> dd = new ArrayList<Integer>();

		String today = "2022.05.19";
		String[] todays = today.split("\\.");
		int[] toto = new int[3];
		for (int i = 0; i < 3; i++) {
			toto[i] = Integer.parseInt(todays[i]); // 연도, 월, 일 정수형 변환
		}

		String[] privacies = { "2021.05.02 A" };
		String[] terms = { "A 6" };
		for (int i = 0; i < privacies.length; i++) { // 날짜반복
			String types = privacies[i].replaceAll("[^A-Z]", "");// 약관종류 확인
			privacies[i] = privacies[i].replaceAll("[A-Z]", ""); // 약관종류 제거
			privacies[i] = privacies[i].replaceAll(" ", ""); // 약관종류 제거
			String[] days = privacies[i].split("\\."); // 연도 월 일 분리
			int[] startday = new int[3];
			int[] endday = new int[3];
			for (int j = 0; j < 3; j++) {
				startday[j] = Integer.parseInt(days[j]); // 연도 월 일 정수형 변환
			}

			int months = 0;
			for (int j = 0; j < terms.length; j++) {
				if (terms[j].contains(types)) {
					String month = terms[j].replaceAll("[^0-9]", ""); // 약관종류 일치 확인
					months = Integer.parseInt(month);
					break;
				}
			}

			endday[0] = startday[0];
			endday[1] = startday[1] + months;
			endday[2] = startday[2] - 1;
			while (endday[1] > 12) {
				endday[0]++;
				endday[1] -= 12;
			}
			System.out.println(endday[0]);
			System.out.println(endday[1]);
			System.out.println(endday[2]);

	}

}
}
