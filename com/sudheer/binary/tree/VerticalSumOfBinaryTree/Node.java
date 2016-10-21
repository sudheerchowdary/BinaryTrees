package com.sudheer.binary.tree.VerticalSumOfBinaryTree;

/**
 * Created by Sudheer Babu Gutha.
 */
public class Node {

    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.left = null;
        this.right = null;
        this.value = value;
    }

    //Printing the node value in the console
    public void printValue() {
        System.out.println(this.getValue());
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
