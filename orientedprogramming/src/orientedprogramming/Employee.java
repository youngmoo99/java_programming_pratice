package orientedprogramming;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char emp;

	public Employee(String name, String title) {
		// super();
		super(name);
		this.title = title;
		System.out.println("Employee Constructor");
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public char getEmp() {
		return emp;
	}

	public void setEmp(char emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return super.toString() + "#" + title + "#" + employerName + "#" + emp;
	}

}
