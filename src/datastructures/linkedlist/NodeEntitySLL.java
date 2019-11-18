package datastructures.linkedlist;

// Node of Singly Linked List
public class NodeEntitySLL {
	int data;
	NodeEntitySLL node;

	public NodeEntitySLL getNode() {
		return node;
	}

	public void setNode(NodeEntitySLL node) {
		this.node = node;
	}

	public NodeEntitySLL(int data) {
		this.data = data;
	}

	public NodeEntitySLL() {

	}

}
