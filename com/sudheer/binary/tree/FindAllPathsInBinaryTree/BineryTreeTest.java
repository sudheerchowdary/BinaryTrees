package com.sudheer.binary.tree.FindAllPathsInBinaryTree;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BineryTreeTest {

    public static void main(String args[]) {
        FindAllPathsInBinaryTree findAllPathsInBinaryTree = new FindAllPathsInBinaryTree();
        findAllPathsInBinaryTree.insertNode(3);
        findAllPathsInBinaryTree.insertNode(5);
        findAllPathsInBinaryTree.insertNode(9);
        findAllPathsInBinaryTree.insertNode(2);
        findAllPathsInBinaryTree.insertNode(4);
        findAllPathsInBinaryTree.insertNode(10);
        findAllPathsInBinaryTree.insertNode(6);
        findAllPathsInBinaryTree.insertNode(8);

        findAllPathsInBinaryTree.findAndPrintAllPaths(findAllPathsInBinaryTree.getRootNode(), new int[100], 0);

        //Output: 3,2
        //        3,5,4
        //        3,5,9,6,8
        //        3,5,9,10
    }
}
