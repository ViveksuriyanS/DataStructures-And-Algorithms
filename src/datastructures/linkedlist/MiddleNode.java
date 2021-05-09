package datastructures.linkedlist;

public class MiddleNode {
	public static Node head;

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			createNode(i);
		}
		printNode();
		System.out.println("Middle number");
		printMiddle();
	}

	private static void printMiddle() {
		Node tmp1 = head;
		Node tmp2 = head;
		while (tmp2.nextNode != null && tmp2.nextNode.nextNode != null) {
			tmp1 = tmp1.getNextNode();
			tmp2 = tmp2.getNextNode().getNextNode();
		}
		System.out.println(tmp1.data);
	}

	public static void createNode(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node tmp = head;
			while (tmp.nextNode != null) {
				tmp = tmp.nextNode;
			}
			tmp.setNextNode(newNode);
		}
	}

	public static void printNode() {
		Node tmp = head;
		while (tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.nextNode;
		}
	}
}

class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

}
