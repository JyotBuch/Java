//Java Program to Count Number of Digits in an Integer

package countdigits;
import java.util.*;

public class countnoofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		long x=sc.nextLong();
		int count=countdigits(x);
		System.out.println("It has "+count+" digits");
		sc.close();
	}

	private static int countdigits(long x) {
		// TODO Auto-generated method stub
		int count=0;
		while(x!=0)
		{
			x=x/10;
			count++;
		}
		return count;
	}

}
