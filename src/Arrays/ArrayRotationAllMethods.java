package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationAllMethods {

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

		rotateArrayBetterSolution1(a, num);
		rotateArrayBetterSolution2(a, num);
		rorateArrayJugglingSolution(a, num);
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

	private static void rorateArrayJugglingSolution(int[] arr, int d) {
		// TODO Auto-generated method stub
		int n = arr.length;
		int i, j, k, temp;
		for (i = 0; i < findGCD(d, n); i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (true) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		System.out.println("___________");
		for (int ac : arr)
			System.out.println(ac);

	}

	private static int findGCD(int numOfRotation, int inpLength) {
		if (inpLength == 0) {
			return numOfRotation;
		} else {
			return findGCD(inpLength, numOfRotation % inpLength);
		}
	}

	private static void rotateArrayBetterSolution2(int[] a, int num) {
		for (int i = 0; i < num; i++) {
			int tmp = a[0];
			int x;
			for (x = 0; x < a.length - 1; x++) {
				a[x] = a[x + 1];
			}
			a[x] = tmp;
		}
		System.out.println("___________");
		for (int ac : a)
			System.out.println(ac);

	}

	private static void rotateArrayBetterSolution1(int[] a, int num) {
		int temp[] = new int[num];

		System.out.println("___________");
		for (int i = 0; i < num; i++) {
			temp[i] = a[i];
		}
		int index = 0;
		for (int ac : temp)
			System.out.println(ac);
		System.out.println("___________");
		for (int j = num; j < a.length; j++) {
			a[index] = a[j];
			index++;
		}
		for (int ac : a)
			System.out.println(ac);
		System.out.println("___________");
		for (int d = 0; d < temp.length; d++) {
			a[index] = temp[d];
			index++;
		}
		for (int ac : a)
			System.out.println(ac);
		System.out.println("___________");

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
