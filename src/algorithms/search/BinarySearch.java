package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// Static array with 7 elements in sorted array of length 7
		int arrayVals[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Enter the number needs to be search:");
		// Object of scanner
		Scanner scan = new Scanner(System.in);
		// Fetching the number to be searched from the user
		int searchNum = scan.nextInt();
		// Function call to the logic with arguments
		binarySearchLogic(arrayVals, searchNum);
		// Closing the scanner object
		scan.close();
	}

	// function with parameters
	public static void binarySearchLogic(int arr[], int num) {
		System.out.println(Arrays.toString(arr));
		// array size is the total array length - 1 as it starts from 0th index
		int size = arr.length - 1;
		// Checking if the middle number is equal to the number to be found
		if (arr[size / 2] == num) {
			System.out.println("Number is found");
			System.exit(0);
		} else {
			if (num >= arr[(size / 2) + 1]) {
				binarySearchLogic(Arrays.copyOfRange(arr, (size / 2) + 1, size + 1), num);
			} else {
				binarySearchLogic(Arrays.copyOfRange(arr, 0, (size / 2)), num);
			}
		}
	}

}

// Generally works on sorted array
// O(log n) complexity
