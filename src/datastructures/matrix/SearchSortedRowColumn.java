package datastructures.matrix;

import java.util.Scanner;

public class SearchSortedRowColumn {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 11, 21, 31, 41 }, { 12, 22, 32, 42 }, { 13, 23, 33, 43 } };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element to be searched");
		int search = scan.nextInt();
		String result = searchElement(arr, search) ? " found" : " not found";
		System.out.println("Element is " + result);

		scan.close();
	}

	public static boolean searchElement(int[][] arr, int element) {
		int row = arr.length;
		int column = arr[0].length;

		int rowIndex = 0;
		int colIndex = column - 1;

		while (colIndex >= 0 && rowIndex < row) {
			if (arr[rowIndex][colIndex] > element) {
				colIndex--;
			} else if (arr[rowIndex][colIndex] < element) {
				rowIndex++;
			} else {
				System.out.println("Element found at index " + rowIndex + "\t" + colIndex);
				return true;
			}
		}

		return false;
	}

}
