package com.sudheer.binary.tree.TreeSubtree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Sudheer Babu Gutha
 * Date: 3/29/17
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeSubTree {

    public static void main(String args[]) {

        final List<Character> inOrderList = new ArrayList<>();
        final List<Character> postOrderList = new ArrayList<>();
        InOrderPostOrderTree tree1 = new InOrderPostOrderTree(inOrderList, postOrderList);
        tree1.insert('z');
        tree1.insert('e');
        tree1.insert('k');
        tree1.insert('x');
        tree1.insert('b');
        tree1.insert('a');
        tree1.insert('c');
        tree1.inOrderTraversal(tree1.getRootNode());
        tree1.postOrderTraversal(tree1.getRootNode());

        final List<Character> inOrderList1 = new ArrayList<>();
        final List<Character> postOrderList1 = new ArrayList<>();
        InOrderPostOrderTree tree2 = new InOrderPostOrderTree(inOrderList1, postOrderList1);
        tree2.insert('x');
        tree2.insert('a');
        tree2.insert('b');
        tree2.insert('c');
        tree2.inOrderTraversal(tree2.getRootNode());
        tree2.postOrderTraversal(tree2.getRootNode());

        if (inOrderList.containsAll(inOrderList1) && postOrderList.containsAll(postOrderList1)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
