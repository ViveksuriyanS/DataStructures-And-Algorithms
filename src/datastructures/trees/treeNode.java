package datastructures.trees;

public class treeNode {
	int data;
	treeNode leftNode;
	treeNode rightNode;
	
	public treeNode(int data) {
		super();
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

	public treeNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(treeNode leftNode) {
		this.leftNode = leftNode;
	}

	public treeNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(treeNode rightNode) {
		this.rightNode = rightNode;
	}

	@Override
	public String toString() {
		return "treeNode [data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
	}
	
	
}
