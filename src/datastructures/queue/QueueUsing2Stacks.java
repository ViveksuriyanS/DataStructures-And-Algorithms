package datastructures.queue;

import java.util.Stack;

public class QueueUsing2Stacks {

	static Stack<Integer> st1 = new Stack<Integer>();
	static Stack<Integer> st2 = new Stack<Integer>();

	public static void main(String[] args) {
		QueueUsing2Stacks.enqueue(5);
		QueueUsing2Stacks.enqueue(4);
		QueueUsing2Stacks.enqueue(3);
		QueueUsing2Stacks.enqueue(2);
		QueueUsing2Stacks.enqueue(1);
		System.out.println("Elements will be popped out as per the insertion order 5..4..3..2..1");
		QueueUsing2Stacks.dequeue();
		QueueUsing2Stacks.dequeue();
		QueueUsing2Stacks.dequeue();
		QueueUsing2Stacks.dequeue();
		QueueUsing2Stacks.dequeue();
		QueueUsing2Stacks.dequeue();
	}

	public static void enqueue(int inp) {
		st1.push(inp);
	}

	public static void dequeue() {
		if (st2.isEmpty()) {
			while (!st1.isEmpty()) {
				st2.add(st1.pop());
			}
		}

		if (st2.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Popped element " + st2.pop());
	}
}
