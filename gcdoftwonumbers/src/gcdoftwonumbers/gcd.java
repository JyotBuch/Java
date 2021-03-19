package gcdoftwonumbers;
import java.util.*;

public class gcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int hcf= getGCD(x,y);
		System.out.println("Greatest common factor is :"+hcf);
		sc.close();
	}

	private static int getGCD(int x, int y) {
		// TODO Auto-generated method stub
		int max=getMax(x,y);
		int hcf=1;
		for(int i=1;i<max;i++)
		{
			if(x%i==0 && y%i==0)
				hcf=i;
			else
				break;
		}
		return hcf;
	}

	private static int getMax(int x, int y) {
		// TODO Auto-generated method stub
		if(x>y)
			return x;
		else if(y>x) 
			return y;
		else
			return x;
	}

}
