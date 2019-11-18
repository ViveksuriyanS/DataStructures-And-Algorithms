package algorithms.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int vals[] = { 7, 3, 9, 8, 2, 1, 4, 6, 5 };
		quicksort(vals, 0, vals.length - 1);
	}

	private static void quicksort(int[] vals, int low, int high) {
		// Pivot index can be taken as any value
		int pivotIndex;
		if (low < high) {
			pivotIndex = partition(vals, low, high);
			
			quicksort(vals, low, pivotIndex - 1);
			quicksort(vals, pivotIndex, high);
		}

	}

	// Partition is done
	private static int partition(int[] vals, int startIndex, int endIndex) {
		// Pivot Value can be any value, here we are taking the last index value
		int pivotVal = vals[endIndex];
		int pivotInd = startIndex;
		System.out.println("Pivot Value: " + pivotVal);
		System.out.println(Arrays.toString(vals));
		int i = startIndex;
		// Sort the values that are lower that pivot value to the left side
		// And the value higher than pivot value to the right side
		for (; i < endIndex; i++) {
			if (vals[i] < pivotVal) {
				int temp = vals[i];
				vals[i] = vals[pivotInd];
				vals[pivotInd] = temp;
				pivotInd++;
			}
			System.out.println(Arrays.toString(vals));
		}
		int temp1 = vals[i];
		vals[i] = vals[pivotInd];
		vals[pivotInd] = temp1;

		System.out.println(Arrays.toString(vals));
		System.out.println("Pivot Index :" + pivotInd);
		System.out.println("__________________");
		return pivotInd;

	}
}

// Unlike Merge Sort, it is IN-PLACE sorting technique. So it doen't need extra space
// O(nlogn) -> Time complexity on Best and Average case scenario
// O(n^2) -> Worst Case (can be avoided by making pivot element at random place)