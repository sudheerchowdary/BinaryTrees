package com.sudheer.binary.tree.FindAllPathsInBinaryTree;

/**
 * Created by Sudheer Babu Gutha.
 */
public class FindAllPathsInBinaryTree {

    private Node rootNode;

    public FindAllPathsInBinaryTree() {
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

    //Find and print all paths
    public void findAndPrintAllPaths(Node node, int[] path, int length) {
        if (rootNode == null)
            return;

        path[length] = node.getValue();
        length++;

        if (node.getLeft() == null && node.getRight() == null) {
            for (int value = 0; value < length; value++) {
                System.out.print(path[value] + " ");
            }
            System.out.println();
            return;
        }
        if (node.getLeft() != null)
            findAndPrintAllPaths(node.getLeft(), path, length);
        if (node.getRight() != null)
        findAndPrintAllPaths(node.getRight(), path, length);
    }
}
