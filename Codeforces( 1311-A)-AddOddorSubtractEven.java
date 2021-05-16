//Codeforces 1311 A https://codeforces.com/problemset/problem/1311/A

import java.util.Scanner;

public class addoddorsubtracteven{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int a,b;
	    while(t>0)
	    {
            a=sc.nextInt();
            b=sc.nextInt();

		    if(a==b)
                System.out.println("0");
		    else 
		    {
			    if(a<b&&(b-a)%2!=0)
                    System.out.println("1");
			    else if(a>b&&(a-b)%2==0)
                    System.out.println("1");
			    else System.out.println("2");
		    }
            t--;
	    }
    }

}
