package com.sudheer.binary.tree.GettingLevelOfNodes;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeTest {

    public static void main(String args[]) {

        LevelOfNode levelOfNode = new LevelOfNode();
        levelOfNode.insert(3);
        levelOfNode.insert(5);
        levelOfNode.insert(9);
        levelOfNode.insert(2);
        levelOfNode.insert(4);
        levelOfNode.insert(10);
        levelOfNode.insert(6);
        levelOfNode.insert(8);

        System.out.println("Level : " + levelOfNode.gettingLevelOfNodeInTree(levelOfNode.getRootNode(), 3, 1));
        System.out.println("Level : " + levelOfNode.gettingLevelOfNodeInTree(levelOfNode.getRootNode(), 8, 1));
        System.out.println("Level : " + levelOfNode.gettingLevelOfNodeInTree(levelOfNode.getRootNode(), 10, 1));
        System.out.println("Level : " + levelOfNode.gettingLevelOfNodeInTree(levelOfNode.getRootNode(), 6, 1));

        /**

         Output:

         Level : 1
         Level : 5
         Level : 4
         Level : 4
         */

    }
}
