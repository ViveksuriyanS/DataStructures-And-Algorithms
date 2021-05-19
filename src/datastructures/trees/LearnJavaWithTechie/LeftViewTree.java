package datastructures.trees.LearnJavaWithTechie;

import java.util.LinkedList;
import java.util.Queue;

public class LeftViewTree {
    static Tree rootNode;
    static int level;

    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        // leftViewOfTree();
        Tree tmpNode = rootNode;
        leftViewOfTreeUsingRecursion(tmpNode, 0);
    }

    private static void leftViewOfTreeUsingRecursion(Tree tmpNode, int nodeLevel) {
        if (tmpNode == null) {
            return;
        }
        if (nodeLevel >= level) {
            System.out.println(tmpNode.getData());
            level++;
        }
        leftViewOfTreeUsingRecursion(tmpNode.getLeftNode(), nodeLevel + 1);
        leftViewOfTreeUsingRecursion(tmpNode.getRightNode(), nodeLevel + 1);
    }

    private static void leftViewOfTree() {
        // Implementing level order traversal
        Queue<Tree> travQueue = new LinkedList<>();
        travQueue.add(rootNode);
        travQueue.add(null);
        Tree currN;
        while (!travQueue.isEmpty()) {
            currN = travQueue.remove();
            if (currN == null) {
                if (!travQueue.isEmpty()) {
                    travQueue.add(null);
                    System.out.println();
                }
            } else {
                //  QUEUE  | 1 | null | 3 | 2 | null | 7 | 6 | 5 | 4 | null | null | ...
                // After removing treeNode from tree, peek if next node is null
                // then print.. We get 1, 2, 4
                if (travQueue.peek() == null) {
                    System.out.print(currN.getData() + "\t");
                }
                // Process right first
                if (currN.getRightNode() != null) {
                    travQueue.add(currN.getRightNode());
                }
                // Process left first
                if (currN.getLeftNode() != null) {
                    travQueue.add(currN.getLeftNode());
                }

            }
        }
    }
}
