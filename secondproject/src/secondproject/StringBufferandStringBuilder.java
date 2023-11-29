package secondproject;

public class StringBufferandStringBuilder {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Test");

		sb.append(" 123");

		System.out.println(sb);

		sb.setCharAt(0, 't');

		System.out.println(sb);
		// 스트링버퍼는 동기화, 스레드에 안전 두개의 스레드가 동시에 액세스 불가능
		// 스트링빌더는 비동기화, 스레드에 불안전, 두개이상의 스레드가 동시에 액세스 가능

		// 스트링빌더
		StringBuilder sbb = new StringBuilder("hello");

		sbb.append(" guys");
		System.out.println(sbb);

	}

}
