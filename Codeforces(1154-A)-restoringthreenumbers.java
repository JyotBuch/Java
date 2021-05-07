//Codeforces 1154 A https://codeforces.com/problemset/problem/1154/A

import java.util.Scanner;

public class restoringthreenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 0, i; int arr[]=new int[5];
	    for (i = 0; i<4; i++)
	    {
            arr[i]=sc.nextInt();
		    if (arr[i]>k)
		    {
			    k = arr[i];
 
		    }
	    }
	    for (i = 0; i<4; i++)
	    {
		    if (k>arr[i])
		    {
                System.out.print(k-arr[i]+ " ");
		    }
	    }
    }
}
