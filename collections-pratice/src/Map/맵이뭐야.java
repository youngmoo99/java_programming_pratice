package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class 맵이뭐야 {

	public static void main(String[] args) {
		// 키값 -밸류값 형태 
		//맵 인터페이스 구현 4가지  HasMap, Hashtable, LinkedHashMap, TreeMap
		Map<String, Integer> map1 = Map.of("A",3,"B",5);
		// of를 쓰면 데이터 변경 불가능
		System.out.println(map1.get("A")); // VLAUE값 출력
		System.out.println(map1.size());
		System.out.println(map1.keySet()); // 키값만 전체 출력
		System.out.println(map1.values()); // 밸류값 전체 출력

		Map<String, Integer> map2 = new HashMap<>(map1); // 정렬순서 삽입순서 없음
		map2.put("C", 4);
		System.out.println(map2);
		
		LinkedHashMap<String, Integer> map3 = new LinkedHashMap<String, Integer>(); // 삽입순서 있음

		map3.put("F", 25);
		map3.put("D", 22);
		System.out.println(map3); // 먼저넣은 F부터 출력

		TreeMap<String, Integer> map4 = new TreeMap<String, Integer>(); // 정렬순서 있음
		map4.put("X", 9);
		map4.put("A", 33);
		map4.put("R", 4);

		System.out.println(map4); // A부터 출력

	}

}
