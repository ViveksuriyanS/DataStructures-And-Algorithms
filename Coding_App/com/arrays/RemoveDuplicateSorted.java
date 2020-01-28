package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;

// Write a program to remove duplicate elements from sorted array
// Sample Input: 1 1 2 2 3 3
// Sample Output: 1 2 3

public class RemoveDuplicateSorted {

	public static void main(String[] args) {
		Integer[] inputArr = { 1, 1, 2, 2, 3, 3 };
		int x = 0;
		for (int i = 1; i < inputArr.length; i++) {
			if (inputArr[i] != inputArr[x]) {
				inputArr[++x] = inputArr[i];
			}
		}
		System.out.println(Arrays.toString(inputArr));
		// Since the array cannot be shrunk/modified
		// We are using ArrayList to remove extra repeated elements
		ArrayList<Integer> newList = new ArrayList<Integer>(Arrays.asList(inputArr));

		while (x + 1 < newList.size()) {
			newList.remove(x + 1);
		}

		System.out.println(newList);
		// Dereferencing the inputArr
		inputArr = null;
	}

}
