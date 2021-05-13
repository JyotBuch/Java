//Codeforces 749 A https://codeforces.com/problemset/problem/749/A

import java.util.Scanner;

public class bachgoldproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n % 2 == 1) {
            n /= 2;
            n--;
            //cout << n + 1 << endl << 3 << ' ';
            System.out.println(n+1);
            System.out.print("3 ");
        } else {
            n /= 2;
            //cout << n << endl;
            System.out.println(n);
        }
        
        for(int i = 0; i < n; i++) //cout << 2 << ' ';
            System.out.print("2 ");
        //cout << endl;
        System.out.println();
    }
}
