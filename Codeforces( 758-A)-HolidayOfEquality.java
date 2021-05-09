//Codeforces 758 A https://codeforces.com/problemset/problem/758/A

import java.util.Scanner;
 
public class holidayofequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int citizen[] = new int[n];
        int max=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            citizen[i]=sc.nextInt();
            if(citizen[i]>max)
                max=citizen[i];
        }
        for(int i=0;i<n;i++)
        {
            sum+=max-citizen[i];
        }
        System.out.println(sum);
    }
}
