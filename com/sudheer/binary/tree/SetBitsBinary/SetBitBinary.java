package com.sudheer.binary.tree.SetBitsBinary;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Sudheer Babu Gutha
 * Date: 3/30/17
 * Time: 9:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class SetBitBinary {

    public static void main(String args[]) {
        final Scanner s = new Scanner(System.in);
        System.out.println(setBitsBinary(s.nextInt()));
    }

    public static int setBitsBinary(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
