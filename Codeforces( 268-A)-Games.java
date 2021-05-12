//Codeforces 268 A https://codeforces.com/problemset/problem/268/A

import java.util.Scanner;

public class games {
    public static void main(String[] args) {
        int n,i,j,x,y,cnt=0;
        Scanner sc  = new Scanner(System.in);
        n=sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(i=0; i<n; i++)
        {
            x=sc.nextInt();
            y=sc.nextInt();
            a[i]=x;
            b[i]=y;
        }
        for(i=0; i<n; i++)
        {
            for(j=0; j<n; j++)
            {
                if(a[i]==b[j])
                {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
