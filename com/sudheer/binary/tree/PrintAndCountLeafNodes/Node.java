package com.sudheer.binary.tree.PrintAndCountLeafNodes;

/**
 * Created by Sudheer Babu Gutha.
 */
public class Node {

    //Represents Left Node of the tree
    private Node left;

    //Represents Right Node of the tree
    private Node right;

    //The value to be inserted or deleted from the tree
    private int value;


    //Value will be injected from single parameterized constructor
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    //Getters and Setters start here
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

    //Getters and Setters ends here


    //Print value
    public void printValue() {
        System.out.println(this.getValue());
    }

}
