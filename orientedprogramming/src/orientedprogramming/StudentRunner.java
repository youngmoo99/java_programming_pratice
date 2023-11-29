package orientedprogramming;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("Ranga");
//		student.setEmail("aaa@gmail.com");
//
//		Person person = new Person();
//		person.setName("Ranga");
//		person.setEmail("bbb@gmail.com");
//		person.setPhoneNumber("010-1111-1234");
//
//		String value = person.toString();
//		System.out.println(value);
//		System.out.println(person);

		Employee employee = new Employee("Ranga", "Programmer Analyst");
		employee.setName("Ranga");
		employee.setEmail("bbb@gmail.com");
		employee.setPhoneNumber("010-1111-1234");
		employee.setEmp('A');
		employee.setTitle("Programmer Analyst");

		System.out.print(employee);
	}

}
