package secondproject;

public class Chamgo2 {

	public static void main(String[] args) {
		String plus = "1" + 2;
		System.out.println(plus); // 12

		String plus2 = 1 + 2 + "3";
		System.out.println(plus2); // 33

		String plus3 = "1" + 2 + 3;
		System.out.println(plus3); // 123 
		
		String str1 = String.join(",", "A", "B", "C", "D");
		System.out.println(str1); // A,B,C,D

		String str2 = str1.replace('A', 'a');
		System.out.println(str2);// a,B,C,D

	}

}
