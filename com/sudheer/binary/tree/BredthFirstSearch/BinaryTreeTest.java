package com.sudheer.binary.tree.BredthFirstSearch;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeTest {

    public static void main(String args[]) {

        BinaryTreeLevelOrder binaryTreeLevelOrder = new BinaryTreeLevelOrder();
        binaryTreeLevelOrder.insertNode(3);
        binaryTreeLevelOrder.insertNode(5);
        binaryTreeLevelOrder.insertNode(9);
        binaryTreeLevelOrder.insertNode(2);
        binaryTreeLevelOrder.insertNode(4);
        binaryTreeLevelOrder.insertNode(10);
        binaryTreeLevelOrder.insertNode(6);
        binaryTreeLevelOrder.insertNode(8);

        binaryTreeLevelOrder.levelOrderTraversal(binaryTreeLevelOrder.getRootNode());

        //Output: 3,2,5,4,9,6,10,8
    }
}
