//Java Program to Calculate the Power of a Number

package poweriterative;
import java.util.*;

public class powerofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base and Exponential Respectively");
		int base=sc.nextInt();
		int expo=sc.nextInt();
		int power=getPower(base,expo);
		System.out.println("Base :"+base+" Exponential :"+expo+" Value :"+power);
	}

	private static int getPower(int base, int expo) {
		// TODO Auto-generated method stub
		int value=1;
		while(expo!=0)
		{
			value=value*base;
			--expo;
		}
		return value;
	}

}
