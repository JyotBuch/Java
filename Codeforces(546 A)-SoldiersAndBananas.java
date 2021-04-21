//Codeforces 546 A https://codeforces.com/problemset/problem/546/A

import java.util.Scanner;
public class SoldiersandBananas {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int amount=0,borrow=0;
        for(int i=1;i<=w;i++)
        {
            amount+=i*k;
            if(amount>n)
            {
                borrow=amount-n;
            }
        }
        System.out.println(borrow);
    }
}
