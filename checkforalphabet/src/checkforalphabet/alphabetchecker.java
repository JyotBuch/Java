//Java Program to Check Whether a Character is Alphabet or Not

package checkforalphabet;
import java.util.*;

public class alphabetchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		int ascii = (int)ch;
		if(ascii>=65 && ascii<=90)
			System.out.println("It is an Alphabet");
		else if(ascii>=97 && ascii<=122)
			System.out.println("It is an Alphabet");
		else
			System.out.println("It is not an Alphabet");
		sc.close();
				
	}

}
