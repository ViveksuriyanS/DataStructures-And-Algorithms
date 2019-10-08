package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation3 {

	public static void main(String[] args) {
		// Initializing the array with values in sorted order
		int a[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22 };

		// Scanner object creation
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter how many times the array needs to be rotated");

		// Scanning the input from user that how many times array needs to be rotated
		int num = scan.nextInt();
		rorateArrayJugglingSolution(a, num);
		System.out.println(Arrays.toString(a));

		scan.close();
	}

	private static void rorateArrayJugglingSolution(int[] arr, int d) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int i, j, k, temp;
		// Loop GCD(d,n) times
		// arr-> 12 and d -> 3
		// i -> 0,1,2,3
		for (i = 0; i < findGCD(d, n); i++) {
			/* move i-th values of blocks */
			// temp => 0 - 11 && 1 - 12 && 2 - 13 && 3 - 14
			temp = arr[i];
			// j -> 0,1,2,3
			j = i;
			// explaining for j = 0
			while (true) {
				// 1 iter ---> k = 3 (0+3)
				// 2 iter ---> k = 6 (3+3)
				// 3 iter ---> k = 9 (6+3)
				// 4 iter ---> k = 12 (9+3)
				k = j + d;
				// 1 iter ---> 3 >= 12
				// 2 iter ---> 6 >= 12
				// 3 iter ---> 9 >= 12
				// 4 iter ---> 12 >= 12
				if (k >= n)
					// 4 iter ---> k = 0 (12-12) 
					k = k - n;
				// 1 iter ---> 3 == 0
				// 2 iter ---> 6 == 0
				// 3 iter ---> 9 == 0 
				// 4 iter ---> 0 == 0
				if (k == i)
					// 4 iter ---> out of while loop
					break;
				// 1 iter ---> arr[0] = arr[3]
				// 2 iter ---> arr[3] = arr[6]
				// 3 iter ---> arr[6] = arr[9]
				arr[j] = arr[k];
				// 1 iter ---> j = 3
				// 2 iter ---> j = 6
				// 3 iter ---> j = 9
				j = k;
			}
			// Inside the loop arr[0], arr[3] and arr[6] are only set arr[9] is set outside
			// 4 iter exit ---> arr[9] = temp
			arr[j] = temp;
		}
	}

	// Finding the GCD on the arraySize and the rotationalTimes
	// numOfRotation ==> A
	// inpLength ==> B
	// y ==> c
	private static int findGCD(int numOfRotation, int inpLength) {
		if (inpLength == 0) {
			return numOfRotation;
		} else {
			int x = inpLength;
			int y = numOfRotation % inpLength;
			return findGCD(x, y);
		}
	}
}

// Juggling concept is confusing
