package arraytoleft;

import java.util.Scanner;

public class movearray {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Left rotation of array Java Program");
		System.out.print("How many elements do you want to Enter?: ");
		int n = sc.nextInt();
		System.out.print("By what margin do you want to rotate elements  to the left?: ");
		int x = sc.nextInt();
		int arr1[] = new int[n];
		arr1 = getArray(n);
		leftrotate(arr1,n,x);
		sc.close();
	}

	public static void leftrotate(int[] arr1, int size, int margin) {
		// TODO Auto-generated method stub
		int i, temp;
        
        for(int j=0;j<margin;j++)
        {
        	temp = arr1[0];
        	for (i = 0; i < size - 1; i++)
        		arr1[i] = arr1[i + 1];
        	arr1[size-1] = temp;
        }
        for(i=0;i<size;i++)
        	System.out.println(arr1[i]+" ");
        
	}

}
