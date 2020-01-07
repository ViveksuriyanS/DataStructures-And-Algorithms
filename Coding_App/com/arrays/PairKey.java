package com.arrays;

import java.util.HashMap;
import java.util.Map;

public class PairKey {

	public static void main(String[] args) {
		int arr[] = new int[] { 7, 4, 9, 2, 5, 1, 8, 3 };
		int sum = 11;

		findPair(arr, sum);
	}

	private static void findPair(int[] arr, int sum) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> keyMap = new HashMap<Integer, Integer>();
		for (int x : arr) {
			int y = sum - x;
			if (keyMap.get(x) == null) {
				keyMap.put(y, x);
			} else {
				System.out.println(y + " and " + x + " are the pairs");
			}
		}
	}

}
