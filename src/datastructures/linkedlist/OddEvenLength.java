package datastructures.linkedlist;

public class OddEvenLength {

	static NodeEntitySLL headNode;

	public static void main(String[] args) {
		headNode = SinglyLinkedListImpl.sampleList();

		SinglyLinkedListImpl.printNodes(headNode);

		NodeEntitySLL tmpNode = headNode;
		while (true) {
			if (tmpNode == null) {
				System.out.println("Even sized");
				break;
			} else if (tmpNode.node == null) {
				System.out.println("Odd sized");
				break;
			}
			tmpNode = tmpNode.node.node;
		}

	}

}
