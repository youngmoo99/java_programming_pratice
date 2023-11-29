package List;

import java.util.ArrayList;
import java.util.List;

public class 컬렉션 {

	public static void main(String[] args) {

		// List, Set, Queue, Map 
		List<String> words = List.of("Apple", "Bat", "Cat");

		int size = words.size();
		System.out.println(words.isEmpty());
		System.out.println(size);
		System.out.println(words.indexOf("Apple"));

		List<String> wordsArrayList = new ArrayList<String>(words);
		System.out.println(wordsArrayList);
		
		wordsArrayList.add("Dog");
		System.out.println(wordsArrayList);
		
		// 컬렉션 팁
		// 1. Hash
		// hash는 무조건 순서도 없고 정렬도 되어있지 않음

		// 2. Linked
		// 요소들이 서로 연결되어있음
		// 순서는 확실히 유지됨 삽입순서대로 데이터 유지

		// 3. Tree
		// 데이터가 정렬된 형태로 들어감
		// tree는 기본적으로 정렬되어있어서 NavigableSet이나 NavigableMap이 구현이 있을것

	}

}
