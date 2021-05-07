//Codeforces 732 A https://codeforces.com/problemset/problem/732/A

import java.util.Scanner;

public class buyashovel{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k, r, h = 1, i = 0, j = 1;
        boolean b = true;
        k=sc.nextInt();
        r=sc.nextInt();
        while (b) {
            i++;
            h = k * i;
            if (h % 10 == 0 || h % 10 == r) {
                b = false;
            }
        }
        System.out.print(i);
    }
}
