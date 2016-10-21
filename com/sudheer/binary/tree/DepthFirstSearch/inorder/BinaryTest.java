package com.sudheer.binary.tree.DepthFirstSearch.inorder;

/**
 * Created by Sudheer Babu Gutha
 */
public class BinaryTest {

    public static void main(String args[]) {
        BinaryTreeInorder binaryTreeInorder = new BinaryTreeInorder();
        binaryTreeInorder.insert(3);
        binaryTreeInorder.insert(5);
        binaryTreeInorder.insert(9);
        binaryTreeInorder.insert(2);
        binaryTreeInorder.insert(4);
        binaryTreeInorder.insert(10);
        binaryTreeInorder.insert(6);
        binaryTreeInorder.insert(8);

        binaryTreeInorder.inOrderTravesal(binaryTreeInorder.getRootNode());

        //Output -- 3,4,5,6,8,9,10
    }
}
