package algorithms.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int vals[] = { 7, 3, 9, 8, 2, 1, 4, 6, 5 };
		mergeSort(vals, 0, vals.length - 1);
	}

	private static void mergeSort(int[] array, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			mergeSort(array, low, mid);
			mergeSort(array, mid + 1, high);
			mergeSubArray(array, low, mid, high);
		}
	}

	private static void mergeSubArray(int[] array, int low, int mid, int high) {
		int leftLength = mid - low + 1;
		int rightLength = high - mid;
		int leftArr[] = new int[leftLength];
		int rightArr[] = new int[rightLength];

		// Copy data to temp Array
		for (int i = 0; i < leftLength; i++) {
			leftArr[i] = array[i + low];
		}
		for (int i = 0; i < rightLength; i++) {
			rightArr[i] = array[i + mid + 1];
		}

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = low;
		while (i < leftLength && j < rightLength) {
			if (leftArr[i] <= rightArr[j]) {
				array[k] = leftArr[i];
				i++;
			} else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < leftLength) {
			array[k] = leftArr[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < rightLength) {
			array[k] = rightArr[j];
			j++;
			k++;
		}
	}

}
