package removeallwhitespace;
import java.util.*;

public class whitespaceremoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		String answerString = removeWhitespace(s);
		System.out.println("The updated string is "+answerString);
		sc.close();
	}

	private static String removeWhitespace(String s) {
		// TODO Auto-generated method stub
		String newstr = s.replaceAll("\\s","");
		return newstr;
	}

}
