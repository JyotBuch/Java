package primebwrange;
import java.util.*;

public class primenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range (x-y) to find prime numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		getPrime(x,y);
		sc.close();
	}

	private static void getPrime(int x, int y) {
		// TODO Auto-generated method stub
		int count;
		for(int i=x;i<=y;i++)
		{	count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count>2)
				continue;
			else
				System.out.println(i);
		}
	}
}
