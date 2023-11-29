package class종류;

class DefaultClass {

}

public class NestedClassRunner {

	class InnerClass {
		// 이너클래스는 STATIC이 없는 내부클래스
	}

	static class StaticNestedClass {
		// static
	}
	public static void main(String[] args) {
		// InnerClass innerclass = new InnerClass(); 인스턴스 생성 불가
		StaticNestedClass staticne = new StaticNestedClass();

		NestedClassRunner nestedclass = new NestedClassRunner();
		InnerClass innerclass = nestedclass.new InnerClass(); // new로 감싸야함

	}

}
