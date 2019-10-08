package Arrays;

import java.util.Arrays;

public class CyclicRotation {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5 };
		// Setting the array to temporary variable
		int tmp = array[array.length - 1];
		// Defining the variable
		int x;
		for (x = array.length - 1; x > 0; x--) {
			array[x] = array[x - 1];
		}
		array[x] = tmp;
		System.out.println(Arrays.toString(array));
	}

}
