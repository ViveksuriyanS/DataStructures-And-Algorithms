package datastructures.trees.LearnJavaWithTechie;

import java.util.*;

public class TopViewTree {
    static Tree rootNode;

    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        topViewOfTree();
    }

    private static void topViewOfTree() {
        Queue<DistanceNodeTree> treeQueue = new LinkedList<>();
        Map<Integer, Integer> topView = new HashMap<>();
        Tree currNode = rootNode;
        int horizontalDistance = 0;
        treeQueue.add(new DistanceNodeTree(horizontalDistance, currNode));
        DistanceNodeTree tmpNode;
        while (!treeQueue.isEmpty()) {
            tmpNode = treeQueue.remove();
            horizontalDistance = tmpNode.horizontalDistance;
            currNode = tmpNode.node;

            // Don't replace values of nodes in topViewMap
            if (!topView.containsKey(horizontalDistance)) {
                topView.put(horizontalDistance, currNode.getData());
            }

            if (currNode.getLeftNode() != null) {
                treeQueue.add(new DistanceNodeTree(horizontalDistance - 1, currNode.getLeftNode()));
            }
            if (currNode.getRightNode() != null) {
                treeQueue.add(new DistanceNodeTree(horizontalDistance + 1, currNode.getRightNode()));
            }
        }

        for (Map.Entry<Integer, Integer> ent : topView.entrySet()) {
            System.out.println(ent.getKey() + "  " + ent.getValue());
        }

    }
}