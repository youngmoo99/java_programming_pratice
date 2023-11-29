package secondproject;

public class WrapperClasses {

	public static void main(String[] args) {
		// int 만 Wrapper 클래스는 Integer
		// char도 Character
		// 나머진 모두 첫글자만 대문자

		// valueOf()를 사용하여 Wrapper 객체를 생성하면 JVM은
		// 메모리에 동일한 값을가진 Wrapper객체가 이미있는지 확인
		// 있는경우 valueOf() 메서드는 해당 객체를 반환함
		// new는 매번 새 객체를 생성하지만 valueOf()는 동일한 값을 가진
		// 기존객체를 재사용
		Integer i1 = new Integer(5);

		Integer i2 = Integer.valueOf(5);
		Integer i3 = Integer.valueOf(5);
		System.out.println(i1);

		boolean what = i1 == i2;
		boolean what2 = i2 == i3;

		System.out.println(what); // false
		System.out.println(what2); // true

	}

}
