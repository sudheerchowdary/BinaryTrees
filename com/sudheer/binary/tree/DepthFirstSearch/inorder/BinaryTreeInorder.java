package com.sudheer.binary.tree.DepthFirstSearch.inorder;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeInorder {

    private Node rootNode;

    //Default constructor - assign rootNode to null
    public BinaryTreeInorder() {
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

    //Inorder traversal
    //left-root-right
    public void inOrderTravesal(Node node) {
        if (node != null) {
            inOrderTravesal(node.getLeft());
            node.printValue();
            inOrderTravesal(node.getRight());
        }
    }
}
