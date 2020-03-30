package Interview;

import java.util.HashSet;

public class FirstDuplicate {

	public static void main(String[] args) {
		// Though we have 2 set of duplicates [2,2] and [3,3]
		// 3 is found out to be first duplicate
		int inp[] = { 2, 1, 4, 7, 9, 3, 5, 3, 2 };

		HashSet<Integer> set = new HashSet<Integer>();
		for (int val : inp) {
			if (set.contains(val)) {
				System.out.println(val);
				break;
			} else {
				set.add(val);
			}
		}

	}

}
