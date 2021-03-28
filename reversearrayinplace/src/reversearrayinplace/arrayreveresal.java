package reversearrayinplace;

import java.util.Scanner;

public class arrayreveresal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("How many elements do you want to Enter?: ");
		int n = sc.nextInt();
		int arr1[] = new int[n];
		arr1 = getArray(n);
		reverse(arr1,n);
		sc.close();
	}
	
	public static int[] getArray(int size) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[size];
		System.out.println("Enter your Array");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}
	
	public static void reverse(int[] arr1, int size) {
		// TODO Auto-generated method stub
		int rem=0,temp=0;
		for(int i=(arr1.length-1)/2,j=arr1.length-1;i>=0;i--,j--) {
			rem=arr1.length-1-j;
			temp=arr1[rem];
			arr1[rem]=arr1[j];
			arr1[j]=temp;
		}
		for(int i=0;i<size;i++)
			System.out.println(arr1[i]);
        
	}

}
