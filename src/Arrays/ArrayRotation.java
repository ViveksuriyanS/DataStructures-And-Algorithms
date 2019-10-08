package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();

		// Looping through the array n number of times
		for (int i = 1; i <= num; i++) {
			// For each rotation calling rotate function
			a = rotateArray(a);
		}

		System.out.println(Arrays.toString(a));

		scan.close();
	}

	public static int[] rotateArray(int[] arr) {
		// Creating a temporary array of same length
		int[] tmp = new int[arr.length];

		// Storing the values of array by cloning the array
		tmp = arr.clone();

		// Looping through the array
		for (int i = 0; i < tmp.length; i++) {

			// Storing the value of array 'arr' from 'tmp'

			// Storing the next value of 'tmp' array to 'arr'
			// arr[0] = tmp[1]
			// arr[1] = tmp[2]
			// ...
			// arr[n] = tmp[n+1]
			// if the size n is 10, then n+1 => 11 will throw exception, so % with length
			// For modulus operator refer /DataStructure/src/Interview/Modulus.java
			arr[i] = tmp[(i + 1) % arr.length];
		}

		return arr;
	}

}

// Juggling concept is confusing
