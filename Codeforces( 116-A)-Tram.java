//Codeforces 116 A https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class tram {
    public static void main(String [] args)
        {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int a,b;
            int capacity=0,max=0;
            for(int i=1;i<=n;i++)
            {
                a=sc.nextInt();
                b=sc.nextInt();
                capacity-=a;
                capacity+=b;
                if(capacity>max)
                    max=capacity;
            }
            System.out.println(max);
        }
}
