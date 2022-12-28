package datastructures.linkedlist;

public class SinglyLinkedListImpl {

	static NodeEntitySLL head;

	public static void main(String[] args) {

		// Adding 5 nodes
//		addNodes(1);
//		addNodes(2);
//		addNodes(3);
//		addNodes(4);
//		addNodes(5);
//
//		printNodes(head);

		addNodesCircular(1);
		addNodesCircular(2);
		addNodesCircular(3);
		addNodesCircular(4);
		printNodes(head);
	}

	public static void printNodes(NodeEntitySLL node) {
		if (node == null) {
			System.out.println("List is empty...");
			return;
		}
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.node;
		}
		System.out.println();
	}

	public static void addNodes(int value) {
		NodeEntitySLL newNode = new NodeEntitySLL(value);
		if (head == null) {
			head = newNode;
		} else {
			NodeEntitySLL tmpNode = head;
			while (tmpNode.node != null) {
				tmpNode = tmpNode.node;
			}
			tmpNode.node = newNode;
		}
	}

	public static NodeEntitySLL sampleList() {
//		addNodes(1);
//		addNodes(2);
//		addNodes(3);
//		addNodes(4);
//		addNodes(5);
		addNodes(1);
		addNodes(1);
		addNodes(2);
		addNodes(3);
		addNodes(3);

		return head;
	}

	public static NodeEntitySLL sampleCircularList() {
		addNodesCircular(1);
		addNodesCircular(2);
		addNodesCircular(3);
		addNodesCircular(4);
		return head;
	}

	public static void addNodesCircular(int value) {
		NodeEntitySLL newNode = new NodeEntitySLL(value);

		if (head == null) {
			head = newNode;
			head.node = head;
		} else {
			NodeEntitySLL tmpNode = head;
			while (tmpNode.node != null) {
				System.out.println(tmpNode.data);
				if (tmpNode.node == head) {
					newNode.node = head;
					tmpNode.node = newNode;
				}
				tmpNode = tmpNode.node;
			}
		}

	}

}
