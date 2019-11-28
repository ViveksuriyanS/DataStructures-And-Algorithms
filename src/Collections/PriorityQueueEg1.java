package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEg1 {

	public static void main(String[] args) {
		// Doesn't maintain any insertion order
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(0);
		pq.add(10);
		pq.add(11);
		pq.add(20);
		pq.add(40);
		pq.add(81);
		pq.add(2);
		pq.add(6);
		Iterator<Integer> iter = pq.iterator();
		while (iter.hasNext()) {
			System.out.println(pq.remove());
		}
	}
}

// While trying to remove priority queue element, removes from small element to higher element