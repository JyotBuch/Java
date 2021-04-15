//Solution to https://www.hackerrank.com/challenges/java-negative-subarray/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int count = 0;
    int[] a = new int[n];
    for (int i = 0; i < n; i++){
        int sum = 0;
        a[i] = in.nextInt();
        for (int j = i; j >= 0; j--){
            sum += a[j];
            if (sum < 0)
                count++;
        }
    }
    System.out.println(count);
    }
}
