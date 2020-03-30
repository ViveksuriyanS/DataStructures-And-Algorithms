package datastructures.trees;

public class BSTRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class NodeR {
	NodeR right, left;
	int data;

	public NodeR(int data) {
		this.data = data;
	}

	public void insert(int val) {
		if (val <= data) {
			if (left == null) {
				left = new NodeR(val);
			} else {
				left.insert(val);
			}
		} else {
			if (right == null) {
				right = new NodeR(val);
			} else {
				right.insert(val);
			}
		}
	}

	public boolean contains(int num) {
		if (data == num) {
			return true;
		} else if (num > data) {
			if (right == null) {
				return false;
			} else {
				return right.contains(num);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(num);
			}
		}
	}

	public void printInorder() {
		if (left != null) {
			left.printInorder();
		}
		System.out.println(data);
		if (right != null) {
			right.printInorder();
		}
	}

	public void printPreorder() {
		System.out.println(data);
		if (left != null) {
			left.printInorder();
		}
		if (right != null) {
			right.printInorder();
		}
	}

	public void printPostorder() {
		if (left != null) {
			left.printInorder();
		}
		if (right != null) {
			right.printInorder();
		}
		System.out.println(data);
	}
}