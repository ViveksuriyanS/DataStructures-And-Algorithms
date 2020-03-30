package datastructures.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueExample {
	public static void main(String[] args) {
		// Initializing an deque Double Ended QUEue
		Deque<Integer> de_que = new ArrayDeque<Integer>(10);
		// add() method to insert
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);
		for (Integer element : de_que) {
			System.out.println("Element : " + element);
		}

		System.out.println("Using clear() ");

		// clear() method - empty the queue
		de_que.clear();

		// addFirst() method to insert at start
		de_que.addFirst(564);
		de_que.addFirst(291);

		// addLast() method to insert at end
		de_que.addLast(24);
		de_que.addLast(14);

		System.out.println("Above elements are removed now");

		// Iterator() :
		System.out.println("Elements of deque using Iterator :");
		for (Iterator<Integer> itr = de_que.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}

		// descendingIterator() : to reverse the deque order
		System.out.println("Elements of deque in reverse order :");
		for (Iterator<Integer> dItr = de_que.descendingIterator(); dItr.hasNext();) {
			System.out.println(dItr.next());
		}

		// element() method : to get Head element
		System.out.println("\nHead Element using element(): " + de_que.element());

		// getFirst() method : to get Head element
		System.out.println("Head Element using getFirst(): " + de_que.getFirst());

		// getLast() method : to get last element
		System.out.println("Last Element using getLast(): " + de_que.getLast());

		// toArray() method :
		Object[] arr = de_que.toArray();
		System.out.println("\nArray Size : " + arr.length);

		System.out.print("Array elements : ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(" " + arr[i]);

		// peek() method : to get head
		System.out.println("\nHead element : " + de_que.peek());

		// poll() method : to get head and removes the element
		System.out.println("Head element poll : " + de_que.poll());

		// push() method : inserts at head
		de_que.push(265);
		de_que.push(984);
		de_que.push(2365);

		// remove() method : to get head
		System.out.println("Head element remove : " + de_que.remove());

		System.out.println("The final array is: " + de_que);
	}
}
// Java program to demonstrate few functions of
// ArrayDeque in Java

// Methods in ArrayDeque:
//
// add(Element e) : The method inserts particular element at the end of the
// deque.
// addFirst(Element e) : The method inserts particular element at the start of
// the deque.
// addLast(Element e) : The method inserts particular element at the end of the
// deque. It is similiar to add() method
// clear() : The method removes all deque elements.
// size() : The method returns the no. of elements in deque.
// clone() : The method copies the deque.
// contains(Obj) : The method checks whether a deque contains the element or not
// Iterator() : The method returns an iterator over the deque.
// descendingIterator() : The method returns a reverse order iterator over the
// deque
// element() : The method returns element at the head of the deque
// getFirst(): The method returns first element of the deque
// getLast(): The method returns last element of the deque
// isEmpty(): The method checks whether the deque is empty or not.
// toArray(): The method returns array having the elements of deque.
// offer(Element e) : The method inserts element at the end of deque.
// offerFirst(Element e) : The method inserts element at the front of deque.
// offerLast(Element e) : The method inserts element at the end of deque.
// peek() : The method returns head element without removing it.
// peekFirst() : The method returns first element without removing it.
// peekLast() : The method returns last element without removing it.
// poll() : The method returns head element and also removes it
// pollFirst() : The method returns first element and also removes it
// pollLast() : The method returns last element and also removes it
// pop() : The method pops out an element for stack repesented by deque
// push(Element e) : The method pushes an element onto stack repesented by deque
// remove() : The method returns head element and also removes it
// removeFirst() : The method returns first element and also removes it
// removeLast() : The method returns last element and also removes it
// removeFirstOccurrence(Obj) : The method removes the element where it first
// occur in the deque.
// removeLastOccurrence(Obj) : The method removes the element where it last
// occur in the deque.
