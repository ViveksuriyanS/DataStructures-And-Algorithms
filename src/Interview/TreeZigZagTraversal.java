package Interview;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeZigZagTraversal {

	static TreeDS root;

	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(7);
		print(root);
	}

	public static void print(TreeDS rootTmp) {
		Queue<TreeDS> result = new LinkedList<TreeDS>();
		boolean isLeftToRight = true;
		result.add(rootTmp);
		while (!result.isEmpty()) {
			TreeDS current = result.remove();
			System.out.println(current.data);
			if(isLeftToRight) {
				if (current.left != null) {
					result.add(current.left);
				}
				if (current.right != null) {
					result.add(current.right);
				}
				isLeftToRight = false;
			} else {
				if (current.right != null) {
					result.add(current.right);
				}
				if (current.left != null) {
					result.add(current.left);
				}
			}

		}
	}

	public static void addNode(int data) {
		TreeDS newNode = new TreeDS(data);

		if (root == null) {
			root = newNode;
		} else {
			TreeDS tmpTraversalNode = root;
			Queue<TreeDS> st = new LinkedList<TreeDS>();
			st.add(tmpTraversalNode);
			while (!st.isEmpty()) {
				TreeDS currentNode = st.remove();
				if (currentNode.left == null) {
					currentNode.left = newNode;
					break;
				} else {
					st.add(currentNode.left);
				}
				if (currentNode.right == null) {
					currentNode.right = newNode;
					break;
				} else {
					st.add(currentNode.right);
				}

			}
		}
	}

}

class TreeDS {
	int data;
	TreeDS left;
	TreeDS right;

	TreeDS(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}