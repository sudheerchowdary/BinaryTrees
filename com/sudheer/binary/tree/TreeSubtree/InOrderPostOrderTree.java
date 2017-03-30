package com.sudheer.binary.tree.TreeSubtree;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sudheer Babu Gutha
 * Date: 3/29/17
 * Time: 8:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class InOrderPostOrderTree {

    private Node rootNode;
    private List<Character> inOrderList;
    private List<Character> postOrderList;

    //Default constructor - assign rootNode to null
    public InOrderPostOrderTree(List<Character> inOrderList, List<Character> postOrderList) {
        this.rootNode = null;
        this.inOrderList = inOrderList;
        this.postOrderList = postOrderList;
    }

    //Inserting value into the node
    public void insert(char value) {
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
    public void inOrderTraversal(final Node node) {
        if (node != null) {
            inOrderTraversal(node.getLeft());
            inOrderList.add(node.getValue());
            inOrderTraversal(node.getRight());
        }
    }

    //Post Order traversal
    //left-right-root
    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            postOrderList.add(node.getValue());
        }
    }
}
