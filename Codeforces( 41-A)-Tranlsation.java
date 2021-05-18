//Codeforces 41 A https://codeforces.com/contest/41/problem/A

import java.util.Scanner;

public class translation {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String t=sc.next();
        String s=sc.next();
        boolean result=true;
        for(int i=0,j=s.length()-1;i<t.length();i++,j--)
        {
            if(t.length()!=s.length())
            {
                result=false;
                //System.out.println("NO");
                break;
            }
            else if(s.charAt(i)!=t.charAt(j))
            {
                result=false;
                //System.out.println("NO");
                break;
            }
        }
        if(result)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
