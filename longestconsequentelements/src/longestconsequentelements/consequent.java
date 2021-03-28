package longestconsequentelements;

import java.util.Scanner;

public class consequent {

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
		getConsecutive(array);
	}

	private static void getConsecutive(int[] array) {
		// TODO Auto-generated method stub
		int count=0,longestS=0;
		for(int i=0;i<array.length;i++) {
			count=0;
			for(int j=i,series=array[i];j<(array.length);j++,series++) {
				if(array[j]==series)
					count++;
			}
			if(count>longestS)
				longestS=count;
		}
		System.out.println("Longest Consecutive Elements length is : "+longestS);
	}

}
