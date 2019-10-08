package datastructures.trees;

// Serialize Tree to String
public class SerializeBinaryTree {

	public static treeNode root;
	
	public static void main(String[] args) {
		createTree(1);
	}

	private static void createTree(int data) {
		treeNode node = new treeNode(data);
		if(root == null) {
			root = node;
		}
		
	}

}


// Converting the Tree as String is called Serialization