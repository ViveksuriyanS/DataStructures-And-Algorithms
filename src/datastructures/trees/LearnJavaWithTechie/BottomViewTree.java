package datastructures.trees.LearnJavaWithTechie;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BottomViewTree {
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
            topView.put(horizontalDistance, currNode.getData());

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