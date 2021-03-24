package removeduplicates;

import java.util.*;

public class removedupli {
	
	public static ArrayList<Integer> getArray(int size) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Array");
		for(int i=0;i<size;i++)
		{
			arr1.add(sc.nextInt());
		}
		sc.close();
		return arr1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Removal of duplicate elements in Array- Java Program");
		System.out.print("How many elements do you want to Enter?: ");
		int n = sc.nextInt();
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		arr1 = getArray(n);
		removeduplicates(arr1,n);
		sc.close();
	}

	public static void removeduplicates(ArrayList<Integer> arr1, int n) {
		// TODO Auto-generated method stub
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		boolean visited[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1; j<n; j++)
			{
				if(arr1.get(i)==arr1.get(j))
				{
					visited[j]=true;
				}
			}
			if(!visited[i])
			{
				newarr.add(arr1.get(i));
			}

		}
		System.out.println(newarr);
	}

}
