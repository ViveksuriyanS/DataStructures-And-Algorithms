package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class IdenticalTreeOrNot {

	static Tree root;

	public static void main(String[] args) {
		IdenticalTreeOrNot tree = new IdenticalTreeOrNot();
		tree.addNode(1);
		tree.addNode(2);
		tree.addNode(3);
		tree.addNode(4);
		tree.addNode(5);

	}

	public boolean isIdentical(Tree root1, Tree root2) {
		// Edge case 1 if both are null
		if (root1 == null && root2 == null) {
			return true;
		}

		// Edge case 2 if One is null and other is not
		if (root1 != null && root2 != null) {
			if (root1.getData() == root2.getData() && isIdentical(root1.getLeftNode(), root2.getLeftNode())
					&& isIdentical(root1.getRightNode(), root2.getRightNode())) {
				return true;
			}
		}

		return false;
	}

	public void addNode(int data) {
		Tree newNode = new Tree(data);
		if (root == null) {
			root = newNode;
		}
		Tree currNode = root;
		Queue<Tree> traverse = new LinkedList<Tree>();
		traverse.add(currNode);
		while (!traverse.isEmpty()) {
			if (currNode.getLeftNode() == null) {
				currNode.setLeftNode(newNode);
				break;
			} else {
				traverse.add(currNode.getLeftNode());
			}
			if (currNode.getRightNode() == null) {
				currNode.setRightNode(newNode);
				break;
			} else {
				traverse.add(currNode.getRightNode());
			}
		}
	}

}

class Tree {
	int data;
	Tree leftNode;
	Tree rightNode;

	public Tree(int data) {
		this.data = data;
		this.leftNode = null;
		this.rightNode = null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Tree getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Tree leftNode) {
		this.leftNode = leftNode;
	}

	public Tree getRightNode() {
		return rightNode;
	}

	public void setRightNode(Tree rightNode) {
		this.rightNode = rightNode;
	}

}