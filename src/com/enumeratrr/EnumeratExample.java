package com.enumeratrr;

import java.util.LinkedList;
import java.util.ListIterator;

public class EnumeratExample {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		ListIterator<Integer> listIter = list.listIterator(); 
		while(listIter.hasNext()) {
			System.out.println(listIter.next() + "\t" + listIter.nextIndex());
			if(listIter.hasNext() && listIter.next() == 9) {
				listIter.add(10);
			}
		}
		System.out.println();
		while(listIter.hasPrevious()) {
			System.out.println(listIter.previous() + "\t" + listIter.previousIndex());
			if(listIter.hasPrevious() && listIter.previous() == 0) {
				listIter.remove();
			}
		}
	}

}


// ------ Enumerator ------- Can be used by enumerator()
// Used only for legacy collections like Vector and HashTable
// Classic type of enumeration
// Can fetch element only forward directional
// hasMoreElements() .... elements() ..... nextElement()...

// ------ Iterator ------- implemented using iterator()
// It is a universal iterator/enumerator
// Can be used in Set, List, Queue, Dequeue etc.,
// Comes with additional functionality to remove the element using remove()
// Only forward accessing of data


// ------ ListIterator ------ Can be used by listIterator()

// It includes replacement or addition of element into the list while iterating
// It is bidirectional accessing of data
// hasNext()... next()... nextIndex()....
// hasPrevious()... previous().... previousIndex()...
// add().... set()... remove()
// extends Iterator

