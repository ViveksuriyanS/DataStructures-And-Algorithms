package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationReversal {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };
		
		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");
		
		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		
		rotateReversal(a, num);

		System.out.println(Arrays.toString(a));
		
		scan.close();
	}

	private static void rotateReversal(int[] a, int num) {
		reverseArr(a, 0, num - 1);
		reverseArr(a, num, a.length - 1);
		reverseArr(a, 0, a.length - 1);
	}

	private static int[] reverseArr(int[] a, int head, int tail) {
		while (head < tail) {
			int tmp = a[head];
			a[head] = a[tail];
			a[tail] = tmp;
			++head;
			--tail;
		}

		for (int ac : a)
			System.out.println(ac);
		System.out.println("__________");
		return a;
	}

}

// Juggling concept is confusing

