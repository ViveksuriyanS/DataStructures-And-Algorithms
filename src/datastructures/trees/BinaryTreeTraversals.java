package datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversals {

	static treeNodeX rootNode;

	public static void main(String[] args) {
		addNode(1);
		addNode(2);
		addNode(3);
		addNode(4);
		addNode(5);
		addNode(6);
		addNode(7);
		addNode(8);
		addNode(9);
		addNode(10);
		addNode(11);
		addNode(12);
		addNode(13);
		addNode(14);
		addNode(15);

		System.out.println("_____Level Order Traversal______");
		topBottomLevelTranversal();

		System.out.println("_____Level By Level Order Traversal______");
		topBottomLevelByLevelTranversal();

		System.out.println("_____Pre Order Traversal______");
		preOrderTraversal();

		System.out.println("_____Inorder Traversal______");
		inOrderTraversal();

		System.out.println("______Postorder Traversal_____");
		postOrderTraversal();

		System.out.println("______ZigZag Traversal_____");
		zigZagTraversal();

		System.out.println("_____Reverse Level Order Traversal______");
		reverseLevelOrderTraversal();

		System.out.println("_____Top Bottom Level Traversal______");
		topBottomLevelTranversal();

		System.out.println("_____Leaf Nodes count_____");
		countLeafNodes();

		System.out.println("_____Half Nodes count______");
		countHalfNodes();

		System.out.println("_____Full Nodes count______");
		countFullNodes();
	}

	// Uses Queue and left to right
	private static void topBottomLevelByLevelTranversal() {
		// Queue to store the current level
		Queue<treeNodeX> traverseQueue = new LinkedList<treeNodeX>();
		// Queue to store the next level
		Queue<treeNodeX> nextTraverseQueue = new LinkedList<treeNodeX>();
		treeNodeX tmpTraverse = rootNode;
		traverseQueue.add(tmpTraverse);
//		traverseQueue.add(null);
		while (!traverseQueue.isEmpty()) {
			treeNodeX popNode = traverseQueue.remove();
			if (popNode != null) {
				System.out.print(popNode.data + "\t");
				if (popNode.left != null) {
					nextTraverseQueue.add(popNode.left);
				}
				if (popNode.right != null) {
					nextTraverseQueue.add(popNode.right);
				}
				if (traverseQueue.isEmpty()) {
					traverseQueue.addAll(nextTraverseQueue);
					nextTraverseQueue.clear();
					System.out.println();
				}
			}
		}
	}

	// Uses 2 Stacks - one for currentLevel and another for Next Level
	// 1 time "left to right" and other time "right to left"
	public static void zigZagTraversal() {
		treeNodeX tempX = rootNode;
		Stack<treeNodeX> currentLevel = new Stack<treeNodeX>();
		Stack<treeNodeX> nextLevel = new Stack<treeNodeX>();
		currentLevel.push(tempX);
		boolean leftToRight = true;
		while (!currentLevel.isEmpty()) {
			treeNodeX popNode = currentLevel.pop();
			System.out.println(popNode.data);
			// In Stack First left will be added then Right
			if (leftToRight) {
				// Push left then right
				// While pop Right will be popped and then Left
				if (popNode.left != null) {
					nextLevel.add(popNode.left);
				}
				if (popNode.right != null) {
					nextLevel.add(popNode.right);
				}
			} else {
				if (popNode.right != null) {
					nextLevel.add(popNode.right);
				}
				if (popNode.left != null) {
					nextLevel.add(popNode.left);
				}
			}
			if (currentLevel.isEmpty()) {
				Stack<treeNodeX> exchange = nextLevel;
				nextLevel = currentLevel;
				currentLevel = exchange;
				leftToRight = !leftToRight;
			}

		}
	}

	// Insert left first then right, uses Stack
	// AB+
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
	// +AB
	public static void preOrderTraversal() {
		if (rootNode == null)
			return;
		Stack<treeNodeX> nodes = new Stack<treeNodeX>();
		nodes.push(rootNode);
		while (!nodes.isEmpty()) {
			treeNodeX currentNode = nodes.pop();
			System.out.println(currentNode.getData());
			// LIFO - Add right first to process later
			if (currentNode.getRight() != null)
				nodes.push(currentNode.getRight());
			// Add left at last to process first
			if (currentNode.getLeft() != null)
				nodes.push(currentNode.getLeft());
		}
	}

	// Insert left then right and uses stack
	// A+B
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
		// Queue is used for traversal
		Queue<treeNodeX> nodes = new LinkedList<>();
		// Stack is used for storing the traversing elements
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
		// If tree is an empty tree
		if (rootNode == null)
			return;

		// Set a root node to tempNode
		treeNodeX traverseNode = rootNode;
		// Declaring Queue
		Queue<treeNodeX> nodes = new LinkedList<>();
		nodes.add(traverseNode);
		while (!nodes.isEmpty()) {
			treeNodeX tmpNode = nodes.remove();

			// Print the current processing data
			System.out.println(tmpNode.getData());

			// Process left side
			if (tmpNode.getLeft() != null) {
				nodes.add(tmpNode.getLeft());
			}

			// Process right side
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