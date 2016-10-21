package com.sudheer.binary.tree.BredthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeLevelOrder {

    private Node rootNode;

    public BinaryTreeLevelOrder() {
        this.rootNode = null;
    }

    //Get the root node
    public Node getRootNode() {
        return this.rootNode;
    }

    //Inserting nodes into tree Starts
    public void insertNode(int value) {

        Node node = new Node(value);

        if (rootNode == null) {
            this.rootNode = node;
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
    //Inserting nodes into tree Ends

    //Level Order Traversal Starts
    public void levelOrderTraversal(Node node) {
        Queue<Node> nodeQueue = new LinkedList<Node>();
        nodeQueue.add(node);

        while (!nodeQueue.isEmpty()) {
            Node traverseNode = nodeQueue.poll();
            traverseNode.printValue();
            if (traverseNode.getLeft() != null)
                nodeQueue.add(traverseNode.getLeft());
            if (traverseNode.getRight() != null)
                nodeQueue.add(traverseNode.getRight());
        }
    }
    //Level Order Traversal Ends
}
