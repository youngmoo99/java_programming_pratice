package secondproject;

import java.math.BigDecimal;
public class StudentRunner2 {

	public static void main(String[] args) {


		Student2 student = new Student2("YoungSik", 97, 98, 100);

		int number = student.getNumberOfMarks();
		int sum = student.getTotalSumOfMarks();
		int max = student.getMaxMark();
		int min = student.getMinMark();

		System.out.println("number of marks : " + number);
		System.out.println("sum of marks : " + sum);
		System.out.println("max of marks : " + max);
		System.out.println("min of marks : " + min);

		BigDecimal average = student.getAverageMarks();

		System.out.println("avg of marks : " + average);

	}

}
