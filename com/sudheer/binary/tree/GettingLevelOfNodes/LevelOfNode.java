package com.sudheer.binary.tree.GettingLevelOfNodes;

/**
 * Created by Sudheer Babu Gutha.
 */
public class LevelOfNode {

    private Node rootNode;

    public LevelOfNode() {
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

    //Getting level of node
    public int gettingLevelOfNodeInTree(Node node, int nodeValue, int level) {
        if (node == null)
            return 0;
        if (node.getValue() == nodeValue)
            return level;

        int result = gettingLevelOfNodeInTree(node.getLeft(), nodeValue, level + 1);

        if (result != 0) {
            return result;
        }

        result = gettingLevelOfNodeInTree(node.getRight(), nodeValue, level + 1);
        return result;
    }
}
