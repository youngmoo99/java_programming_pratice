package AbstractClassPratice;

public class Recipe2 extends AbstractRecipe {

	@Override
	void getReady() {
		System.out.println("Get the row materials");
		System.out.println("Switch the utensils");

	}

	@Override
	void doTheDish() {
		System.out.println("get stuff ready");
		System.out.println("Put it the dish");
	}

	@Override
	void cleanup() {
		System.out.println("cleanup");
		System.out.println("Switch off the utensils");

	}

}
