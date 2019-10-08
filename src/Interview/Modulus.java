package Interview;

import java.util.Arrays;

public class Modulus {

	public static void main(String[] args) {
		int size = 5;
		int[] a = new int[size];
		for (int i = 0; i < 10; i++) {
//			System.out.println(i+"%"+size + " = " + (i%size));
			a[i % size] = i;
			System.out.println("Index:" + i % size+ "-- Value:" + i );
			System.out.println(Arrays.toString(a));
		}
//		System.out.println(Arrays.toString(a));
	}

}
