package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListandVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> newlist = List.of("Yak", "Zebra");
//		System.out.println(newlist);
		List<String> name1 = List.of("zero", "lala");
		// ArrayList<String> name2 = new ArrayList<String>(name1);
		ArrayList<String> name2 = new ArrayList<String>();
		name2.add("hero");
		name2.addAll(name1);

		System.out.println(name2);

	}

}
