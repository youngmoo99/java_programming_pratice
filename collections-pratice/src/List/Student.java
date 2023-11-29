package List;

import java.util.Comparator;

class DescendingStudent implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {

		return Integer.compare(this.id, o.id);
		// return Integer.compare(o.id, this.id); //정렬순서 반대
	}

}
