//Codeforces 677 A https://codeforces.com/contest/677/problem/A

import java.util.Scanner;

public class venyaandfence {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]-h>0)
                count+=2;
            else
                count+=1;
        }
        System.out.println(count);
    }
}
