//Codeforces 476 A https://codeforces.com/contest/467/problem/A

import java.util.Scanner;

public class georgeandaccomodation {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);        
        int n=sc.nextInt();
        int p[]=new int[n];
        int q[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            p[i]=sc.nextInt();
            q[i]=sc.nextInt();
            if(q[i]-p[i]>=2)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
