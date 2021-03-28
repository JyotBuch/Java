package findmissingnumber;
import java.util.*;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your range of numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int array[]=getArray(a,b);
		checkMissing(array,a,b);
	}

	private static void checkMissing(int[] array, int a, int b) {
		// TODO Auto-generated method stub
		boolean ans = false;
		for(int i=a;i<=b;i++) {
			for(int j=0;j<b-a+1;j++) {
				if(array[j]==i)
					ans=true;
				else
					ans=false;
			}
			if(!ans)
				System.out.println("Missing Element is "+i);
		}
	}

	private static int[] getArray(int a, int b) {
		// TODO Auto-generated method stub
		int array[] = new int[b-a];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all numbers within this range");
		for(int i=0;i<b-a;i++)
			array[i]=sc.nextInt();
		return null;
	}

}
