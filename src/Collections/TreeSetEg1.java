package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg1 {

	public static void main(String[] args) {
		TreeSet<String> dict = new TreeSet<String>();
		dict.add("Apple");
		dict.add("Banana");
		dict.add("Baloon");
		dict.add("apple");
		dict.add("Baloon");
		Iterator<String> iter = dict.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}

// While trying to add element in TreeSet, it adds element in ascending order
// Since we are implementing Set, it doesn't allow duplicate element	