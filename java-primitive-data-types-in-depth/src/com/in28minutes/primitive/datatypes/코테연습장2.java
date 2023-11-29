package com.in28minutes.primitive.datatypes;

public class 코테연습장2 {

	public static void main(String[] args) {
		String s = "()";
		System.out.println(s);
		char c = s.charAt(0);
		boolean answer = true;
		if (c == '(') {
			answer = false;
		}
		System.out.println(answer);

	}

}
