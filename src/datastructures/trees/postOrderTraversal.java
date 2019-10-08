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
//		createtreeY(4);
//		createtreeY(5);
//		createtreeY(6);
//		createtreeY(7);
		postOrderTravserse();
	}

	// AB+
	private static void postOrderTravserse() {
		if (root == null)
			return;
		
		Stack<treeY> traverse = new Stack<treeY>();
		traverse.add(root);
		treeY currN = traverse.peek();
		while (!traverse.isEmpty()) {
			
			if (currN.getRightX() != null) {
				traverse.add(currN.getRightX());
			} 
			if (currN.getLeftX() != null) {
				traverse.add(currN.getLeftX());
			} 
			currN = traverse.pop();
			if(currN.getLeftX() == null && currN.getRightX() == null)
				System.out.println(currN.getData());
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
