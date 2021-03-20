package displayallarmstrong;

import java.util.Scanner;

public class armstrongnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range (x-y) to find prime numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		getArmstrong(x,y);
		sc.close();
	}

	private static void getArmstrong(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=x;i<=y;i++)
		{
			int temp=i;double sum=0;
			while(temp!=0)
			{
				temp=temp%10;
				sum=sum+Math.pow(temp, 3);
				temp = temp/10;
			}
			if(sum==i)
				System.out.println(i+" is an Armstrong Number");
		}
	}

}
