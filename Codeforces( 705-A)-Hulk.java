//Codeforces 705 A https://codeforces.com/problemset/problem/705/A

import java.util.Scanner;

public class hulk {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String str="";
        if(n%2!=0)
            str = "I hate it\n";
        else
            str = "I hate that I love it\n";
        if(n%2 == 0) {
            for(int i=2;i<=n/2;i++)
                str = "I hate that I love that " + str;
            }
        else 
        {
            for(int i=1;i<=n/2;i++)
                str = "I hate that I love that " + str;
        }
        System.out.println(str);
    }
}
