//https://codeforces.com/problemset/problem/1352/A

import java.util.Scanner;

public class sumofroundnumbers {
    public static void main (String[] args)
    {        
        int t;
        String s;
        
        Scanner sc = new Scanner(System.in);
        t= sc.nextInt();
        while(t>0)
        {
            s=sc.next();
            int count=0;
            int power=0;
            int rem=0;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)=='0')
                    count++;
            System.out.println(s.length()-count);
            int nos = Integer.valueOf(s);
            while(nos!=0)
            {
                rem=nos%10;
                nos=nos/10;
                if(rem!=0)
                {
                    System.out.print(rem*(int)Math.pow(10, power)+" ");
                    power++;
                }
                else 
                    power++;
                    continue;
            }
            System.out.println();
            t-=1;
        }
    }
}
