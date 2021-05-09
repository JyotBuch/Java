//Codeforces 432 A https://codeforces.com/problemset/problem/432/A

import java.util.Scanner;

public class choosingteams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,i,cnt=0;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        for(i=0;i<n;i++){
            if(5-a[i]>=k)
                cnt++;
        }
        System.out.println(cnt/3);
    }
}
