package Collections;

import java.util.ArrayDeque;

public class ArrayDequeueSort {

	public static void main(String[] args) {
		int arr[] = { 8, 19, 3, 56, 24, 10, 13, 32, 22 };
		ArrayDeque<Integer> arrdeq = new ArrayDeque<Integer>();
		for (int a : arr) {
			arrdeq.add(a);
		}
		arrdeq.addFirst(123);
		arrdeq.addLast(321);
		System.out.println(arrdeq.contains(56));
		System.out.println(arrdeq);
		System.out.println(arrdeq.remove());
		System.out.println(arrdeq.remove());


	}

}
