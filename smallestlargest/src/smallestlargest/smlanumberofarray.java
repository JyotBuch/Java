package smallestlargest;
import java.util.*;

public class smlanumberofarray {

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
		getbiggestandsmallestnumber(array);
	}

	private static void getbiggestandsmallestnumber(int[] array) {
		// TODO Auto-generated method stub
		int small = array[0];
		int large=small;
		for(int i=1;i<array.length;i++) {
			if(array[i]>large)
				large=array[i];
			else if(array[i]<small)
				small=array[i];
		}
		System.out.println("The Largest Number is "+large+" and the Smallest number is "+small);
	}

}
