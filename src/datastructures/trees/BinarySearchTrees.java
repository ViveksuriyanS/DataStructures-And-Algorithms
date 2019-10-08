package datastructures.trees;

public class BinarySearchTrees {

	private static BSTNode root;

	public static void main(String[] args) {
		BSTNode bst = new BSTNode();
		root = bst.addNode(root, 8);
		root = bst.addNode(root, 3);
		root = bst.addNode(root, 6);
		root = bst.addNode(root, 10);
		root = bst.addNode(root, 4);
		root = bst.addNode(root, 7);
		root = bst.addNode(root, 1);
		root = bst.addNode(root, 14);

	}

}

class BSTNode {
	int data;
	BSTNode leftNode;
	BSTNode rightNode;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public BSTNode getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(BSTNode leftNode) {
		this.leftNode = leftNode;
	}

	public BSTNode getRightNode() {
		return rightNode;
	}

	public void setRightNode(BSTNode rightNode) {
		this.rightNode = rightNode;
	}

	public BSTNode addNode(BSTNode node, int value) {
		if (node == null) {
			return createNode(value);
		}

		if (value < node.getData()) {
			node.setLeftNode(addNode(node.getLeftNode(), value));
		} else if (value > node.getData()) {
			node.setRightNode(addNode(node.getRightNode(), value));
		}

		return node;
	}

	public BSTNode minNode(BSTNode node) {
		BSTNode tmp = node;

		while (tmp != null) {
			tmp = node.getLeftNode();
		}

		return tmp != null ? tmp : null;
	}

	public BSTNode maxNode(BSTNode node) {
		BSTNode tmp = node;

		while (tmp != null) {
			tmp = tmp.getRightNode();
		}

		return tmp != null ? tmp : null;
	}

	public BSTNode getInorderParent(BSTNode node, int val) {

		if (node == null) {
			return null;
		}

		BSTNode inorderParent = null;

		while (node != null) {
			if (val < node.getData()) {
				inorderParent = node;
				node = node.getLeftNode();
			} else if (val > node.getData()) {
				node.getRightNode();
			} else {
				break;
			}
		}

		return node != null ? inorderParent : null;
	}

	public BSTNode getInorderSuccessor(BSTNode node, int val) {
		if (node == null) {
			return null;
		}

		BSTNode inorderSuccessor = null;

		while (node != null) {
			if (val < node.getData()) {
				inorderSuccessor = node;
				node = node.getLeftNode();
			} else if (val > node.getData()) {
				node = node.getRightNode();
			} else {
				if(node.getRightNode() != null) {
					inorderSuccessor = getSuccessor(node);
				}
				break;	
			}
		}

		return node != null ? inorderSuccessor : null;
	}

	public BSTNode getSuccessor(BSTNode node) {
		if(node == null) {
			return null;
		}
		// the bigger value of node will stay in right side of the node A
		// If the node A has any left side values then the left most value is the successor 
		BSTNode temp = node.getRightNode();
		
		while(temp.getLeftNode() != null) {
			temp = node.getLeftNode();
		}
		
		return temp;
	}
	
	public int getOddEventLevelDifference(BSTNode node) {
		if (node == null) {
			return 0;
		} 
		
		return node.getData() - getOddEventLevelDifference(node.getLeftNode()) - getOddEventLevelDifference(node.getRightNode());
	}
	
	public BSTNode getSibling(BSTNode node, int val) {
		if (node == null) {
			return null;
		}

		BSTNode parentNode = null;

		while (node != null) {
			if (val < node.getData()) {
				parentNode = node;
				node = node.getLeftNode();
			} else if (val > node.getData()) {
				parentNode = node;
				node = node.getRightNode();
			} else {
				break;
			}
		}

		BSTNode siblingNode = null;

		if (parentNode.getLeftNode().data == val) {
			siblingNode = getRightNode();
		}
		if (parentNode.getRightNode().data == val) {
			siblingNode = getLeftNode();
		}

		return node != null ? siblingNode : null;
	}

	public BSTNode getParent(BSTNode node, int val) {
		if (node == null) {
			return null;
		}

		BSTNode parentNode = null;

		while (node != null) {
			if (val < node.getData()) {
				parentNode = node;
				node = node.getLeftNode();
			} else if (val > node.getData()) {
				parentNode = node;
				node = node.getRightNode();
			} else {
				break;
			}
		}

		return node != null ? parentNode : null;
	}

	public BSTNode deleteNode(BSTNode node, int val) {
		if (node == null) {
			return null;
		}

		// Value is less than the root node, shift left
		if (val < node.getData()) {
			node.setLeftNode(deleteNode(node.getLeftNode(), val));
		}
		// value is greater than the root node, shift right
		else if (val > node.getData()) {
			node.setRightNode(deleteNode(node.getRightNode(), val));
		} // value is equal then we found the element to be deleted
		else {
			System.out.println("Element is found and to be deleted...");
			if (node.getLeftNode() == null || node.getRightNode() == null) {
				BSTNode temp = null;
				temp = node.getLeftNode() == null ? node.getRightNode() : node.getLeftNode();

				if (temp == null) {
					return null;
				} else {
					return temp;
				}
			} else {
				// Find the element to be replaced.
				BSTNode successorNode = Successor(node, val);
				node.setData(successorNode.getData());
				// Delete the element that was replaced
				node.setRightNode(deleteNode(successorNode.getRightNode(), successorNode.getData()));
				return node;
			}
		}

		return node;
	}

	public BSTNode Successor(BSTNode node, int val) {
		if (node == null) {
			return null;
		}

		BSTNode tmp = node.getRightNode();

		while (tmp != null) {
			tmp = tmp.getLeftNode();
		}

		return tmp;
	}

	public BSTNode createNode(int value) {
		BSTNode newNode = new BSTNode();
		newNode.setData(value);
		newNode.setLeftNode(null);
		newNode.setRightNode(null);

		return newNode;
	}

}