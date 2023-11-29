package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awersome occasion. This has never happend before.";

		Map<String, Integer> occurances = new HashMap<String, Integer>();
		String[] words = str.split(" ");

		for (String word : words) {
			Integer integer = occurances.get(word);
			if (integer == null) {
				occurances.put(word, 1);
			} else {
				occurances.put(word, integer + 1);
			}
		}
		System.out.println(occurances);

		TreeMap<String, Integer> treemap = new TreeMap<String, Integer>();
		treemap.put("A", 4);
		treemap.put("a", 3);
		treemap.put("B", 55);
		System.out.println(treemap);

//		Map<Character, Integer> occurances = new HashMap<Character, Integer>();
//		char[] chars = str.toCharArray();
//		for (int i = 0; i < str.length(); i++) {
//			Integer integer = occurances.get(chars[i]);
//			if (integer == null) {
//				occurances.put(chars[i], 1);
//			} else {
//				occurances.put(chars[i], integer + 1);
//			}
//		}
//		System.out.println(occurances);
	}

}
