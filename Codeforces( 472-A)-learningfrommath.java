//Codeforces 472 A https://codeforces.com/contest/472/problem/A

import java.util.Scanner;

public class learnfrommath {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int a,b;
        for(int i=1;i<=x;i++)
        {
            a=i;
            b=x-i;
            if(isComposite(a) && isComposite(b))
            {   
                System.out.println(a+" "+b);
                System.exit(0);
            }
        }
    }

    private static boolean isComposite(int n) {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count>2)
            return true;
        else return false;
    }
}
