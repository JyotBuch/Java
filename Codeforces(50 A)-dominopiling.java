//Codeforces 50 A https://codeforces.com/problemset/problem/50/A

import java.util.*;
public class dominopiling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m>=1 && m<=16 && n>=1 && n<=16)
            System.out.println((m*n)/2);
    }
}
