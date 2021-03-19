//Java Program to Find the Frequency of Character in a String

package frequencyofcharacter;
import java.util.*;

public class characterfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = sc.next();
		System.out.println("Enter your character");
		char ch=sc.next().charAt(0);
		int count=countgetFrequency(word,ch);
		System.out.println("The Frequency of "+ch+" is "+count);
		sc.close();
	}

	private static int countgetFrequency(String word, char ch) {
		int count=0;
		// TODO Auto-generated method stub
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==ch)
				count++;
		}
		return count;
	}

}
