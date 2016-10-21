package com.sudheer.binary.tree.DepthFirstSearch.postorder;

/**
 * Created by Sudheer Babu Gutha
 */
public class BinaryTest {

    public static void main(String args[]) {
        BinaryTreePostOrder binaryTreePostOrder = new BinaryTreePostOrder();
        binaryTreePostOrder.insert(3);
        binaryTreePostOrder.insert(5);
        binaryTreePostOrder.insert(9);
        binaryTreePostOrder.insert(2);
        binaryTreePostOrder.insert(4);
        binaryTreePostOrder.insert(10);
        binaryTreePostOrder.insert(6);
        binaryTreePostOrder.insert(8);

        binaryTreePostOrder.postOrderTraversal(binaryTreePostOrder.getRootNode());
    }
}
