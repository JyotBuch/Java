package reversestringstack;
import java.util.*;

public class ReverseStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.nextLine();
		Stack<Character> stack = new Stack();
		for(int i=0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
		for(int i=0;i<s.length();i++) {
			System.out.print(stack.pop());
		}
	}

}
