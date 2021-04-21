//Codeforces 281 A https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

public class wordCapitalization {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
        if(s.length()>0)
            s=s.substring(0, 1).toUpperCase()+s.substring(1);
        System.out.println(s);
    }
}
