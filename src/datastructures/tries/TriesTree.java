package datastructures.tries;

import java.util.HashMap;
import java.util.Map;

public class TriesTree {

	public static TrieNode root;

	public TriesTree() {
		root = new TrieNode();
	}

	public static void main(String[] args) {
		TriesTree tree = new TriesTree();

		tree.insert("abcde");
		tree.insert("abde");
		tree.insert("abe");
		tree.insert("kgf");
	}

	public void insert(String input) {
		TrieNode currentNode = root;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			// Check the first node
			TrieNode node = currentNode.children.get(c);
			if (node == null) {
				node = new TrieNode();
				node.children.put(c, node);
			}
			currentNode = node;
		}
		currentNode.endOfString = true;
	}

	public void recursiveInsert(String inp) {
		recursiveInsert(root, 0, inp);
	}

	public void recursiveInsert(TrieNode currentNode, int index, String input) {
		if (index == input.length()) {
			currentNode.endOfString = true;
			return;
		}
		char ch = input.charAt(index);
		TrieNode node = currentNode.children.get(ch);
		if (node == null) {
			node = new TrieNode();
			node.children.put(ch, node);
		}

		recursiveInsert(node, index + 1, input); // We pass newly created node as current node
	}

	public boolean search(String input) {
		TrieNode currentNode = root;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			TrieNode node = currentNode.children.get(ch);
			if (node == null) {
				return false;
			}
			currentNode = node;
		}

		return currentNode.endOfString;
	}

	public boolean recursiveSearch(String input) {
		return recursiveSearch(root, 0, input);
	}

	public boolean recursiveSearch(TrieNode currentNode, int index, String input) {
		if (index == input.length()) {
			return currentNode.endOfString;
		}
		char ch = input.charAt(index);
		TrieNode node = currentNode.children.get(ch);
		if (node == null) {
			return false;
		}
		currentNode = node;

		return recursiveSearch(currentNode, index + 1, input);
	}

	public boolean recursiveDelete(String input) {
		return recursiveDelete(root, 0, input);
	}

	public boolean recursiveDelete(TrieNode currentNode, int index, String delInput) {
		if (index == delInput.length()) {
			// If the end of string = true then the string to be deleted is
			// present
			// end of string = false, return false (cannot be deleted)
			if (!currentNode.endOfString) {
				return false;
			}
			currentNode.endOfString = false;
			return currentNode.children.size() == 0;
		}

		char ch = delInput.charAt(index);
		TrieNode node = currentNode.children.get(ch);
		if (node == null) {
			return false;
		}

		boolean currentNodeChild = recursiveDelete(node, index + 1, delInput);

		if (currentNodeChild) {
			currentNode.children.remove(ch);
			return currentNode.children.size() == 0;
		}

		return true;
	}
}

class TrieNode {
	Map<Character, TrieNode> children;
	boolean endOfString;

	public TrieNode() {
		children = new HashMap<>();
		endOfString = false;
	}
}