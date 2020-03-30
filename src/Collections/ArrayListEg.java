package Collections;

import java.util.ArrayList;

public class ArrayListEg {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>(10);
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
		aList.add(6);
		aList.add(7);
		aList.add(8);
		aList.add(9);
		System.out.println(aList.size());
		aList.add(0);
		aList.add(1);
		aList.add(2);
		aList.add(3);
		aList.add(4);
		aList.add(5);
		aList.add(6);
		aList.add(7);
		System.out.println(aList.size());

	}

}
