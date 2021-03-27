import java.util.*;
public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements do you want to enter in the array?");
		int x=sc.nextInt();
		int array[]= new int[x];
		for(int i=0;i<x;i++)
		{
			array[i]=sc.nextInt();
		}
		int SL = getSL(array,x);
		System.out.println("Second largest number is : "+SL);
	}

	private static int getSL(int[] array,int range) {
		// TODO Auto-generated method stub
		int temp;
		if((range)==1)
			return 0;
		for(int i=0;i<range-1;i++)
		{
			for(int j=i+1;j<range;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array[1];
	}

}
