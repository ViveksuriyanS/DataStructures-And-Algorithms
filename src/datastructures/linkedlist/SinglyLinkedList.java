package datastructures.linkedlist;

import java.util.Scanner;

class Node {
	int value;
	Node nextNode;

	public Node(int val) {
		value = val;
	}
}

public class SinglyLinkedList {

	static Node headNode = null;
	
	public static Scanner scan;

	public static void main(String[] args) {
		System.out.println();
		scan = new Scanner(System.in);

		while (true) {
			System.out.println("1 - Add");
			System.out.println("2 - Delete");
			System.out.println("3 - Empty?");
			System.out.println("4 - Full?");
			System.out.println("5 - Show all elements");
			System.out.println("6 - Exit");
			switch (scan.nextInt()) {
			case 1:
				System.out.println("Enter the element to be added");
				addNode(scan.nextInt());
				break;
			case 2:
				
				break;
			case 3:

				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid option..");
			}

		}

	}

	private static void addNode(int element) {
		Node newNode =  new Node(element);
		newNode.nextNode = null;
		if(headNode == null) {
			headNode = new Node(element);
		} else {
			headNode.nextNode = new Node(element);
			
		}
	}
}
