package calculator;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Calculator Program(using switch case)");
		while(true) {
			System.out.println("Enter the 2 numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Enter Mathematical Operation");
			char operator = sc.next().charAt(0);
			switch(operator) 
			{
				case '+':System.out.println(a+b);
				break;
				case '-':System.out.println(a-b);
				break;
				case '*':System.out.println(a*b);
				break;
				case '/':System.out.println((double)a/b);
				break;
				case '^':System.out.println(Math.pow(a, b));
				break;
				default:System.out.println("Invalid Operator");
				break;
				}
			}
		}

}
