package datastructures.stack;

import java.util.Scanner;

public class ArrayStack {

	static int number[];
	static int top = -1;
	static int maxSize;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the stack");
		maxSize = scan.nextInt();
		number = new int[maxSize];
		while (true) {
			System.out.println("1 - Push Element");
			System.out.println("2 - Pop Element");
			System.out.println("3 - Empty?");
			System.out.println("4 - Full?");
			System.out.println("5 - Show all elements");
			System.out.println("6 - Top element");
			System.out.println("8 - Search element");
			System.out.println("8 - Exit");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the element to be added");
				if (isFull()) {
					System.out.println("The stack is full elements cannot be addded.");
				} else {
					push(scan.nextInt());
				}
				break;
			case 2:
				if (isEmpty()) {
					System.out.println("The stack is empty, cannot delete elements.");
				} else {
					pop();
				}
				break;
			case 3:
				System.out.println("The array is " + (isEmpty() ? "empty" : "not empty"));
				break;
			case 4:
				System.out.println("The array is " + (isFull() ? "full" : "not full"));
				break;
			case 5:
				listElements();
				break;
			case 6:
				System.out.println(number[top] + " is the element at the top");
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

	private static boolean isElementInArray(int num) {
		boolean flag = false;

		for (int i = 0; i < number.length; i++) {
			if (number[i] == num) {
				flag = true;
				break;
			}
		}

		return flag;
	}

	private static void push(int newElement) {
		++top;
		number[top] = newElement;
	}

	private static void pop() {
		System.out.println(number[top] + " is deleted.");
		--top;
	}

	private static void listElements() {
		for (int a = 0; a <= top; a++) {
			System.out.print(number[a] + "\t");
		}
		System.out.println();
	}

	private static boolean isEmpty() {
		return (top == -1) ? true : false;
	}

	private static boolean isFull() {
		return (top == maxSize - 1) ? true : false;
	}

}
