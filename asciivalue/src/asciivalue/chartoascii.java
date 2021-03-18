//Java Program to Find ASCII Value of a character

package asciivalue;
import java.util.*;

public class chartoascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		toascii(ch);
		sc.close();
	}

	private static void toascii(char ch) {
		// TODO Auto-generated method stub
		System.out.println("Ascii Value is : "+(int)ch);
	}

}
