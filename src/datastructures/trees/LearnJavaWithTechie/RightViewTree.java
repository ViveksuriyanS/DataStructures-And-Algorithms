package datastructures.trees.LearnJavaWithTechie;

import java.util.LinkedList;
import java.util.Queue;

public class RightViewTree {
    static Tree rootNode;
    static int level;

    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        // rightViewOfTree();
        Tree tmpNode = rootNode;
        rightViewOfTreeUsingRecursion(tmpNode, 0);
    }

    private static void rightViewOfTreeUsingRecursion(Tree tmpNode, int nodeLevel) {
        if (tmpNode == null) {
            return;
        }
        if (nodeLevel >= level) {
            System.out.println(tmpNode.getData());
            level++;
        }
        rightViewOfTreeUsingRecursion(tmpNode.getRightNode(), nodeLevel + 1);
        rightViewOfTreeUsingRecursion(tmpNode.getLeftNode(), nodeLevel + 1);
    }

    private static void rightViewOfTree() {
        // Implementing level order traversal
        Queue<Tree> travQueue = new LinkedList<>();
        travQueue.add(rootNode);
        travQueue.add(null);
        Tree currN;
        // Level order traversal -> Single Queue
        while (!travQueue.isEmpty()) {
            currN = travQueue.remove();
            if (currN == null) {
                if (!travQueue.isEmpty()) {
                    travQueue.add(null);
                    System.out.println();
                }
            } else {
                //  QUEUE  | 1 | null | 2 | 3 | null | 4 | 5 | 6 | 7 | null | null | ...
                // After removing treeNode from tree, peek if next node is null
                // then print.. We get 1, 3, 7
                if (travQueue.peek() == null) {
                    System.out.print(currN.getData() + "\t");
                }
                // Process left first
                if (currN.getLeftNode() != null) {
                    travQueue.add(currN.getLeftNode());
                }
                // Process right after left
                if (currN.getRightNode() != null) {
                    travQueue.add(currN.getRightNode());
                }
            }
        }
    }
}
