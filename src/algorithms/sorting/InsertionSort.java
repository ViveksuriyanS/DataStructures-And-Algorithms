package algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int vals[] = { 7, 3, 9, 8, 2, 1, 4, 6, 5 };
		insertsort(vals);
	}

	public static int[] insertsort(int val[]) {
		// we start the comparison from element 1 not from 0
		// Thus splitting the array into two based on 0 to i || i to n

		for (int i = 1; i < val.length; i++) {
			System.out.println(i);
			int index = i;
			// Looping in reverse order from i-1 to 0
			// Reverse Bubble sort
			for (int j = i - 1; j >= 0; j--) {
				if (val[index] < val[j]) {
					int temp = val[j];
					val[j] = val[index];
					val[index] = temp;
					index = j;
				}
				System.out.println(Arrays.toString(val));
			}
		}

		return null;
	}

}

// Best case -> Omega O(n)
// Worst case -> Big O O(n2)
// Avg. case -> Theta O(n2)
// Better comparable to Selection Sort and Bubble sort