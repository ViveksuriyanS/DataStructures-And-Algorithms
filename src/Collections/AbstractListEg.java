package Collections;

import java.util.AbstractList;
import java.util.LinkedList;

public class AbstractListEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractList<Integer> list = new LinkedList<Integer>(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(6);
				add(16);
				add(26);
				add(36);
				
			}
		};
		System.out.println(list);
		list.add(4);
		System.out.println(list);
	}

}

// Implements Collection Interface and AbstractCollection Class
// Used to implement unmodifiable list by having only get method
// Abstract Class is a kind of singleton class