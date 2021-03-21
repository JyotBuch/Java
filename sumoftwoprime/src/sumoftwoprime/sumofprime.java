package sumoftwoprime;
import java.util.*;

public class sumofprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr=getPrime(x);
		int l = arr.size();
		getSum(arr,l,x);
		sc.close();
		}

	private static void getSum(ArrayList<Integer> arr, int len, int target) {
		// TODO Auto-generated method stub
		int diff;
		for(int i= 0;i<len;i++)
		{
			diff=target-arr.get(i);
			for(int j=i+1;j<len;j++)
			{
				if(arr.get(j)==diff)
				{
					System.out.format("The numbers %d & %d give us a sum of %d",arr.get(i),arr.get(j),target);
					System.out.println("");
					break;
				}
			}
		}
	}

	private static ArrayList<Integer> getPrime(int x) {
		// TODO Auto-generated method stub
		int count=0;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1;i<=x;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2)
			{
				arr.add(i);
			}
		}
		return arr;
	}
	}