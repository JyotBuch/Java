//Codeforces 1374 A https://codeforces.com/problemset/problem/1374/A

import java.util.Scanner;
 
public class RequiredReminder {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        int t=sc.nextInt();
        int max=0;
        while(t>0)
        {
            solve();
            t-=1;
        }
    }
 
    private static void solve() {
        long x=sc.nextLong();
        long y=sc.nextLong();
        long n=sc.nextLong();
        long count=n/x;
        long ans=x*count+y;
        if(ans>n)
        {
            ans-=x;
        }
        System.out.println(ans);
    }
}
