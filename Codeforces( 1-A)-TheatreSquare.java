//Codeforces 1 A https://codeforces.com/contest/1/problem/A

import java.util.Scanner;

public class theatre {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
        long m=sc.nextLong();
        long a=sc.nextLong();
        long countn=n/a;
        long countm=m/a;

        if(n%a != 0)    
        ++countn;

        if(m%a != 0)
        ++countm;

        System.out.println(countn*countm);
    }
}
