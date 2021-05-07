//Codeforces 427 A https://codeforces.com/problemset/problem/427/A

import java.util.Scanner;

public class policerecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int event;
        int police=0,untreated=0;
        for(int i=0;i<n;i++)
        {
            event = sc.nextInt();
            if(event<0)
            {
                if(police>0)
                {
                    police--;
                }
                else if(police==0)
                {
                    untreated++;
                }
            }
            else
            {
                police+=event;
            }
        }
        System.out.println(untreated);
    }
}
