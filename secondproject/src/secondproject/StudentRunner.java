package secondproject;

import java.math.BigDecimal;
import java.util.ArrayList;
public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = { 99, 98, 100 };
		ArrayList<Integer> marksarr = new ArrayList<Integer>();

		Student student = new Student("Minsu", marks);

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
