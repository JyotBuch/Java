package equalityofnos;
import java.util.*;
public class equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many elements do you want to enter in the first array??");
		int arr1[]=getElements();
		System.out.println("How many elements do you want to enter in the second array??");
		int arr2[]=getElements();
		boolean ans = checkequality(arr1,arr2);
		if(ans)
			System.out.println("Equal");
		else
			System.out.println("Unequal");
	}

	private static boolean checkequality(int[] arr1, int[] arr2) {
		// TODO Auto-generated method stub
		boolean ans=false;
		if(arr1.length!=arr2.length)
			return false;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]==arr2[i])
				ans=true;
				else return false;
		}
		return ans;
	}

	private static int[] getElements() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int arr[] = new int[x];
		System.out.println("Enter you array");
		for(int i=0;i<x;i++)
			arr[i]=sc.nextInt();
		return arr;
	}

}
