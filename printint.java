//Java Program to Print an Integer (Entered by the User)

package printinginteger;
import java.util.*;

public class printint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		System.out.println("Your number is : "+x);
		sc.close();
	}

}
