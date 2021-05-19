package datastructures.trees.LearnJavaWithTechie;

import java.util.*;

public class VerticalOrderTraversal {
    static Tree rootNode;

    public static void main(String[] args) {
        rootNode = BinaryTreeImplementation.createTree();
        verticalOrderTraverse();
    }

    private static void verticalOrderTraverse() {
        Queue<DistanceNodeTree> queue = new LinkedList<>();
        Map<Integer, List<Integer>> verticalMap = new HashMap();
        Tree currNode = rootNode;
        int horDistance = 0;
        queue.add(new DistanceNodeTree(horDistance, currNode));
        DistanceNodeTree tmp;


        // Using same level order traversal
        // Similar to TopViewTree and BottomView Tree

        while (!queue.isEmpty()) {
            tmp = queue.remove();
            horDistance = tmp.horizontalDistance;
            currNode = tmp.node;
            // Storing the traversed node as List
            // Key (horizontalDistance) => value (Node.getData())
            if (verticalMap.get(horDistance) == null) {
                List<Integer> list = new LinkedList<>();
                list.add(currNode.getData());
                verticalMap.put(horDistance, list); // Creating new list
            } else {
                verticalMap.get(horDistance).add(currNode.getData()); // Adding to existing list
            }

            if (currNode.getLeftNode() != null) {
                queue.add(new DistanceNodeTree(horDistance - 1, currNode.getLeftNode()));
            }
            if (currNode.getRightNode() != null) {
                queue.add(new DistanceNodeTree(horDistance + 1, currNode.getRightNode()));
            }
        }

        for (Map.Entry<Integer, List<Integer>> ent : verticalMap.entrySet()) {
            System.out.print(ent.getKey() + " -> ");
            System.out.print(ent.getValue().toString() + " \n");
        }
    }
}

