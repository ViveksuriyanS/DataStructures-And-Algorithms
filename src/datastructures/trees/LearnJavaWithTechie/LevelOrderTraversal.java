package datastructures.trees.LearnJavaWithTechie;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    static Tree rootNode;
    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        levelOrderTraversal();
    }

    // 1 2 3 4 5 6 7
    private static void levelOrderTraversal() {
        Queue<Tree> treeQueue = new LinkedList<>();
        Tree currNode = rootNode;
        treeQueue.add(currNode);
        while (!treeQueue.isEmpty()) {
            currNode = treeQueue.remove();
            System.out.println(currNode.getData());
            if (currNode.getLeftNode() != null) {
                treeQueue.add(currNode.getLeftNode());
            }
            if (currNode.getRightNode() != null) {
                treeQueue.add(currNode.getRightNode());
            }
        }
    }
}
