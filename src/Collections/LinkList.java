package Collections;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(7);
		list.add(2);
		printElements(list);
		System.out.println();
	}
	
	public static void printElements(LinkedList<Integer> l){
		Iterator<Integer> iter = l.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
