package datastructures.linkedlist;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleDoublyLinkedList {

	public static DLLNode headNode;
	public static DLLNode tailNode;
	public static Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {
		SimpleDoublyLinkedList.insertAtTail(15);
		SimpleDoublyLinkedList.insertAtHead(5);

		SimpleDoublyLinkedList.insertAtHead(6);

		SimpleDoublyLinkedList.insertAtHead(7);
		// SimpleDoublyLinkedList.printList();
		SimpleDoublyLinkedList.insertAtTail(17);
		SimpleDoublyLinkedList.printList()	;
		System.out.println();

		// Inserting element after the tail
		SimpleDoublyLinkedList.insertAfterElement(17, 10);
//		SimpleDoublyLinkedList.printList();
		System.out.println();
		SimpleDoublyLinkedList.insertAfterElement(7, 11);
//		SimpleDoublyLinkedList.printList();
		System.out.println();
		SimpleDoublyLinkedList.printListReverse();
		SimpleDoublyLinkedList.insertBeforeElement(11, 2);
//		SimpleDoublyLinkedList.printList();
		SimpleDoublyLinkedList.insertBeforeElement(7, 1);
//		SimpleDoublyLinkedList.printList();

		
//		SimpleDoublyLinkedList.searchElement(11);

		SimpleDoublyLinkedList.deleteHead();

		SimpleDoublyLinkedList.deleteTail();

		
		SimpleDoublyLinkedList.deleteAfterElement(6);
		System.out.println("____________________________");
		SimpleDoublyLinkedList.deleteBeforeElement(6);
		SimpleDoublyLinkedList.printList();
		SimpleDoublyLinkedList.printListReverse();
		SimpleDoublyLinkedList.printHeadNode();
		SimpleDoublyLinkedList.printTailNode();
		System.out.println("____________________________");

		SimpleDoublyLinkedList.printHeadNode();
		SimpleDoublyLinkedList.printTailNode();
	}

	public static void printHeadNode() {
		if (headNode == null) {
			log.log(Level.INFO, "The list is empty.");
		} else {
			System.out.println(headNode.data + " is the first element in the list.\n");
		}
	}

	public static void printTailNode() {
		if (tailNode == null) {
			log.log(Level.INFO, "The list is empty.");
		} else {
			System.out.println(tailNode.data + " is the last element in the list.\n");
		}
	}

	public static DLLNode createNode(int element) {
		DLLNode newNode = new DLLNode();
		newNode.data = element;
		newNode.nextNode = null;
		newNode.prevNode = null;

		return newNode;
	}

	// Print the reverse list
	public static void printListReverse() {
		DLLNode tempNode = tailNode;
		if (tailNode != null) {
			while (tempNode.prevNode != null) {
				System.out.println(tempNode.data);
				tempNode = tempNode.prevNode;
			}
			System.out.println(tempNode.data + "\n");
		}
	}

	// Print the list
	public static void printList() {
		DLLNode tempNode = headNode;
		if (headNode != null) {
			while (tempNode.nextNode != null) {
				System.out.println(tempNode.data);
				tempNode = tempNode.nextNode;
			}
			System.out.println(tempNode.data + "\n");
		}

	}

	// Inserting the element before head node
	public static void insertAtHead(int data) {
		DLLNode newNode = createNode(data);
		// If headNode is null, create list
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
			log.log(Level.INFO, "New list is created with new node.");
		} else {
			headNode.prevNode = newNode;
			newNode.nextNode = headNode;
			headNode = newNode;
			log.log(Level.INFO, "New node is inserted at head position.");
		}
	}

	// Inserting element at the end of the list
	public static void insertAtTail(int data) {
		DLLNode newNode = createNode(data);
		// If tailNode is null, then create list
		if (tailNode == null) {
			headNode = newNode;
			tailNode = newNode;
			log.log(Level.INFO, "New list is created with new node.");
		} else {
			tailNode.nextNode = newNode;
			newNode.prevNode = tailNode;
			tailNode = newNode;
		}
	}

	// Inserting the element after element X
	public static void insertAfterElement(int searchData, int data) {
		DLLNode newNode = createNode(data);
		DLLNode tempNode = headNode;
		boolean found = false;
		// Iterating till we find the element
		while (tempNode.nextNode != null) {
			if (tempNode.data == searchData) {
				found = true;
				break;
			}
			tempNode = tempNode.nextNode;
		}
		// Inserting at last element
		if (tempNode.nextNode == null && tempNode.data == searchData) {
			found = true;
			tailNode = newNode;
		}
		// Inserting after the element
		if (found) {
			System.out.println("Element is found" + searchData + " " + data);
			// Element is at first node
			newNode.prevNode = tempNode;
			newNode.nextNode = tempNode.nextNode;
			if (tempNode.nextNode != null) {
				newNode.nextNode.prevNode = newNode;
			}
			tempNode.nextNode = newNode;

		} else {
			log.log(Level.WARNING, "Element is not found in the list");
		}
	}

	// Inserting the element before element X
	public static void insertBeforeElement(int searchData, int data) {
		DLLNode newNode = createNode(data);
		DLLNode tempNode = tailNode;
		boolean flag = false;
		while (tempNode.prevNode != null) {
			if (tempNode.data == searchData) {
				flag = true;
				break;
			}
			tempNode = tempNode.prevNode;
		}
		if (tempNode.prevNode == null && tempNode.data == searchData) {
			flag = true;
			headNode = newNode;
		}
		if (flag) {
			if (tempNode.prevNode != null) {
				tempNode.prevNode.nextNode = newNode;
			}
			newNode.nextNode = tempNode;
			newNode.prevNode = tempNode.prevNode;

			tempNode.prevNode = newNode;
		} else {
			log.log(Level.INFO, "Element is not found in the list");
		}
	}

	// Searching the element in list
	public static void searchElement(int data) {
		DLLNode tempNode = headNode;
		int counter = 1;
		boolean flag = false;
		while (tempNode.nextNode != null) {
			if (tempNode.data == data) {
				flag = true;
				break;
			} else {
				tempNode = tempNode.nextNode;
			}
			counter++;
		}
		if (flag) {
			System.out.println(data + " is found at position " + counter);
		} else {
			log.log(Level.WARNING, "Element " + data + "is not found in the list");
		}
	}

	// Deleting the head node element
	public static void deleteHead() {
		headNode = headNode.nextNode;
		headNode.prevNode = null;
	}

	// Deleting the tail node element
	public static void deleteTail() {
		tailNode = tailNode.prevNode;
		tailNode.nextNode = null;
	}

	// Deleting the element after element X
	public static void deleteAfterElement(int data) {
		DLLNode tempNode = headNode;
		while (tempNode.nextNode != null) {
			if (tempNode.data == data) {
				break;
			}
			tempNode = tempNode.nextNode;
		}
		if (tempNode.nextNode != null) {
			log.log(Level.INFO, "Element "+ tempNode.nextNode.data + " is deleted");
			DLLNode delNode = tempNode.nextNode;
			tempNode.nextNode = delNode.nextNode;
			delNode.nextNode.prevNode = tempNode;	
		} else {
			log.log(Level.WARNING, "No next element found after " + data);
		}
	}

	// Deleting the element before element X
	public static void deleteBeforeElement(int data) {
		DLLNode tempNode = tailNode;
		while (tempNode.prevNode != null) {
			if (tempNode.data == data) {
				break;
			}
			tempNode = tempNode.prevNode;
		}
		if (tempNode.prevNode != null) {
			log.log(Level.INFO, "Element "+ tempNode.prevNode.data + " is deleted");
			DLLNode delNode = tempNode.prevNode;
			tempNode.prevNode = delNode.prevNode;
			delNode.prevNode.nextNode = tempNode;
		} else {
			log.log(Level.WARNING, "No next element found before " + data);
		}
	}
}

class DLLNode {
	DLLNode nextNode;
	DLLNode prevNode;
	int data;
}
