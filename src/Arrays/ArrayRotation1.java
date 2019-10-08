package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation1 {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		rotateArrayBetterSolution1(a, num);
		System.out.println(Arrays.toString(a));

		scan.close();
	}

	private static void rotateArrayBetterSolution1(int[] a, int num) {
		// Using temporary array to store the elements from 0 to num
		int temp[] = new int[num];

		// Stores the value of array from 0 to num
		System.out.println("___________");
		for (int i = 0; i < num; i++) {
			temp[i] = a[i];
		}
		
		// Note: printing the stored elements
		for (int ac : temp)
			System.out.println(ac);
		System.out.println("___________");
		
		// Move elements of array from num to arr.length ---> new array 0 to arr.length - num
		int index = 0;
		for (int j = num; j < a.length; j++) {
			a[index] = a[j];
			index++;
		}
		
		// Note: Prints the value of new array
		for (int ac : a)
			System.out.println(ac);
		System.out.println("___________");
		
		// Append values from temporary array to the resultant array
		for (int d = 0; d < temp.length; d++) {
			a[index] = temp[d];
			index++;
		}
		
		// Note: Prints the value of result array
		for (int ac : a)
			System.out.println(ac);
		System.out.println("___________");
	}
}

// Time Complexity O(ArrayLength) ==> O(N)
// Space Complexity O(NumberOfRotation) ==> O(R)
