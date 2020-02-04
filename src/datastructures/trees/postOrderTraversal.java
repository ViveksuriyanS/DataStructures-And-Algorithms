package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class postOrderTraversal {
	static treeY root;

	public static void main(String[] args) {
		createtreeY(1);
		createtreeY(2);
		createtreeY(3);
		createtreeY(4);
		createtreeY(5);
		createtreeY(6);
		createtreeY(7);
		createtreeY(8);
		createtreeY(9);
		postOrderTravserse();
	}

	// AB+
	private static void postOrderTravserse() {
		if (root == null)
			return;

		Stack<treeY> traverse = new Stack<treeY>();
		traverse.add(root);

		while (!traverse.isEmpty()) {
			treeY currN = traverse.peek();
			// Checking if this node has any child or not
			if (currN.getLeftX() == null && currN.getRightX() == null) {
				// Remove the node and print the value
				currN = traverse.pop();
				System.out.println(currN.getData());
			} else {
				// If current node has right node then add it to stack
				if (currN.getRightX() != null) {
					traverse.add(currN.getRightX());
					currN.setRightX(null);
				}
				// If current node has left node then add it to the stack
				if (currN.getLeftX() != null) {
					traverse.add(currN.getLeftX());
					currN.setLeftX(null);
				}
			}

		}
	}

	private static void createtreeY(int data) {
		treeY node = new treeY();
		node.setData(data);
		node.setLeftX(null);
		node.setRightX(null);
		if (root == null) {
			root = node;
		} else {
			Queue<treeY> nodes = new LinkedList<treeY>();
			nodes.add(root);
			while (!nodes.isEmpty()) {
				treeY currN = nodes.remove();
				// Check for left side availability
				if (currN.getLeftX() == null) {
					currN.setLeftX(node);
					break;
				} else {
					nodes.add(currN.getLeftX());
				}

				// Check for right side availability
				if (currN.getRightX() == null) {
					currN.setRightX(node);
					break;
				} else {
					nodes.add(currN.getRightX());
				}
			}
		}
	}
}

class treeY {
	int data;
	treeY leftX;
	treeY rightX;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public treeY getLeftX() {
		return leftX;
	}

	public void setLeftX(treeY leftX) {
		this.leftX = leftX;
	}

	public treeY getRightX() {
		return rightX;
	}

	public void setRightX(treeY rightX) {
		this.rightX = rightX;
	}
}
