package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arrayVals[] = { 5, 4, 3, 2, 1 };
		bubbleSort(arrayVals);
	}

	public static void bubbleSort(int arrVal[]) {
		// Initializing a boolean value with true value for validation
		boolean isSwapDone = true;
		// Looping through the array and also checking the condition whether sorting
		// needs to be done or not.
		for (int i = 0; i < arrVal.length && isSwapDone; i++) {
			// Changing the value as false to check swap is required
			isSwapDone = false;
			System.out.println(Arrays.toString(arrVal));
			// 2nd loop to compare with the values of loop i
			for (int j = 0; j < arrVal.length - i - 1; j++) {
				// If A value is lesser than the next value B, then swap the element in array
				if (arrVal[j] > arrVal[j + 1]) {
					int temp = arrVal[j];
					arrVal[j] = arrVal[j + 1];
					arrVal[j + 1] = temp;
					// Changing flag value as true so that next iteration will proceed
					isSwapDone = true;
				}
			}
			System.out.println(Arrays.toString(arrVal) + "\n_______");
		}
	}

}

// Complexity of the algorithm
// O(n2)
// Slow sorting algorithm
// Comparatively better than Selection sorting

// the algorithm can be improvised by restricting the second loop till the last but element every time the loop runs

// say first time till end arrVal.length-1
// 2nd time arrVal.length-2
// 3nd time arrVal.length-3
// in generic arrVal.length-i-1