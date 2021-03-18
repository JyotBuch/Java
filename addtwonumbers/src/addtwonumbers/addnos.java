//Java Program to Add Two Integers

package addtwonumbers;
import java.util.*;

public class addnos {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int a= sc.nextInt();
		int b= sc.nextInt();
		add(a,b);
		sc.close();
		
	}

	private static void add(int a, int b) {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println("The addition of these two numbers is :"+c);
	}

}
