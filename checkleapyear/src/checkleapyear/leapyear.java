//Java Program to Check Leap Year

package checkleapyear;
import java.util.*;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = sc.nextInt();
		boolean check =checkforleap(year);
		if(check==true)
			System.out.println("It is a leap year");
		else
			System.out.println("It is not a leap year");
		sc.close();
	}

	private static boolean checkforleap(int year) {
		// TODO Auto-generated method stub
		 if (year % 400 == 0)
	            return true;
	     
	        if (year % 100 == 0)
	            return false;
	     
	        if (year % 4 == 0)
	            return true;
	        return false;
	}

}
