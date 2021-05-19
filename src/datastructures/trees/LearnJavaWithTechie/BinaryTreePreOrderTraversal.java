package datastructures.trees.LearnJavaWithTechie;

import java.util.Stack;

public class BinaryTreePreOrderTraversal {
    static Tree rootNode;

    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        printPreorder();
    }

    // +AB
    private static void printPreorder() {
        Stack<Tree> preTrav = new Stack<>();
        Tree currNode = rootNode;
        preTrav.add(currNode);
        while (!preTrav.isEmpty()) {
            currNode = preTrav.pop();
            System.out.println(currNode.getData());
            if(currNode.getRightNode() != null) {
                preTrav.add(currNode.getRightNode());
            }
            if(currNode.getLeftNode() != null) {
                preTrav.add(currNode.getLeftNode());
            }

        }
    }

}
