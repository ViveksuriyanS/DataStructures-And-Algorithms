package Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class IndexDescendingOrder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// game loop
		while (true) {
			System.err.println("New ");
			int[] arr = new int[8];
			List<Integer> ar = new LinkedList<Integer>();
			for (int i = 0; i < 8; i++) {
				int mountainH = in.nextInt();// represents the height of one mountain.
				System.err.println(mountainH);
				arr[i] = mountainH;
				ar.add(mountainH);
			}
			System.err.println(ar);
			Arrays.sort(arr);

			// Write an action using System.out.println()
			// To debug: System.err.println("Debug messages...");

				int max = ar.get(0);
				for (int k = 1; k < ar.size(); k++) {
					if (max < ar.get(k)) {
						max = ar.get(k);
					}
				}
				System.out.println(ar.indexOf(max));


		}
	}

}
