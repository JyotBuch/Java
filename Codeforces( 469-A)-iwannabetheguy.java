//Codeforces 469 A https://codeforces.com/contest/469/problem/A

import java.util.HashSet;
import java.util.Scanner;

public class iwannabetheguy {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int lilX[]=new int[x];
        HashSet <Integer> levels = new HashSet<>();
        for(int i=0;i<x;i++)
        {
            lilX[i]=sc.nextInt();
            levels.add(lilX[i]);
        }
        int y=sc.nextInt();
        int lilY[]=new int[y];
        for(int i=0;i<y;i++)
        {
            lilY[i]=sc.nextInt();
            levels.add(lilY[i]);
        }        
        if(levels.size()==n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
