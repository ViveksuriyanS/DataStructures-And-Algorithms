package datastructures.linkedlist;

import java.util.Stack;

public class ReverseSinglyLinkedList {
	static NodeEntitySLL head;

	public static void main(String[] args) {
		head = SinglyLinkedListImpl.sampleList();
		SinglyLinkedListImpl.printNodes(head);
		// Reverse using Stack
		NodeEntitySLL newHead = reverseLinkedList(head);
		SinglyLinkedListImpl.printNodes(newHead);
		// Reverse iteratively
		NodeEntitySLL newHead1 = reverseLinkedList1(head);
		SinglyLinkedListImpl.printNodes(newHead1);

	}

	private static NodeEntitySLL reverseLinkedList1(NodeEntitySLL currentNode) {
		NodeEntitySLL prevNode = null;
		NodeEntitySLL nextNode;

		while (currentNode != null) {
			nextNode = currentNode.node;
			currentNode.node = prevNode;
			prevNode = currentNode;
			currentNode = nextNode;

		}
		return prevNode;
	}

	// Using Stack
	// Pass the head node
	// @param NodeEntitySLL -> (Head Node) SinglyLinkedList provided as input
	// @return NodeEntitySLL -> (Head Node) Reversed Singly Linked List
	public static NodeEntitySLL reverseLinkedList(NodeEntitySLL node) {
		Stack<NodeEntitySLL> nodeStack = new Stack<NodeEntitySLL>();
		while (node.node != null) {
			nodeStack.add(node);
			node = node.node;
		}
		head = node;
		NodeEntitySLL tmpHead = head;
		while (!nodeStack.isEmpty()) {
			tmpHead.node = nodeStack.pop();
			tmpHead = tmpHead.node;
		}
		// Making the end
		tmpHead.node = null;

		return head;
	}

}
