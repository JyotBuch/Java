//Java Program to Multiply two Floating Point Numbers

package mulfloat;

import java.util.Scanner;

public class multiplyfloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Floating Points");
		float a= sc.nextFloat();
		float b= sc.nextFloat();
		multiply(a,b);
		sc.close();

	}

	private static void multiply(float a, float b) {
		// TODO Auto-generated method stub
		float c = a*b;
		System.out.println("The product of the two numbers enetered is: "+c);
	}

}
