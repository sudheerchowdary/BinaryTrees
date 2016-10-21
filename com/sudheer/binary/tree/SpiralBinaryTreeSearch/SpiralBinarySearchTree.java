package com.sudheer.binary.tree.SpiralBinaryTreeSearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sudheer Babu Gutha.
 */
public class SpiralBinarySearchTree {

    private Node rootNode;

    public SpiralBinarySearchTree() {
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

    //Spiral Order Traversal
    public void spiralOrderTraversal(Node node) {
        if (node != null) {
            Queue<Node> nodeQueue = new LinkedList<Node>();
            nodeQueue.add(node);

            boolean traverseDirection = false;
            while (!nodeQueue.isEmpty()) {
                Node traverseNode = nodeQueue.poll();
                traverseNode.printValue();
                if (traverseDirection) {
                    if (traverseNode.getLeft() != null)
                        nodeQueue.add(traverseNode.getLeft());
                    if (traverseNode.getRight() != null)
                        nodeQueue.add(traverseNode.getRight());
                } else {
                    if (traverseNode.getRight() != null)
                        nodeQueue.add(traverseNode.getRight());
                    if (traverseNode.getLeft() != null) {
                        nodeQueue.add(traverseNode.getLeft());
                    }
                }
                traverseDirection = !traverseDirection;
            }
        }
    }
}
