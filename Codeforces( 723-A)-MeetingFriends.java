//Codeforces 723 A https://codeforces.com/problemset/problem/723/A

import java.util.Scanner;

public class meetingfriends{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println(Math.max(a, Math.max(b,c))-Math.min(a, Math.min(b,c)));
    }
}
