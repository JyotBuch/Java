//Codeforces 344 A https://codeforces.com/contest/344/problem/A

import java.util.*;

public class magnets {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        //String rev=sc.next();
        int t=0;
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }
        String prev=s[0];
        int count=0;
        for(int i=0;i<s.length;i++)
        {
            if(!s[i].equals(prev))
            {
                count++;
                prev=s[i];
            }
            
        }
        System.out.println(count+1);
    }
}
