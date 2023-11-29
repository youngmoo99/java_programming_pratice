package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		calledBook book1 = new calledBook();
		calledBook book2 = new calledBook();
		calledBook book3 = new calledBook();

		book1.firstBook();
		book2.secondBook();
		book3.thirdBook();

		book1.gocopiese(200);
		book1.increaseBook(5);
		book1.decreaseBook(2);

	}

}
