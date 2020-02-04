package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int vals[] = { 11, 7, 3, 9, 8, 2, 1, 4, 6, 5 };
		insertsort(vals);
	}

	public static int[] insertsort(int val[]) {
		// we start the comparison from element 1 not from 0
		// Thus splitting the array into two based on 0 to i || i to n

		// Start iterating element one by one from index '1'
		for (int i = 1; i < val.length; i++) {
			System.out.println(val[i]);
			int index = i;
			boolean isSwap = true;
			// Looping in reverse order from i-1 to 0
			// Reverse Bubble sort
			for (int j = i - 1; j >= 0 && isSwap; j--) {
				isSwap = false;
				// Value from unsorted array is more than the value in sorted array, then swap
				if (val[index] < val[j]) {
					int temp = val[j];
					val[j] = val[index];
					val[index] = temp;
					index = j;
					// Skip if no comparison needs to be done
					isSwap = true;
					System.out.println(Arrays.toString(val));
				}
			}
			System.out.println("_____________");
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