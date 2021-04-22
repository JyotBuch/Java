//Codeforces 59 A https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class word {
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int uc=0,lc=0;
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                uc++;
            else
                lc++;
        }
            if(uc>lc)
                System.out.println(s.toUpperCase());
            else
                System.out.println(s.toLowerCase());
    }
}
