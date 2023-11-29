package Thread;

public class 스레드 {

	public static void main(String[] args) {
		// runnable 인터페이스 -> 스레드에 의해 실행될 수 있는 클래스를 생성
		// 즉 실행될 준비는 되어있지만 현재 실행되고 있지 않은 상태
		// Thread 클래스 or Runnable 인터페이스 사용 단점
		// 1) 스레드 실행을 자세히 제어할 수 없음
		// 2) 다수의 스레드를 관리할때 유지 어려움
		// 3) 서브 태스크에서 결과를 받을 방법이 없음

		// 자바 스레드 우선순위 범위는 1 to 10
		// join() 메서드 -> 다른 스레드가 완료될 때까지 스레드가 대기할수 있게 함

		// ExecutorService.newSingleThreadExecutor()
		// -> 단 하나의 스레드로 ExecutorService 를 생성하는데 사용하는 메서드

		// ExecutorService.newFixedThreadPool()
		// -> 지정된 개수의 스레드로 스레드 풀을 만드는데 사용되는 메서드

		// Callable<T> -> 결과를 리턴하는 서브 태스크를 생성하기위해 사용하는 인터페이스
		// invokeAny() -> Callable 태스크 컬렉션으로부터 가장 빠른 완성된 태스크의 결과를 기다리는데
		// 사용할 수 있는 ExecutorService의 메서드

	}

}
