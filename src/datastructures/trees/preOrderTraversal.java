package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class preOrderTraversal {
	static treeX root;

	public static void main(String[] args) {
		createTreeX(1);
		createTreeX(2);
		createTreeX(3);
		createTreeX(4);
		createTreeX(5);
		createTreeX(6);
		createTreeX(7);
		preOrderTravserse();
	}

	// +AB
	private static void preOrderTravserse() {
		// We are using to stack to use LIFO
		Stack<treeX> traverse = new Stack<treeX>();
		traverse.push(root);

		while (!traverse.isEmpty()) {
			// Process the middle node - (+)
			treeX currentNode = traverse.pop();
			System.out.println(currentNode.getData());
			// Since we use LIFO, first we add the nodes which needs to be processed later
			// Right side nodes process later - (B)
			if (currentNode.getRightX() != null) {
				traverse.push(currentNode.getRightX());
			}
			// Left side nodes process first - (A)
			if (currentNode.getLeftX() != null) {
				traverse.push(currentNode.getLeftX());
			}
		}
	}

	private static void createTreeX(int data) {
		treeX node = new treeX();
		node.setData(data);
		node.setLeftX(null);
		node.setRightX(null);
		if (root == null) {
			root = node;
		} else {
			Queue<treeX> qu = new LinkedList<treeX>();
			qu.add(root);
			while (!qu.isEmpty()) {
				treeX currN = qu.remove();
				// To check left availability
				if (currN.getLeftX() == null) {
					currN.setLeftX(node);
					break;
				} else {
					qu.add(currN.getLeftX());
				}
				// To check right availability
				if (currN.getRightX() == null) {
					currN.setRightX(node);
					break;
				} else {
					qu.add(currN.getRightX());
				}
			}
		}
	}
}

class treeX {
	int data;
	treeX leftX;
	treeX rightX;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public treeX getLeftX() {
		return leftX;
	}

	public void setLeftX(treeX leftX) {
		this.leftX = leftX;
	}

	public treeX getRightX() {
		return rightX;
	}

	public void setRightX(treeX rightX) {
		this.rightX = rightX;
	}
}