package loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(9);
		boolean isPrime = number.isPrime();
		int sumsum = number.sumUptoN();
		int sumsum2 = number.sumOfDivisors();
		System.out.println("isPrime " + isPrime);
		System.out.println("sum " + sumsum);
		System.out.println("sum2 " + sumsum2);
		number.printNumberTriangle();

	}


}
