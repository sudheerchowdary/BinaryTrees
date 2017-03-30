package com.sudheer.binary.tree.TreeSubtree;

/**
 * Created with IntelliJ IDEA.
 * User: Sudheer Babu Gutha
 * Date: 3/29/17
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    //Represents Left Node of the tree
    private Node left;

    //Represents Right Node of the tree
    private Node right;

    //The value to be inserted or deleted from the tree
    private char value;


    //Value will be injected from single parametrized constructor
    public Node(char value) {
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

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    //Print value
    public void printValue() {
        System.out.println(this.getValue());
    }
}
