package AbstractClassPratice;

public abstract class AbstractRecipe {

	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}

	abstract void getReady();

	abstract void doTheDish();

	abstract void cleanup();
	// prepare
	// 필요한 것들을 가져옴

	// recipe

	// cleanup
}
