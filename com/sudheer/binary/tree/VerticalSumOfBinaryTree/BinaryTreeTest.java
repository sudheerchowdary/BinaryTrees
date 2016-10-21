package com.sudheer.binary.tree.VerticalSumOfBinaryTree;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Sudheer Babu Gutha.
 */
public class BinaryTreeTest {

    public static void main(String args[]) {

        VerticalSumBinarySearchTree verticalSumBinarySearchTree = new VerticalSumBinarySearchTree();
        verticalSumBinarySearchTree.insert(3);
        verticalSumBinarySearchTree.insert(5);
        verticalSumBinarySearchTree.insert(9);
        verticalSumBinarySearchTree.insert(2);
        verticalSumBinarySearchTree.insert(4);
        verticalSumBinarySearchTree.insert(10);
        verticalSumBinarySearchTree.insert(6);
        verticalSumBinarySearchTree.insert(8);

        TreeMap<Integer,Integer> treeMap = new TreeMap<Integer, Integer>();
        verticalSumBinarySearchTree.verticalSumTraversal(verticalSumBinarySearchTree.getRootNode(),treeMap,0);

        for(Map.Entry entry: treeMap.entrySet()){
            System.out.println(entry.getValue());
        }

        //Output: 3,6,2,4,9,10,6,8
    }
}
