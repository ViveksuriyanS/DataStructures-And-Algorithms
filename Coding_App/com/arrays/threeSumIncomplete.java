package com.arrays;

import java.util.Arrays;

public class threeSumIncomplete {

	public static void main(String[] args) {
		int arr[] = new int[] { -1, 0, 1, 2, -1, -4 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		checkSum(arr, 2);
	}

	public static void checkSum(int[] inpArr, int sum) {
		int i = 0;
		int j = i + 1;
		int k = inpArr.length - 1;

		for (; i < inpArr.length; i++) {
			int sumX = inpArr[i] + inpArr[j] + inpArr[k];
			if (sumX < sum) {
				j++;
			} else if (sumX > sum) {
				k--;
			} else if (sumX == sum) {
				System.out.println(inpArr[i] + " " + inpArr[j] + " " + inpArr[k]);
				return;
			}
		}
		System.out.println("Match not found");
	}
}
