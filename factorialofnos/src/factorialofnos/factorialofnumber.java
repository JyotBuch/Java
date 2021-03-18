package factorialofnos;

import java.util.Scanner;

public class factorialofnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Factorial of a Number Program");
		System.out.println("Enter the number");
		int x =sc.nextInt();
		getFactorial(x);
		sc.close();
	}

	public static void getFactorial(int x) {
		// TODO Auto-generated method stub
		int pro=1;
		for(int i=1;i<=x;i++)
			pro=pro*i;
		System.out.println("Factorial is: " +pro);
	}
	

}
