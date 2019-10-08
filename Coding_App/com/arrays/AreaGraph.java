package com.arrays;

public class AreaGraph {

	public static void main(String[] args) {
		int arr[] = new int[] { 7, 4, 9, 2, 5, 1, 8, 3 };
		findArea(arr);
	}

	private static void findArea(int[] arr) {
		int maxArea = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				int sum = count * Math.min(arr[i], arr[j]);
				if (sum > maxArea) {
					maxArea = sum;
				}
				count++;
			}
		}
		System.out.println(maxArea + " is the maximum area");
	}

}

//				9				
//				|				8
//		7		|				|
//		|		|				|
//		|		|		5		|
//		|	4	|		|		|
//		|   |	|		|		|	3
//		|	|	|	2	|		|	|
//		|	|	|	|	|	1	|	|
//		|___|___|___|___|___|___|___|
//		0	1	2	3	4	5	6	7
//
//
//		Incremental i * Min(a[i],a[j])
//
//		Iteration 1: 7
//			
//		1*4, 2*7, 3*2, 4*5, 5*1, 6*7, 7*3 ==> Max Value is 42
//		
//		Iteration 2: 4
//		
//		1*4, 2*2, 3*4, 4*1, 5*4, 6*3 ==> Still Max Value is 42
//
//		Iteration 3: 9
// 		
//		1*2 , 2*5 , 3*1 , 4*8 , 5*3  ==> Still Max Value is 42
//
//		Iteration 4: 2
//	
//		1*2 , 2*1 , 3*2 , 4*2  ==> Still Max Value is 42
//
//		Iteration 5: 5
//	
//		1*1 , 2*5 , 3*3  ==> Still Max Value is 42 
//
//		Iteration 6: 1
//	
//		1*1 , 2*1  ==> Still Max Value is 42 
//
//		Iteration 7: 8
//	
//		1*3   ==> Still Max Value is 42
