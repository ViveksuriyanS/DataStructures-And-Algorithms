package Interview;

import java.util.Arrays;

public class MaxProductPair {

	public static void main(String[] args) {
		int[] a = { -3, 5, 9, 2, -4, 8, -9, -10 };
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		int headMax = a[0] * a[1];
		int tailMax = a[a.length - 1] * a[a.length - 2];
		System.out.println(Math.max(headMax, tailMax));
	}

}
