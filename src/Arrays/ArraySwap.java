package Arrays;

// Reversing the array

public class ArraySwap {

	public static void main(String[] args) {
		// efficient way of swapping the elements
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int j = a.length - 1;
		// Find the mid point of the array
		// Swap nth element from both the end
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			j--;
		}
		for (int x : a) {
			System.out.print(x);
		}
	}

}
