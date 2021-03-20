package factorsofnumber;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		getFactors(x);
		}

	private static void getFactors(int x) {
		// TODO Auto-generated method stub
		for(int i=1;i<=x;i++)
		{
			if(x%i==0)
				System.out.println(i+" is a factor");
		}
	}

}
