package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));

		List<Student> studentsAl = new ArrayList<Student>(students);

		Collections.sort(studentsAl); // student 정렬해줘야해서 인터페이스 구현

		System.out.println("ASC" + studentsAl);

		Collections.sort(studentsAl, new DescendingStudent());
		System.out.println("Descending " + studentsAl);

	}

}
