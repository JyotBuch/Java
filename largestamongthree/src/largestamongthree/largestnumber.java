package largestamongthree;
import java.util.*;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int no1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int no2 = sc.nextInt();
		System.out.println("Enter 3rd Number");
		int no3 = sc.nextInt();
		max(no1,no2,no3);
		sc.close();
	}

	private static void max(int no1, int no2, int no3) {
		// TODO Auto-generated method stub
		if(no1>no2 && no1>no3)
			System.out.println(no1+" is the largest");
		else if(no2>no1 && no2>no3)
			System.out.println(no2+" is the largest");
		else if(no3>no1 && no3>no2)
			System.out.println(no3+" is the largest");
		else
			System.out.println("All are equal");
	}

}
