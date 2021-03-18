//Java Program to Compute Quotient and Remainder

package quoremofnumber;
import java.util.*;

public class qourem {
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divisor");
		int divisor = sc.nextInt();
		System.out.println("Enter Dividend");
		int dividend = sc.nextInt();
		getquorem(divisor,dividend);
		sc.close();
	}

	private static void getquorem(int divisor, int dividend) {
		// TODO Auto-generated method stub
		int quotient=dividend/divisor;
		int remainder=dividend%divisor;
		System.out.println("Your Quotient is :"+quotient+" and your Remainder is :"+remainder);
	}

}
