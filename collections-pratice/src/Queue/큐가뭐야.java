package Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class 큐가뭐야 {

	public static void main(String[] args) {
		// 큐는 컬렉션의 연장이라 모든 컬렉션들의 메소드 지원가능

		Queue<String> queue = new PriorityQueue<String>(); // 영화관 줄서는것처럼 먼저넣은걸 뺴면 먼저빠짐

		System.out.println(queue.poll());
		System.out.println(queue.offer("Apple"));
		queue.addAll(List.of("Zebra", "Monkey", "Tiger"));
		System.out.println(queue);
		System.out.println(queue.poll());

		System.out.println(queue);
	}

}
