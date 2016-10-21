package com.sudheer.binary.tree.DepthFirstSearch.preorder;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreePreOrder {

    private Node rootNode;

    //Default constructor - assign rootNode to null
    public BinaryTreePreOrder() {
        this.rootNode = null;
    }

    //Inserting value into the node
    public void insert(int value) {
        Node node = new Node(value);

        if (rootNode == null) {
            rootNode = node;
        } else {
            Node parentNode = rootNode;
            Node childNode = rootNode;

            while (childNode != null) {
                parentNode = childNode;
                if (value < childNode.getValue()) {
                    childNode = childNode.getLeft();
                } else {
                    childNode = childNode.getRight();
                }
            }

            if (value < parentNode.getValue()) {
                parentNode.setLeft(node);
            } else {
                parentNode.setRight(node);
            }
        }
    }

    public Node getRootNode() {
        return this.rootNode;
    }

    //Preorder traversal
    //root-left-right
    public void preOrderTravesal(Node node) {
        if (node != null) {
            node.printValue();
            preOrderTravesal(node.getLeft());
            preOrderTravesal(node.getRight());
        }
    }
}
