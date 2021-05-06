// Codeforces 581 A https://codeforces.com/problemset/problem/581/A

import java.util.Scanner;

public class vasyathehipster {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a >= b)
    {
        a -= b;
        a /= 2;
        System.out.println(b+" "+a);
    }
    else
    {
        b -= a;
        b /= 2;
        System.out.println(a+" "+b);
    }
    }
}
