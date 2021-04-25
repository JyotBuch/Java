//Codeforces 1030 A https://codeforces.com/contest/1030/problem/A

import java.util.Scanner;

public class searchofeasyproblem {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int codeeasy[]=new int[n];
        boolean hard=false;
        for(int i=0;i<n;i++)
        {
            codeeasy[i]=sc.nextInt();
            if(codeeasy[i]==1)
                hard=true;
        }
        if(hard)
        {
            System.out.println("HARD");
        }
        else{
            System.out.println("EASY");
        }
    }
}
