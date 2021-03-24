package removeduplicates;

import java.util.*;

public class removedupli {
	
	public static int[] getArray(int size) {
		// TODO Auto-generated method stub
		int[] arr=new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Removal of duplicate elements in Array- Java Program");
		System.out.print("How many elements do you want to Enter?: ");
		int n = sc.nextInt();
		int[] arr1=new int[n];
		arr1 = getArray(n);
		removeduplicates(arr1,n);
		sc.close();
	}

	public static void removeduplicates(int[] arr1, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr1[i]==arr1[j])
				{
					arr1[j]=0;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr1[i]+" ");
		}
	}

}
