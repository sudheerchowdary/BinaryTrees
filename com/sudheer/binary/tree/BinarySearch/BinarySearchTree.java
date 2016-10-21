package com.sudheer.binary.tree.BinarySearch;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinarySearchTree {

    private Node rootNode;

    //Default constructor - assign rootNode to null
    public BinarySearchTree() {
        this.rootNode = null;
    }

    //Inserting value into the node
    public void insert(int value) {
        System.out.println("Inserting value " + value);
        //Creating node using value
        Node node = new Node(value);

        //If there are no nodes in the tree this node will be considered as root node
        //Else search will begin to insert node on left side or right side
        if (rootNode == null) {
            rootNode = node;
            System.out.println("Root node is " + node.getValue());
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
                System.out.println("Parent Node is " + parentNode.getValue());
                System.out.println("Node set Left " + value);
                parentNode.setLeft(node);
            } else {
                System.out.println("Parent Node is " + parentNode.getValue());
                System.out.println("Node set right " + value);
                parentNode.setRight(node);
            }
        }

    }
}
