//Codeforces 266 B https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class queueattheschool {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        String queue[]=new String[n];
        String q=sc.next();
        for(int i=0;i<n;i++)
        {
            queue[i]=q.substring(i,i+1);
        }
        for(int j=0;j<t;j++)
        {
            for (int p = 0; p < n; p++)
		{
			if (p+1<n && queue[p].equals("B") && queue[p + 1].equals("G"))
			{
				queue[p] = "G";
				queue[p + 1] = "B";
				p++;
			}
		}
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(queue[i]);
        }
    }
}
