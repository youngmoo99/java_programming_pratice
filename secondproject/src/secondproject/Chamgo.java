package secondproject;

public class Chamgo {

	public static void main(String[] args) {
		String str = "Test";
		char c = str.charAt(0);
		System.out.println(c);

		String bigger = "This is a lot of text";
		String smaller = bigger.substring(5); // 5번째부터 끝까지
		System.out.println(smaller);
		String middle = bigger.substring(5, 10); // 5부터 9까지
		System.out.println(middle);

		int index = bigger.indexOf("lot");
		System.out.println(index); // lot의 첫번째인 l자리 출력

		int last_index = bigger.lastIndexOf('i'); // 마지막번째의 i
		System.out.println(last_index);

		boolean with = bigger.startsWith("This"); // This로 시작하는지 확인
		System.out.println(with);

		boolean with1 = bigger.startsWith("asd");
		System.out.println(with1);

		boolean with2 = bigger.startsWith("text");
		System.out.println(with2);

		boolean with3 = bigger.endsWith("text");
		System.out.println(with3);

		boolean with4 = bigger.endsWith("xt");
		System.out.println(with4);

		String gogo = "   hello guys   "; // 공백 제거
		String trimgo = gogo.trim();
		System.out.println(trimgo);
	}

}
