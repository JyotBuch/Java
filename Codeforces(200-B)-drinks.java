//Codeforces 200 B https://codeforces.com/contest/200/problem/B

import java.util.Scanner;

public class drinks {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long drinks[]=new long[(int)n];
        //long average=0;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            drinks[i]=sc.nextLong();
            sum+=drinks[i];
        }
        System.out.println((double)sum/drinks.length);
        
    }
}
