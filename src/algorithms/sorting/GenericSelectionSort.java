package algorithms.sorting;

import java.util.Arrays;

public class GenericSelectionSort {
	public static void main(String args[]) {
		sort(new String[] { "Vivek", "Apple", "Cat", "Abble", "Aable" });
	}

	public static void sort(Comparable[] array) {
		int maxindex = 0;
		for (int k = 0; k < array.length; k++) { // 0,1,2,3
			maxindex = findMax(array, k); // 4-0
			if (maxindex > k)
				swap(array, k, maxindex);
			System.out.println(Arrays.toString(array));
		}
	}

	public static int findMax(Comparable[] array, int startIndex) {
		Comparable max = array[startIndex];
		int maxindex = 0;
		for (int i = startIndex; i < array.length; i++) {
			if (max.compareTo(array[i]) < 0) {
				max = array[i];
				maxindex = i;
			}
		}
		return maxindex;
	}

	public static void swap(Object[] array, int a, int b) {
		Object save = array[b];
		array[b] = array[a];
		array[a] = save;
	}
}

// https://stackoverflow.com/questions/40160839/what-is-comparable-in-java