package revstringrecursive;
import java.util.*;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s= sc.nextLine();
		int length = s.length();
		getReverse(s,length-1);
	}

	private static void getReverse(String s, int length) {
		// TODO Auto-generated method stub
		int i= length;
		if(i>=0)
		{
			System.out.print(s.charAt(i--));
			getReverse(s,i);
		}
	}

}
