package findduplicateinarray;
import java.util.*;

public class findduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many Elements do you want to enter?");
		int x=sc.nextInt();
		String arr1[] = new String[x];
		System.out.println("Enter your elements: ");
		for(int i=0;i<x;i++) 
		{
			arr1[i]=sc.nextLine();
		}
		duplicheck(arr1);
	}

	private static void duplicheck(String[] arr1) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		for(String s: arr1) {
			if(!set.add(s))
			{
				System.out.println("Duplicate Element is : "+s);
			}
		}
	}

}
