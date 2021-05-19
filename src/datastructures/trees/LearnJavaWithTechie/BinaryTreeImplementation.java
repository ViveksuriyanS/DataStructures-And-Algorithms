package datastructures.trees.LearnJavaWithTechie;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeImplementation {
    static Tree rootNode;

    public static void main(String[] args) {
        createTree();
    }

    public static Tree createTree() {
        insertNode(1);
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        insertNode(6);
        insertNode(7);

        return rootNode;
    }

    private static void insertNode(int val) {
        Tree newNode = new Tree(val);
        if (rootNode == null) {
            rootNode = newNode;
        } else {
            Tree tmpNode;
            Queue<Tree> treeQueue = new LinkedList<>();
            treeQueue.add(rootNode);
            while (!treeQueue.isEmpty()) {
                tmpNode = treeQueue.remove();
                // Insert at left sub-tree
                if (tmpNode.getLeftNode() == null) {
                    tmpNode.setLeftNode(newNode);
                    break;
                } else {
                    treeQueue.add(tmpNode.getLeftNode());
                }
                // Insert at right sub-tree
                if (tmpNode.getRightNode() == null) {
                    tmpNode.setRightNode(newNode);
                    break;
                } else {
                    treeQueue.add(tmpNode.getRightNode());
                }
            }
        }
    }


}
