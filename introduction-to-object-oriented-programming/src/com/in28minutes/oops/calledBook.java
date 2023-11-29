package com.in28minutes.oops;

public class calledBook {
	// state
	// private int noOfCopies; 오류뜸
	private int noOfCopies;

	public void gocopiese(int noOfCopies) {
		this.noOfCopies = noOfCopies;
		System.out.println("good" + noOfCopies);
	}

	public void increaseBook(int noOfCopies) {
		gocopiese(this.noOfCopies + noOfCopies);
	}

	public void decreaseBook(int noOfCopies) {
		gocopiese(this.noOfCopies - noOfCopies);
	}

	public 
	void firstBook() {
		System.out.println("첫번째 책");
	}

	void secondBook() {
		System.out.println("두번째 책");
	}

	void thirdBook() {
		System.out.println("세번째 책");
	}
}
