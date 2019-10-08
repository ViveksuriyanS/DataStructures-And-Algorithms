package Collections;

import java.util.LinkedList;
import java.util.List;

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
	}
}


// RemoveAll() removes all the occurrences of an element in the list
// source.removeAll(Destination);  Source will be altered