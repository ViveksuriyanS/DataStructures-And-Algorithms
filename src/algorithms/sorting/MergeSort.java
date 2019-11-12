package algorithms.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int vals[] = { 7, 3, 9, 8, 2, 1, 4, 6, 5 };
		mergeSort(vals, 0, vals.length - 1);
	}

	private static void mergeSort(int[] array, int low, int high) {
		if (array.length < 2) {
			return;
		}
		mergeSort(array, low, high / 2);
		mergeSort(array, (high / 2) + 1, high);
		mergeSubArray();
	}

	private static void mergeSubArray() {
		// TODO Auto-generated method stub

	}

}
