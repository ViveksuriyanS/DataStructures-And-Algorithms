package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_LevelOrderTraversal {

	static Node root;

	public static void main(String[] args) {
		// Adding nodes
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(7);
		levelOrderTraversal();
	}

	public static void addNode(int data) {
		Node node = new Node(data);
		if (root == null) {
			root = node;
		} else {
			Queue<Node> nodes = new LinkedList<Node>();
			nodes.add(root);
			while (!nodes.isEmpty()) {
				Node currentNode = nodes.remove();
				// Check for left availability
				if (currentNode.leftNode == null) {
					currentNode.leftNode = node;
					break;
				} else {
					nodes.add(root.leftNode);
				}
				// Check for right availability
				if (currentNode.rightNode == null) {
					currentNode.rightNode = node;
					break;
				} else {
					nodes.add(root.rightNode);
				}
			}
		}
	}

	public static void levelOrderTraversal() {
		if (root == null) {
			System.out.println("Tree is empty!!!");
			return;
		}

		Queue<Node> traversal = new LinkedList<Node>();
		traversal.add(root);
		while (!traversal.isEmpty()) {
			Node currN = traversal.remove();
			System.out.println(currN.data);
			if (currN.leftNode != null) {
				traversal.add(currN.leftNode);
			}
			if (currN.rightNode != null) {
				traversal.add(currN.rightNode);
			}
		}
	}
}

class Node {
	int data;
	Node leftNode;
	Node rightNode;

	Node(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}
}