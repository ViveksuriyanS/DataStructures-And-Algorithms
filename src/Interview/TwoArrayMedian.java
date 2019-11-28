package Interview;

import java.util.Arrays;

public class TwoArrayMedian {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 4, 5, 8 };
		int array2[] = { 3, 6, 7, 9 };
		int array3[] = { 3, 6, 7, 9, 10 };

		// Median between array1 and array2
		int arr1_arr2[] = new int[array1.length + array2.length];
		arr1_arr2 = merge(array1, array2);
		double median12 = median(arr1_arr2);
		System.out.println("Median is " + median12);

		// Median between array1 and array3
		int arr1_arr3[] = new int[array1.length + array3.length];
		arr1_arr3 = merge(array1, array3);
		double median13 = median(arr1_arr3);
		System.out.println("Median is " + median13);
	}

	private static double median(int[] arr1_arr2) {
		if (arr1_arr2.length % 2 == 0) {
			return arr1_arr2[arr1_arr2.length / 2];
		} else {
			int length = arr1_arr2.length;
			double a = arr1_arr2[length / 2];
			double b = arr1_arr2[(length + 1) / 2];
			double result = (a + b) / 2;

			return result;
		}
	}

	private static int[] merge(int[] array1, int[] array2) {
		int newLength = array1.length + array2.length;
		int arr1_arr2[] = new int[newLength];
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < newLength; i++) {
			// Fill till array1 or array2 is filled
			if (index1 < array1.length && index2 < array2.length) {
				if (array1[index1] < array2[index2]) {
					arr1_arr2[i] = array1[index1];
					index1++;
				} else {
					arr1_arr2[i] = array2[index2];
					index2++;
				}
			}
			// Array 1 is already filled
			else if (index1 < array1.length) {
				arr1_arr2[i] = array1[index1];
				index1++;
			}
			// Fill array 2
			else {
				arr1_arr2[i] = array2[index2];
				index2++;
			}
		}
		System.out.println(Arrays.toString(arr1_arr2));
		return arr1_arr2;
	}

}

// Input A=> {1,2,4,5,8}  B=> {3,6,7,9}
// A+B => {1,2,3,4,5,6,7,8,9} int length = 9  MidValue = A+B[length/2] = 5
// Input A=> {1,2,4,5,8}  B=> {3,6,7,9,10}
// A+B => {1,2,3,4,5,6,7,8,9,10} int length = 10  MidValue = A+B[length/2-1] + A+B[length/2] = 5+6/2 = > 5.5
