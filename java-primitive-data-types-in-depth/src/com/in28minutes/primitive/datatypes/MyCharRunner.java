package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('6');
		System.out.println(myChar.isVowel());
		// myChar.isConsonant();

		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());

		myChar.printLowerCaseAlphabets();
		myChar.printUpperCaseAlphabets();
	}

}
