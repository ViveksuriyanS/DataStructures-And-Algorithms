package Interview;

import java.util.Scanner;

public class Kandanes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i] = scan.nextInt();
		}
		
		int maxContinuousSubarraySum = KandanesOut(arr);
		
		System.out.println("The maximum contiguous sum in sub array is "+ maxContinuousSubarraySum);
		scan.close();
	}

	public static int KandanesOut(int[] input) {
		int max_val = 0;
		int tempMax = 0;
		
		for(int element : input) {
			tempMax = tempMax + element;
			
			if(tempMax < 0) 
				tempMax = 0;
			if(max_val < tempMax)
				max_val = tempMax;
		}
		
		return max_val;
		
	}
}


// Highest positive integral sum 
// Keep adding the value until you find a non-negative integer
// Once found set the base variable to 0