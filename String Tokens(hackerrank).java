//Solution to https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
  String s=scan.nextLine();
//Complete the code
    if (s.trim().length()==0 || s.trim().length()>400000)//important to satisfy 9th test case.
    {
        System.out.println(0);
        return;
    }

    String words[]=s.trim().split("[ !,?.\\_'@]+");
    System.out.println(words.length);
    for (String word:words)
        System.out.println(word);
    }
}
