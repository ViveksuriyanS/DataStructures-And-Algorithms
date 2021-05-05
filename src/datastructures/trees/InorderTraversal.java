package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InorderTraversal {

	static Node root;

	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(7);
		inorderTraverse1();
		inorderTraversal();
	}

	private static void inorderTraverse1() {
		// New stack to add the nodes while traversing
		Stack<Node> s = new Stack<Node>();

		// Initializing the root node to currentNode
		Node currentNode = root;

		// Adding the currentNode to stack to start traversing
		s.add(currentNode);

		// Check if the current processing node is not null
		// Check if the stack size is Empty
		while (currentNode != null && !s.isEmpty()) {
			// For each and every node, check for left node
			// If present -> If block, to process Left node
			// Not present -> Else block, to process Right node

			// If left node is not null, traverse left and push to stack
			if (currentNode.leftNode != null) {
				// Adding the left node of current node to stack, to keep trace
				s.push(currentNode.leftNode);

				// Moving towards left, by assigning "left node of current node" as new current
				// node
				currentNode = currentNode.leftNode;
			} else {
				currentNode = s.pop();
				System.out.println(currentNode.data);
				if (currentNode.rightNode != null) {
					currentNode = currentNode.rightNode;
					s.add(currentNode);
				}
			}
		}
	}

	//A+B
	public static void inorderTraversal() {
		Stack<Node> nodes = new Stack<Node>();
		Node currentNode = root;
		while(true) {
			if(currentNode != null) {
				nodes.push(currentNode);
				currentNode = currentNode.leftNode;
			} else {
				if(nodes.isEmpty()) {
					break;
				}
				currentNode = nodes.pop();
				System.out.println(currentNode.data);
				currentNode = currentNode.rightNode;
			}
		}
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
}