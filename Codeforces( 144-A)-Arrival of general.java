//Codeforces 144 A https://codeforces.com/contest/144/problem/A

import java.util.Scanner;


public class arrivalofgeneral {
    public static void main(String[] args)
    {
        Scanner sc  = new Scanner(System.in);
        int n=sc.nextInt();
        int minindex=n,maxindex=0,minvalue=1001,maxvalue=0;
        for(int i=0;i<n;i++)
        {
            int x;
            x=sc.nextInt();

            if(x>maxvalue){
                maxindex=i;
                maxvalue=x;
            }
             if(x<=minvalue){
                minindex=i;
                minvalue=x;
             }
        }
        System.out.println(maxindex + (n - 1 - minindex) - (minindex < maxindex ? 1 : 0));
    }
}
