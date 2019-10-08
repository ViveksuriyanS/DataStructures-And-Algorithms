package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation2 {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		rotateArrayBetterSolution2(a, num);
		System.out.println(Arrays.toString(a));
		scan.close();
	}

	private static void rotateArrayBetterSolution2(int[] a, int num) {
		// Looping through 0 to rotationalTimes
		for (int i = 0; i < num; i++) {
			// Set the first element of array to temporary variable
			int tmp = a[0];
			// Declaring the variable
			int x;
			// Move values of 'n+1' to 'n' till the arraySize -1
			for (x = 0; x < a.length - 1; x++) {
				a[x] = a[x + 1];
			}
			// Setting the temporary variable value to the last value in array
			a[x] = tmp;
		}
		
		// Note: Printing the result array
		System.out.println("___________");
		for (int ac : a)
			System.out.println(ac);
	}
}

// Time complexity ==> O(ArraySize * rotationalTimes) ==> O(N*T)
// Space Complexity ==> O(Temporary Variable) ==> O(1)
