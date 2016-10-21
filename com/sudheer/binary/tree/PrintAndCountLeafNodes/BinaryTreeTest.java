package com.sudheer.binary.tree.PrintAndCountLeafNodes;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeTest {

    public static void main(String args[]) {

        PrintAndCountLeafNodes printAndCountLeafNodes = new PrintAndCountLeafNodes();
        printAndCountLeafNodes.insertNode(3);
        printAndCountLeafNodes.insertNode(5);
        printAndCountLeafNodes.insertNode(9);
        printAndCountLeafNodes.insertNode(2);
        printAndCountLeafNodes.insertNode(4);
        printAndCountLeafNodes.insertNode(10);
        printAndCountLeafNodes.insertNode(6);
        printAndCountLeafNodes.insertNode(8);

        printAndCountLeafNodes.leafNodePrint(printAndCountLeafNodes.getRootNode());

        System.out.println("Leaf Count: " + printAndCountLeafNodes.getLeafCount());

        //Output: 3,2,5,4,9,6,10,8
    }
}
