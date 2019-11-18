package datastructures.linkedlist;

public class SinglyList_CheckCircular {

	static NodeEntitySLL head;

	public static void main(String[] args) {
		head = SinglyLinkedListImpl.sampleList();
		checkCircular(head);

		head = SinglyLinkedListImpl.sampleCircularList();
		checkCircular(head);
	}

	public static void checkCircular(NodeEntitySLL node) {
		NodeEntitySLL tmpNode = node;

		while (tmpNode != null) {
			if (tmpNode.node == null) {
				System.out.println("This is Sinlgy Linked List");
			}
			tmpNode = tmpNode.node;
		}
		NodeEntitySLL tmpNode1 = node;
		while (tmpNode1.node != head) {
			if (tmpNode1.node == head) {
				System.out.println("This is Circular Linked List");
			}
		}
	}
}
