package datastructures.trees.LearnJavaWithTechie;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfAllNodes {
    static Tree rootNode;

    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        int sum = sumOfAllNode();
        System.out.println("Sum of all node values from tree is " + sum);
    }

    private static int sumOfAllNode() {
        int sum = 0;
        Queue<Tree> queue = new LinkedList<>();
        Tree currNode = rootNode;
        queue.add(currNode);
        while (!queue.isEmpty()) {
            currNode = queue.remove();
            sum += currNode.getData();
            if (currNode.getLeftNode() != null) {
                queue.add(currNode.getLeftNode());
            }
            if (currNode.getRightNode() != null) {
                queue.add(currNode.getRightNode());
            }
        }
        return sum;
    }
}
