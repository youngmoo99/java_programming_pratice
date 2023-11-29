package Generic;

import java.util.ArrayList;

public class MyCustomList<T> { // 제네릭 T

	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	public T get(int index) {
		return list.get(index);
	}

	@Override
	public String toString() {
		return "MyCustomList [list=" + list + "]";
	}

}
