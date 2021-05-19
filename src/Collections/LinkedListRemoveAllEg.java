package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListRemoveAllEg {

	public static void main(String[] args) {
		List<String> li = new LinkedList<String>();
		li.add("A");
		li.add("A1");
		li.add("A2");
		li.add("A3");
		li.add("A4");
		li.add("A");
		li.add("A5");
		li.add("A6");

		List<String> lis = new LinkedList<String>();
		lis.add("A");
		
		li.removeAll(lis);
		System.out.println(li);

		ListIterator<String> listIterator= li.listIterator();
		// First to Last
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		// Now listIterator is at last
		// Last to First
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}
}


// RemoveAll() removes all the occurrences of an element in the list
// source.removeAll(Destination);  Source will be altered