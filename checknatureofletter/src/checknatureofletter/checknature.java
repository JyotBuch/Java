//Java Program to Check Whether an Alphabet is Vowel or Consonant

package checknatureofletter;
import java.util.*;

public class checknature {

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		getnature(ch);
		sc.close();
	}

	private static void getnature(char ch) {
		// TODO Auto-generated method stub
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println("It is a Vowel");
		else
			System.out.println("It is a Consonant");
	}
}
