//Solution to https://www.hackerrank.com/challenges/java-regex/problem

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex{
    /*
        [01]?\\d{1,2} matches numbers 0-199
        2[0-4]\\d matches number 200-249
        25[0-5] matches numbers 250-255
    */
    String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num+"."+num+"."+num+"."+num;
    }
