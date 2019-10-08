package algorithms.search;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// arrayVals = new int[7];
		int arrayVals[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("Enter the number needs to be search:");
		Scanner scan = new Scanner(System.in);
		int searchNum = scan.nextInt();
		int flag = 0;
		for (int i = 0; i < arrayVals.length; i++) {
			if (arrayVals[i] == searchNum) {
				System.out.println("\n" + searchNum + " is found at the index " + i);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("\nThe number that you have entered is not there in the list");
		}

		System.out.println(searchArr(5, arrayVals));

		scan.close();
	}

	
	//effective linear search
	public static int searchArr(int search, int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				return i;
			}
		}

		return -1;
	}
}

// Linear search generally used for unsorted array
// The complexity of the algorithm is O(n)
