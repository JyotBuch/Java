//Solution to https://www.hackerrank.com/challenges/java-strings-introduction/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len = A.length()+B.length();
        String higher; 
        higher = ((int)A.charAt(0)>(int)B.charAt(0)) ? "Yes":"No";
        String a,b;
        a = A.toUpperCase().charAt(0)+A.substring(1, A.length());
        b = B.toUpperCase().charAt(0)+B.substring(1, B.length());
        System.out.println(len); 
        System.out.println(higher); 
        System.out.println(a+" "+b);  
        
    }
}
