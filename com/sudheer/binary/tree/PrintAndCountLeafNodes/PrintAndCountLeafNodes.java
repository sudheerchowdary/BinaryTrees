package com.sudheer.binary.tree.PrintAndCountLeafNodes;

/**
 * Created by Sudheer Babu Gutha.
 */
public class PrintAndCountLeafNodes {

    private Node rootNode;
    public int leafCount = 0;

    public PrintAndCountLeafNodes() {
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

    //Printing leaf nodes Starts
    public void leafNodePrint(Node node) {
        if (node == null)
            return;
        if (node.getLeft() == null && node.getRight() == null) {
            node.printValue();
            leafCount++;
        }
        leafNodePrint(node.getLeft());
        leafNodePrint(node.getRight());
    }
    //Printing leaf nodes Ends


    //Counting Leafs
    public int getLeafCount() {
        return this.leafCount;
    }
}
