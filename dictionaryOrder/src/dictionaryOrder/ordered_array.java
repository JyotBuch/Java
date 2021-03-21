package dictionaryOrder;
import java.util.*;

public class ordered_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int x=sc.nextInt();
		String arr[]=new String[x];
		System.out.println("Enter your words");
		for(int i=0;i<x;i++)
		{
			arr[i]=sc.next();
		}
		getOrder(arr,x);
		sc.close();
	}

	private static void getOrder(String[] arr, int x) {
		// TODO Auto-generated method stub
		String temp="";
		for(int i=0;i<x-1;i++)
		{
			for(int j=i+1;j<x;j++)
			{
				if(((int)arr[i].charAt(0))>((int)arr[j].charAt(0)))
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i =0;i<x;i++)
			System.out.println(arr[i]);
	}

}
