package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executroservice = Executors.newSingleThreadExecutor();

		// 한번에 한개만 스레드 실행 가능
		executroservice.execute(new Task1());
		executroservice.execute(new Thread(new Task2()));

		System.out.print("\nTask3 kicked off");
		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask3 Done");

		executroservice.shutdown();

	}

}
