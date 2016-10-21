package com.sudheer.binary.tree.VerticalSumOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Created by Sudheer Babu Gutha.
 */
public class VerticalSumBinarySearchTree {

    private Node rootNode;

    public VerticalSumBinarySearchTree() {
        this.rootNode = null;
    }

    //Getting root node
    public Node getRootNode() {
        return this.rootNode;
    }

    //Inserting values into binary tree
    public void insert(int value) {
        Node node = new Node(value);
        if (rootNode == null) {
            rootNode = node;
        } else {
            Node parentNode = rootNode;
            Node insertNode = rootNode;
            while (insertNode != null) {
                parentNode = insertNode;
                if (value < insertNode.getValue()) {
                    insertNode = insertNode.getLeft();
                } else {
                    insertNode = insertNode.getRight();
                }
            }
            if (value < parentNode.getValue()) {
                parentNode.setLeft(node);
            } else {
                parentNode.setRight(node);
            }
        }
    }

    //Vertical sum Traversal
    public void verticalSumTraversal(Node node, TreeMap<Integer, Integer> treeMap, int level) {
        if (node == null)
            return;

        verticalSumTraversal(node.getLeft(), treeMap, level - 1);

        if (treeMap.get(level) != null) {
            Integer sum = treeMap.get(level) + node.getValue();
            treeMap.put(level, sum);
        } else {
            treeMap.put(level, node.getValue());
        }

        verticalSumTraversal(node.getRight(), treeMap, level + 1);
    }
}
