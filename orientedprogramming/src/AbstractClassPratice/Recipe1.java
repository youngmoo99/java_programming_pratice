package AbstractClassPratice;

public class Recipe1 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the row materials");
		System.out.println("get the utensils");

	}

	@Override
	void doTheDish() {
		System.out.println("do the dishes");

	}

	@Override
	void cleanup() {
		System.out.println("cleanup");

	}

}
