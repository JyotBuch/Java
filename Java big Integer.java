//Solution to https://www.hackerrank.com/challenges/java-biginteger/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        //Getting input in the form of Big Integer
        BigInteger x1 = new BigInteger(sc.next());
        BigInteger x2 = new BigInteger(sc.next());

        //Use Big Integer functions to get output
        System.out.println( x1.add(x2));
        System.out.println( x1.multiply(x2));
    }
}
