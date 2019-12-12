package datastructures.queue;

import java.util.Scanner;

public class ArrayQueue {

	static int frontHead = -1, rearTail = -1;
	static int number[];
	static int maxSize;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the queue");
		maxSize = scan.nextInt();
		number = new int[maxSize];
		while (true) {
			System.out.println("1 - Enqueue");
			System.out.println("2 - Dequeue");
			System.out.println("3 - Empty?");
			System.out.println("4 - Full?");
			System.out.println("5 - Show all elements");
			System.out.println("6 - Exit");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the element to be added");
				enqueue(scan.nextInt());
				break;
			case 2:
				dequeue();
				break;
			case 3:
				if (frontHead == -1) {
					System.out.println("Empty");
				} else {
					System.out.println("Non - Empty");
				}
				break;
			case 4:
				if (rearTail == maxSize - 1) {
					System.out.println("Full");
				} else {
					System.out.println("Not full");
				}
				break;
			case 5:
				listElements();
				break;
			case 6:

				break;
			case 7:
				System.out.println("Enter the element to be searched:");
				System.out.println(isElementInArray(scan.nextInt()) ? "Present" : "Not present");
			case 8:
				scan.close();
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option..");
			}
		}

	}

	private static boolean isElementInArray(int nextInt) {
		boolean flag = false;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == nextInt) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	private static void enqueue(int newElement) {

		if (frontHead == -1) {
			++frontHead;
		}
		++rearTail;
		if (rearTail == maxSize) {
			System.out.println("Overflow");
		} else {
			number[rearTail] = newElement;
		}

	}

	private static void dequeue() {
		if (frontHead == -1) {
			System.out.println("Queue is empty");
		} else {
			System.out.println(number[frontHead] + " is deleted.");
			rearrange();
		}
	}

	private static void rearrange() {
		int arr = 0;
		int tempNum[] = new int[number.length - 1];
		for (int i = 1; i < number.length; i++) {
			tempNum[arr] = number[i];
			++arr;
		}
		number = tempNum;
		rearTail--;
	}

	private static void listElements() {
		for (int a = 0; a <= rearTail; a++) {
			System.out.print(number[a] + "\t");
		}
		System.out.println();
	}

}
