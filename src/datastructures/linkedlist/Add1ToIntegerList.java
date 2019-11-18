package datastructures.linkedlist;

// List with input 1->9->9->9 by adding 1 to it
// Output 2->0->0->0

// 1. Reverse the input List as 9->9->9->1
// 2. Add the value '1' to the List from left 0->0->0->2
// 3. If there any carry forward then move to next node and add till there is no carry forward
// 4. Reverse back the List

public class Add1ToIntegerList {
	static NodeEntitySLL head;

	public static void main(String[] args) {
		// Creating sample List
		head = SinglyLinkedListImpl.sampleList();
		// Step 1: Reversing the List
		head = ReverseSinglyLinkedList.reverseLinkedList(head);
		SinglyLinkedListImpl.printNodes(head);

		// Step 2&3: Adding the value '1' to the list
		int carry = 1;
		addValueToListNode(head, carry);
		SinglyLinkedListImpl.printNodes(head);

		// Step 4: Reversing the List again
		head = ReverseSinglyLinkedList.reverseLinkedList(head);
		SinglyLinkedListImpl.printNodes(head);

	}

	private static void addValueToListNode(NodeEntitySLL head2, int carry) {
		NodeEntitySLL tmpNode = head;
		while (tmpNode != null && carry == 1) {
			int sum = (tmpNode.data + carry) % 10;
			carry = (tmpNode.data + carry > 9) ? 1 : 0;
			tmpNode.data = sum;
			tmpNode = tmpNode.node;
		}
	}

}

// Have to extend for N values
// for 1 it is working perfectly