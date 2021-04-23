//Codeforces 110 A https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;
import java.util.regex.*;

public class nearlyluckynumber {
    public static void main(String [] args)
    {
        Scanner reader = new Scanner(System.in);
		String n = reader.next();
		int count=0;
		for(int i=0; i<n.length(); i++)
    		if(n.charAt(i)=='4' || n.charAt(i)=='7')
    		    ++count;
                System.out.println(count);
		if(count == 7 || count == 4)
		    System.out.println("YES");
		else
		    System.out.println("NO");
    }
}
