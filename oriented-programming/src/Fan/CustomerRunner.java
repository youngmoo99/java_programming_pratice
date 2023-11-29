package Fan;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "Hyderabad", "50035");
		Customer customer = new Customer("박영식", homeAddress);

		Address workAddress = new Address("line 1 for work", "Hyderabad", "50035");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
