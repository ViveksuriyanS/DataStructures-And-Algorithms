package Collections.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		// Creating an arrayList
		List<Integer> arrayList0 = new ArrayList<Integer>(); // empty
		List<Integer> arrayList1 = new ArrayList<Integer>(5); // empty with capacity 5 (not size)
		List<Integer> arrayList2 = new ArrayList<Integer>(arrayList1); // copies arrayList1
		Collections.fill(arrayList2, 0);
		System.out.println(arrayList2);
		arrayList2.add(2, 5);
		// --------------------------------------------------------------//
		// Inserting element to the list
		arrayList0.add(1);
		arrayList0.add(2);
		arrayList0.add(4);
		arrayList0.add(5);
		arrayList0.add(6);
		arrayList0.add(6);
		arrayList0.add(6);
		arrayList0.add(6);

		System.out.println("Array Size : " + arrayList0.size());
		arrayList0.add(2, 3);
		System.out.println(arrayList0);

		arrayList1.addAll(arrayList0);
		List<Integer> arrayList3 = new ArrayList<Integer>();// empty
		arrayList3.add(11);
		arrayList3.add(21);

		arrayList1.addAll(2, arrayList3);
		System.out.println("After adding" + arrayList1);
		System.out.println(arrayList3);

		// --------------------------------------------------------------//
		// Removing emement from the list
		arrayList0.remove(Integer.valueOf(6)); // remove integer value object
		System.out.println("Array Size : " + arrayList0.size() + "  " + arrayList0);
		System.out.println("Element removed:" + arrayList0.remove(6)); // remove with index
		System.out.println("Array Size : " + arrayList0.size() + "  " + arrayList0);
		System.out.println(arrayList0.removeAll(Arrays.asList(6)) + " " + arrayList0);
		// [1, 2, 3, 4, 5]
		System.out.println(arrayList0.subList(1, 3)); // [2, 3] subList(Start,End-1)
		System.out.println(arrayList0);

		// --------------------------------------------------------------//
		// Retrieve the element from the list
		// --------------------------------------------------------------//

		System.out.println(arrayList0.get(4)); // Will return the value at that index
		System.out.println(arrayList0.indexOf(5)); // Will return the index of the value

		// Creating an arrayList with capacity (not size)
		List<Integer> arrayListVals = new ArrayList<Integer>(5);

//		arrayListVals.add(3, 4);
		System.out.println(arrayListVals.size());
		System.out.println(arrayListVals);

	}

}

// Implements List Interface and it is based on Array
// Since Array is a fixed sized DS, we prefer ArrayList over Arrays
// ArrayList size is dynamic as it can "grow or shrink"

// NOTE: ArrayList is not synchronized, can use Collections.synchronizedList(new ArrayList());

// Capacity vs Size
// Capacity -> Number of cells allocated while creating array list
// Size -> Number of cells containing data in it