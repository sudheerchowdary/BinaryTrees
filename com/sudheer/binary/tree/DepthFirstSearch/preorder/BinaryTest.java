package com.sudheer.binary.tree.DepthFirstSearch.preorder;

/**
 * Created by Sudheer Babu Gutha
 */
public class BinaryTest {

    public static void main(String args[]) {
        BinaryTreePreOrder binaryTreePreOrder = new BinaryTreePreOrder();
        binaryTreePreOrder.insert(3);
        binaryTreePreOrder.insert(5);
        binaryTreePreOrder.insert(9);
        binaryTreePreOrder.insert(2);
        binaryTreePreOrder.insert(4);
        binaryTreePreOrder.insert(10);
        binaryTreePreOrder.insert(6);
        binaryTreePreOrder.insert(8);

        binaryTreePreOrder.preOrderTravesal(binaryTreePreOrder.getRootNode());

        //Output -- 3,2,5,4,9,6,8,10
    }
}
