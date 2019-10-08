package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversals {

	static treeNodeX rootNode;

	public static void main(String[] args) {
		addNode(5);
		addNode(6);
		addNode(7);
		addNode(8);
		addNode(9);
		topBottomLevelTranversal();
		
		System.out.println("___________");
		preOrderTraversal();
		
		System.out.println("___________");
		inOrderTraversal();
		
		System.out.println("___________");
		postOrderTraversal();
		
		System.out.println("___________");
		reverseLevelOrderTraversal();
		
		System.out.println("___________");
		topBottomLevelTranversal();
		
		System.out.println("___________");
		countLeafNodes();
		
		System.out.println("___________");
		countHalfNodes();
		
		System.out.println("___________");
		countFullNodes();
	}

	// Insert left first then right, uses Stack
	public static void postOrderTraversal() {
		if (rootNode == null)
			return;
		treeNodeX prevNode = null;
		Stack<treeNodeX> nodes = new Stack<treeNodeX>();
		nodes.push(rootNode);
		while (!nodes.isEmpty()) {
			treeNodeX currentNode = nodes.peek();
			if (prevNode == null || prevNode.getLeft() == currentNode || prevNode.getRight() == currentNode) {
				if (currentNode.getLeft() != null) {
					nodes.push(currentNode.getLeft());
				} else if (currentNode.getRight() != null) {
					nodes.push(currentNode.getRight());
				}
			} else if (currentNode.getLeft() == prevNode) {
				if (currentNode.getRight() != null) {
					nodes.push(currentNode.getRight());
				}
			} else {
				System.out.println(currentNode.getData());
				nodes.pop();
			}
			prevNode = currentNode;
		}

	}

	// Insert right first then left, uses stack
	public static void preOrderTraversal() {
		if (rootNode == null)
			return ;
		Stack<treeNodeX> nodes = new Stack<treeNodeX>();
		nodes.push(rootNode);
		while (!nodes.isEmpty()) {
			treeNodeX currentNode = nodes.pop();
			System.out.println(currentNode.getData());
			if (currentNode.getRight() != null)
				nodes.push(currentNode.getRight());
			if (currentNode.getLeft() != null)
				nodes.push(currentNode.getLeft());
		}
	}

	// Insert left then right and uses stack
	private static void inOrderTraversal() {
		// Return the call, if the root node is empty
		if (rootNode == null)
			return;

		// Initializing a boolean flag - traversal condition check
		boolean done = true;

		// Declaring a new stack to push/pop the nodes while traversing
		Stack<treeNodeX> nodes = new Stack<treeNodeX>();

		// Setting the current node with root node value to start traversal from root
		treeNodeX currentNode = rootNode;

		while (done) {
			if (currentNode != null) {
				nodes.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				if (nodes.isEmpty()) {
					done = false;
				} else {
					currentNode = nodes.pop();
					System.out.println(currentNode.data);
					currentNode = currentNode.getRight();
				}
			}
		}

	}


	// Insert right then left and uses Queue and Stack
	public static void reverseLevelOrderTraversal() {
		if (rootNode == null)
			return;
		treeNodeX traverseNode = rootNode;
		Queue<treeNodeX> nodes = new LinkedList<>();
		Stack<Integer> nodeVals = new Stack<Integer>();
		nodes.add(traverseNode);
		while (!nodes.isEmpty()) {
			treeNodeX tempNode = nodes.remove();
			nodeVals.push(tempNode.getData());
			if (tempNode.getRight() != null) {
				nodes.add(tempNode.getRight());
			}
			if (tempNode.getLeft() != null) {
				nodes.add(tempNode.getLeft());
			}
		}
		while (!nodeVals.isEmpty()) {
			System.out.println(nodeVals.pop());
		}
	}

	// Insert left then right, uses Queue
	public static void topBottomLevelTranversal() {
		if (rootNode == null)
			return;
		treeNodeX traverseNode = rootNode;
		Queue<treeNodeX> nodes = new LinkedList<>();
		nodes.add(traverseNode);
		while (!nodes.isEmpty()) {
			treeNodeX tmpNode = nodes.remove();
			System.out.println(tmpNode.getData());
			if (tmpNode.getLeft() != null) {
				nodes.add(tmpNode.getLeft());
			}
			if (tmpNode.getRight() != null) {
				nodes.add(tmpNode.getRight());
			}
		}
	}

	public static void addNode(int element) {
		// Creating object for temporary node
		treeNodeX tempNode = new treeNodeX();
		tempNode.setData(element);
		tempNode.setLeft(null);
		tempNode.setRight(null);
		// Check if the root node is null, if so set as root node
		if (rootNode == null) {
			rootNode = tempNode;
		} else {
			// Adding the root node to the 
			Queue<treeNodeX> treeNodeXs = new LinkedList<>();
			treeNodeXs.add(rootNode);
			// Checking additional
			while (!treeNodeXs.isEmpty()) {
				treeNodeX currentNode = treeNodeXs.remove();
				// Iterate left first check if left is occupied
				// and add it in the queue
				if (currentNode.getLeft() != null) {
					treeNodeXs.add(currentNode.getLeft());
				} else {
					currentNode.setLeft(tempNode);
					break;
				}
				// Iterate right also, whether it is occupied
				// If so add it in the queue
				if (currentNode.getRight() != null) {
					treeNodeXs.add(currentNode.getRight());
				} else {
					currentNode.setRight(tempNode);
					break;
				}
			}
		}
	}

	public static void countHalfNodes() {
		if (rootNode == null)
			return;
		Queue<treeNodeX> nodes = new LinkedList<>();
		int count = 0;
		nodes.add(rootNode);
		while (!nodes.isEmpty()) {
			treeNodeX tmpNode = nodes.remove();
			if (tmpNode.getLeft() == null && tmpNode.getRight() != null
					|| tmpNode.getLeft() != null && tmpNode.getRight() == null) {
				count++;
			}
			if (tmpNode.getLeft() != null) {
				nodes.add(tmpNode.getLeft());
			}
			if (tmpNode.getRight() != null) {
				nodes.add(tmpNode.getRight());
			}
		}
		System.out.println("There are " + count + " half nodes present in the tree.");
	}
	
	// Count number of floating nodes.
	public static void countLeafNodes() {
		if (rootNode == null)
			return;
		Queue<treeNodeX> nodes = new LinkedList<>();
		int count = 0;
		nodes.add(rootNode);
		while (!nodes.isEmpty()) {
			treeNodeX tmpNode = nodes.remove();
			
			if (tmpNode.getLeft() != null) {
				nodes.add(tmpNode.getLeft());
			}
			if (tmpNode.getRight() != null) {
				nodes.add(tmpNode.getRight());
			}
			// If a node doesn't have any child, they are called leaf nodes
			if (tmpNode.getLeft() == null && tmpNode.getRight() == null) {
				count++;
			}
		}
		System.out.println("There are " + count + " leaf nodes present in the tree.");
	}
	
	// Check if a root or sub-root node has both left and right nodes.
	public static void countFullNodes() {
		if (rootNode == null)
			return;
		Queue<treeNodeX> nodes = new LinkedList<>();
		int count = 0;
		nodes.add(rootNode);
		while (!nodes.isEmpty()) {
			treeNodeX tmpNode = nodes.remove();
			
			if (tmpNode.getLeft() != null) {
				nodes.add(tmpNode.getLeft());
			}
			if (tmpNode.getRight() != null) {
				nodes.add(tmpNode.getRight());
			}
			// Node with two children is called full node.
			if (tmpNode.getLeft() != null && tmpNode.getRight() != null) {
				count++;
			}
		}
		System.out.println("There are " + count + " full nodes present in the tree.");
	}
}

// Tree node class
class treeNodeX {
	int data;
	treeNodeX left;
	treeNodeX right;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public treeNodeX getLeft() {
		return left;
	}

	public void setLeft(treeNodeX left) {
		this.left = left;
	}

	public treeNodeX getRight() {
		return right;
	}

	public void setRight(treeNodeX right) {
		this.right = right;
	}

}