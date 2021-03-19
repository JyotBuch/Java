package lcmoftwonumbers;
import java.util.*;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int lcm= getLCM(x,y);
		System.out.println("Least Common Multiple is :"+lcm);
		sc.close();

	}

	private static int getLCM(int x, int y) {
		// TODO Auto-generated method stub
		int gcd=getGCD(x,y);
		int max=getMax(x,y);
		int lcm=(x*y)/gcd;
		return lcm;
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
