package datastructures.linkedlist;

import java.util.Stack;

public class ReverseSinglyLinkedList {
	static NodeEntitySLL head;

	public static void main(String[] args) {
		head = SinglyLinkedListImpl.sampleList();
		SinglyLinkedListImpl.printNodes(head);
		NodeEntitySLL newHead = reverseLinkedList(head);
		SinglyLinkedListImpl.printNodes(newHead);
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
		tmpHead.node = null;

		return head;
	}

}
