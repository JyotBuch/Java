package maxcontiguoussum;

import java.util.Scanner;

public class maxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter?");
		int x = sc.nextInt();
		int array[]= new int[x];int i=0;
		System.out.println("Enter you array");
		while(i<x) {
			array[i]=sc.nextInt();
			i++;
		}
		getMaxSum(array);
	}

	private static void getMaxSum(int[] array) {
		// TODO Auto-generated method stub
		int sum=0,longestS=0;
		for(int i=0;i<array.length;i++) {
			longestS=0;
			for(int j=i,series=array[i];j<(array.length);j++,series++) {
				if(array[j]==series)
					longestS+=series;
			}
			System.out.println(longestS);
			if(sum<longestS)
				sum=longestS;
		}
		
		System.out.println("Max sum of consecutive numbers is "+sum);
	}

}
