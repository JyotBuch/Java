//Codeforces 791 A https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        do{
            a=3*a;
            b=2*b;
            count++;
        }while(a<=b);
        System.out.print(count);
    }
}
