package com.sudheer.binary.tree.DepthFirstSearch.postorder;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreePostOrder {

    private Node rootNode;

    //Default constructor - assign rootNode to null
    public BinaryTreePostOrder() {
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


    //Post Order traversal
    //left-right-root
    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            node.printValue();
        }
    }
}
