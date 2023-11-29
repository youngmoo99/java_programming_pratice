package class종류;

public class MethodAccessRunner {

	public static void main(String[] args) {
		ExampleClass emample1 = new ExampleClass();
		// emample1.privateMehtod(); //같은 패키지 안에서 private빼고는 모든것들에 접근이 가능
		emample1.protectedMehtod();
		emample1.defaultMehtod();
		emample1.publicMethod();

	}

}
