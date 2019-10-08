package datastructures.linkedlist;

public class NthNodefromLast {

	static ListNode headNode;

	public static void main(String[] args) {
		createNode(5);
		createNode(51);
		createNode(52);
		createNode(53);
		printNodes();
//		printNthNodeLast(7);
		printNthNodeLast(2);
		System.out.println("Length of the list "+getListLength());
	}

	public static void createNode(int val) {
		ListNode newNode = new ListNode();
		newNode.setData(val);
		newNode.setNode(null);
		if (headNode == null) {
			headNode = newNode;
		} else {
			ListNode tempNode = headNode;
			while (tempNode.nextNode != null) {
				tempNode = tempNode.getNode();
			}
			tempNode.setNode(newNode);
		}
	}

	public static int getListLength() {
		int length = 0;
		ListNode tmp = headNode;
		while(tmp != null) {
			tmp = tmp.nextNode;
			length++;
		}
		
		return length;
	}
	
	public static void printNthNodeLast(int xthNode) {
		int count = 0;
		ListNode headRefNode = headNode;
		ListNode tempRefNode = headNode;

		if(getListLength() < xthNode) {
			System.out.println("Index is higher than the length of the list");
			
		} else{
			while (count < xthNode) {
				tempRefNode = tempRefNode.getNode();
				count++;
			}
			while( tempRefNode != null){
				headRefNode = headRefNode.getNode();
				tempRefNode = tempRefNode.getNode();
			}
			System.out.println("The " + xthNode + " node from last of the list is " + headRefNode.getData());
		}
	}

	public static void printNodes() {
		ListNode tempNode = headNode;
		do {
			System.out.println(tempNode.getData());
			tempNode = tempNode.getNode();
		} while (tempNode != null);
	}

}

class ListNode {
	int data;
	ListNode nextNode;

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public ListNode getNode() {
		return this.nextNode;
	}

	public void setNode(ListNode node) {
		this.nextNode = node;
	}
}
