package InterfacePratice2;

public class Project {

	public static void main(String[] args) {
		// ComplexAlgorithm algorithm = new DummyAlgorithm();
		ComplexAlgorithm algorithm = new RealAlgorithm();
		int num1 = algorithm.complexAlgorithm(10, 20);
		
		System.out.println(num1);

	}

}
