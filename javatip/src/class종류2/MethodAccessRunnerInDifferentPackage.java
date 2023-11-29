package class종류2;

import class종류.ExampleClass;

public class MethodAccessRunnerInDifferentPackage {

	public static void main(String[] args) {
		ExampleClass emample1 = new ExampleClass();
		// emample1.privateMehtod(); //같은 패키지 안에서 private빼고는 모든것들에 접근이 가능
		// private는 특정클래스 안에섬나 사용가능

		// emample1.protectedMehtod(); //다른패키지에서 접근 불가능
		// 즉 protected는 같은패키지나 자식클래스에 존재하는것만 접근이 가능

		// emample1.defaultMehtod();
		// default메소드는 그 클래스와 패키지 안에서만 가능

		emample1.publicMethod(); // public만 다른패키지에서 접근이 가능하다

		//
	}

}
