//Codeforces 136 A https://codeforces.com/contest/136/problem/A

import java.util.Scanner;

public class presents {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p[]=new int[n];
        int q[]=new int[n];
        int number;
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
        }
        for(int i=0;i<p.length;i++)
        {
            number=p[i];
            q[number-1]=i;
        }
        for(int i=0;i<q.length;i++)
        {
            System.out.print((q[i]+1)+" ");
        }
    }
}
