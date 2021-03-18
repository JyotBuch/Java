//Java Program to Swap Two Numbers

package swapnos;
import java.util.*;

public class swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int no1 = sc.nextInt();
		System.out.println("Enter number 2");
		int no2 = sc.nextInt();
		System.out.println("Number 1: "+no1+" & Number 2 is: "+no2);
		swapnos(no1,no2);
		sc.close();
	}

	private static void swapnos(int no1, int no2) {
		// TODO Auto-generated method stub
		int temp = no1;
		no1=no2;
		no2=temp;
		System.out.println("Number 1: "+no1+" & Number 2 is: "+no2);		
	}

}
