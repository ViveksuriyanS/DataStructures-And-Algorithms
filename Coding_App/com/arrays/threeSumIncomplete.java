package com.arrays;

public class threeSumIncomplete {

	public static void main(String[] args) {
		int arr[] = new int[] { -1, 0, 1, 2, -1, -4 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
				}
			}
		}
	}

}
