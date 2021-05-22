//Codeforces 151 A https://codeforces.com/problemset/problem/151/A

import java.util.Scanner;

public class softdrinkstoast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, l, c, d, p, nl, np;
        n = sc.nextInt();
        k = sc.nextInt();
        l= sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl= sc.nextInt();
        np = sc.nextInt();
        System.out.println(Math.min(Math.min(k * l / nl, c * d), p / np) / n);
    }
}
