package algorithms.sorting;

import java.util.Arrays;

public class SelectionSort {

	// To get the minimum value index to swap
	static int destIndex;

	public static void main(String[] args) {
		int arr[] = { 6, 4, 9, 2, 1, 4, 7 };
		
		// Looping through all the index from 0th to nth index
		for (int i = 0; i < arr.length - 1; i++) {
			
			// Setting i'th element as minimum value to variable min
			int min = arr[i];
			// Iterate from i'th+1 element till last element
			for (int j = i + 1; j < arr.length; j++) {
//				System.out.println(i + "    " + j);
				
				// Compare j'th element value is minimum than var min
				if (min > arr[j]) {
					// then set the j'th element as new min variable value
					min = arr[j];
					destIndex = j;
				}
			}
//			System.out.println("Min value " + min);
//			System.out.println(Arrays.toString(arr));
			if (arr[i] != min) {
				int temp = arr[i];
				arr[i] = min;
				arr[destIndex] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}

// Complexity of the algorithm
// O(n2)
// Slow sorting algorithm