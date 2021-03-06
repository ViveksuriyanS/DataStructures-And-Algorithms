package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int vals[] = { 11, 7, 3, 9, 8, 2, 1, 4, 6, 5 };
		insertsort(vals);
	}

	public static int[] insertsort(int val[]) {
		// we start the comparison from element 1 not from 0
		// Thus splitting the array into two based on 0 to i (Sorted) || i to n
		// (Unsorted)

		int i, j, insertVal;
		// Start iterating element one by one from index '1'
		for (i = 1; i < val.length; i++) {

			// Setting the value to be checked in a variable
			insertVal = val[i];

			// Looping in reverse order from i-1 to 0
			// Also having a condition to check if the insertValue is less than the j'th element in sorted sub array
			for (j = i - 1; j >= 0 && (val[j] > insertVal); --j) {

				// Check if the value to be inserted is lesser than the last node of sorted
				// array

				// Eg. 8 11 12 | '10' 9 -> insertVal = 10 and j-> 2 , i -> 3

				// Shift value by one place to create a space for insertion
				val[j + 1] = val[j]; // Repeat till condition fails
				// Eg. 8 11 12 | 12 9 -> insertVal = 10 and j-> 2 , i -> 3
				// Eg. 8 11 11 | 12 9 -> insertVal = 10 and j-> 1 , i -> 3
				// Eg. 8 11 11 | 12 9 -> insertVal = 10 and j-> 0 , i -> 3 (Condition fail)

			}
			val[j + 1] = insertVal;
			System.out.println(Arrays.toString(val));
		}

		return null;
	}

}

// Best case -> Omega O(n)
// Worst case -> Big O O(n2)
// Avg. case -> Theta O(n2)
// Better comparable to Selection Sort and Bubble sort

// Vals  -> 5 4 3 2 1
// Index -> 0 1 2 3 4

// Iteration 1  -> Index = 1
// (4)
//  5 |  4 3 2 1  =>  5 | (4) 3 2 1
//  (5 > 4) | 3 2 1  =>  4 5 | 3 2 1

//Iteration 2  -> Index = 2
// (3)
// 4 5 | 3 2 1 =>  4 5 | (3) 2 1 

// ---  4 (5 > 3) | 2 1  =>  4 3 5 | 2 1
// ---  (4 > 3) 5 | 2 1  =>  3 4 5 | 2 1

//Iteration 3  -> Index = 3
// (2)
// 3 4 5 | 2 1
// --- 3 4 (5 > 2) | 1 => 3 4 2 5 | 1
// --- 3 (4 > 2) 5 | 1 => 3 2 4 5 | 1
// --- (3 > 2) 4 5 | 1 => 2 3 4 5 | 1

//Iteration 4  -> Index = 4
// (1)
// --- 2 3 4 (5 > 1) | => 2 3 4 1 5 |
// --- 2 3 (4 > 1) 5 | => 2 3 1 4 5 |
// --- 2 (3 > 1) 4 5 | => 2 1 3 4 5 |
// --- (2 > 1) 3 4 5 | => 1 2 3 4 5 | 