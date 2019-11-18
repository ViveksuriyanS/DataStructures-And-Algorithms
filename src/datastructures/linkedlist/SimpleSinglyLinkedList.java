package datastructures.linkedlist;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleSinglyLinkedList {

	static Node1 headNode;
	static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public static void main(String[] args) {

		// Insert Operations
		SimpleSinglyLinkedList.insertAtHead(6);
		SimpleSinglyLinkedList.showNodes();
		SimpleSinglyLinkedList.insertNodeAtTail(5);
		SimpleSinglyLinkedList.insertNodeAtTail(13);
		SimpleSinglyLinkedList.insertNodeAtTail(68);
		SimpleSinglyLinkedList.insertAtHead(61);
		SimpleSinglyLinkedList.showNodes();
		System.out.println("Insert at Middle");
		SimpleSinglyLinkedList.insertAtMiddle(7, 5);
		SimpleSinglyLinkedList.showNodes();

		// Delete Operations
		SimpleSinglyLinkedList.deleteHead();
		SimpleSinglyLinkedList.showNodes();
		SimpleSinglyLinkedList.deleteNode(13);
		SimpleSinglyLinkedList.showNodes();
		SimpleSinglyLinkedList.deleteNode(13);
		SimpleSinglyLinkedList.showNodes();
		SimpleSinglyLinkedList.deleteTail();
		SimpleSinglyLinkedList.showNodes();
		SimpleSinglyLinkedList.findElement(5);
		SimpleSinglyLinkedList.findElement(11);
	}

	public static void deleteList() {
		headNode = null;
	}

	// Traversing the list
	public static void findElement(int element) {
		boolean found = false;
		int count = 1;
		Node1 tempNode = headNode;
		while (tempNode.nextNode != null && !found) {
			if (tempNode.data == element) {
				found = true;
			} else {
				count++;
				tempNode = tempNode.nextNode;
			}
		}
		System.out.println(found);
		if (found) {
			logger.log(Level.INFO, element + " is found at position " + count);
		} else {
			logger.log(Level.WARNING, element + " is not found in the list");
		}

	}

	public static int listSize() {
		int size = 1;
		Node1 tempNode = headNode;
		while (tempNode.nextNode != null) {
			tempNode = tempNode.nextNode;
			size++;
		}

		return size;
	}

	public static Node1 returnTailBeforeNode() {
		Node1 tailNode = null;

		if (!checkEmpty()) {
			Node1 tempNode = headNode;
			while (tempNode.nextNode.nextNode != null) {
				tempNode = tempNode.nextNode;
			}
			tailNode = tempNode;
		}

		return tailNode;
	}

	public static Node1 createNode(int element) {
		Node1 newNode = new Node1();
		newNode.data = element;
		newNode.nextNode = null;

		return newNode;
	}

	public static boolean checkEmpty() {
		if (headNode == null) {
			return true;
		}

		return false;
	}

	public static void deleteHead() {
		Node1 tempNode1 = headNode;
		headNode = headNode.nextNode;
		tempNode1.nextNode = null;
	}

	// First occurrence of the element will be deleted
	public static void deleteNode(int element) {
		boolean isDeleted = false;
		if (headNode == null) {
			logger.log(Level.WARNING, "List is empty cannot delete");
		} else if (headNode.data == element) {
			logger.log(Level.INFO, headNode.data + " is deleted.");
			headNode = headNode.nextNode;
		} else {
			Node1 tempNode = headNode;
			while (tempNode.nextNode != null) {
				if (tempNode.nextNode.data == element) {
					Node1 delNode = tempNode.nextNode;
					tempNode.nextNode = delNode.nextNode;
					delNode = null;
					isDeleted = true;
				} else {
					tempNode = tempNode.nextNode;
				}
			}
		}
		if (!isDeleted) {
			logger.log(Level.INFO, "No element is deleted.");
		}
	}

	public static void deleteTail() {
		logger.log(Level.INFO, returnTailBeforeNode().nextNode.data + " is deleted");
		returnTailBeforeNode().nextNode = null;
	}

	public static void insertAtMiddle(int element, int position) {
		if (position > listSize()) {
			System.out.println(position);
			System.out.println(listSize());
			logger.log(Level.WARNING, "Position is out of bound");
		} else {
			Node1 tempNode = headNode;
			for (int i = 1; i < position - 1; i++) {
				tempNode = tempNode.nextNode;
			}

			Node1 newNode = createNode(element);
			newNode.nextNode = tempNode.nextNode;
			tempNode.nextNode = newNode;
		}
	}

	public static void insertAtHead(int element) {
		Node1 newHeadNode = createNode(element);

		if (checkEmpty()) {
			headNode = newHeadNode;
			logger.log(Level.INFO, "Head Node is created");
		} else {
			Node1 tempNode = headNode;
			headNode = newHeadNode;
			headNode.nextNode = tempNode;
		}
	}

	public static void insertNodeAtTail(int element) {
		Node1 newNode = createNode(element);

		if (checkEmpty()) {
			headNode = newNode;
		} else {
			Node1 temp = headNode;
			while (temp.nextNode != null) {
				temp = temp.nextNode;
			}
			temp.nextNode = newNode;
		}
		System.out.println("Node with the element " + element + " is added.");
	}

	public static void showNodes() {
		Node1 xNode = headNode;
		while (xNode.nextNode != null) {
			System.out.println(xNode.data);
			xNode = xNode.nextNode;

		}
		System.out.println(xNode.data);
	}

}

class Node1 {
	int data;
	Node1 nextNode;
}
