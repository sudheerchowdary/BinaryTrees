package com.sudheer.binary.tree.SpiralBinaryTreeSearch;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeTest {

    public static void main(String args[]) {

        SpiralBinarySearchTree spiralBinarySearchTree = new SpiralBinarySearchTree();
        spiralBinarySearchTree.insert(3);
        spiralBinarySearchTree.insert(5);
        spiralBinarySearchTree.insert(9);
        spiralBinarySearchTree.insert(2);
        spiralBinarySearchTree.insert(4);
        spiralBinarySearchTree.insert(10);
        spiralBinarySearchTree.insert(6);
        spiralBinarySearchTree.insert(8);

        spiralBinarySearchTree.spiralOrderTraversal(spiralBinarySearchTree.getRootNode());

        //Output: 3,6,2,4,9,10,6,8
    }
}
