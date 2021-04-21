//Codeforces 158 A https://codeforces.com/problemset/problem/158/A

import java.util.Scanner;

public class nextround {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int score[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            score[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(score[i]>=score[k-1] && score[i]>0)
            {
                count++;
            }
        }

        System.out.println(count);
    }

        
}
