package datastructures.trees.LearnJavaWithTechie;

import java.util.LinkedList;
import java.util.Queue;

public class LevelByLevelOrderTraversal {
    static Tree rootNode;

    public static void main(String[] args) {
        // Using 2 Queues
        //rootNode = BinaryTreeImplementation.createTree();
        //levelByLevelOrderPrint();

        // Using 1 Queue
        rootNode = BinaryTreeImplementation.createTree();
        levelByLevelOrderPrint1Queue();
    }

    private static void levelByLevelOrderPrint1Queue() {
        Queue<Tree> travQueue1 = new LinkedList<>();
        travQueue1.add(rootNode);
        travQueue1.add(null);
        Tree currNode;

        while (!travQueue1.isEmpty()) {
            currNode = travQueue1.remove();
            if (currNode == null) {
                if (!travQueue1.isEmpty()) {
                    travQueue1.add(null);
                }
                System.out.println();
            } else {
                System.out.print(currNode.getData() + "\t");
                if (currNode.getLeftNode() != null) {
                    travQueue1.add(currNode.getLeftNode());
                }
                if (currNode.getRightNode() != null) {
                    travQueue1.add(currNode.getRightNode());
                }
            }
        }
    }

    // Using 2 Queue
    private static void levelByLevelOrderPrint() {
        Queue<Tree> travQueue1 = new LinkedList<>();
        Queue<Tree> travQueue2 = new LinkedList<>();
        travQueue1.add(rootNode);
        Tree currNode;
        while (!travQueue1.isEmpty()) {
            currNode = travQueue1.remove();
            System.out.print(currNode.getData() + "\t");

            if (currNode.getLeftNode() != null) {
                travQueue2.add(currNode.getLeftNode());
            }
            if (currNode.getRightNode() != null) {
                travQueue2.add(currNode.getRightNode());
            }

            if (travQueue1.isEmpty()) {
                System.out.println();
                travQueue1.addAll(travQueue2);
                travQueue2.clear();
            }

        }
    }
}
