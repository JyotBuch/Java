package powerrecursion;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int base = sc.nextInt();
		int value=base;
		System.out.println("To what power do you want this to be raised?");
		int power = sc.nextInt();
		value=getPower(base,power);
		System.out.println(value);
	}

	private static  int getPower(int base,int power) {
		// TODO Auto-generated method stub
			if(power>0)
				return(base*getPower(base,power-1));
			else
				return 1;
	}
}
