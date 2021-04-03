package checkParentheses;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Parenthesis");
		String s = sc.nextLine();
		boolean valid=checkParenthesis(s);
		if(valid)
			System.out.println("Valid Parenthesis");
		else
			System.out.println("Invalid Parenthesis");
				}

	public static boolean checkParenthesis(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stk= new Stack<>();
		if(s.isEmpty())
			return false;
		for(int i=0;i<s.length();i++)
		{
			int index=0;
			if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[')
				{
					stk.push(s.charAt(i));
					index++;
				}
			else if(s.charAt(i)==')' )
			{
				while(index!=0)
				{
					if(s.charAt(index)!='(')
						{
							stk.pop();
							index--;
						}
					else
						return false;
					stk.pop();
						
				}
			stk.pop();
			}
			else if(s.charAt(i)=='}') {
				while(index!=0)
				{
					if(s.charAt(index)!='{')
						{
							stk.pop();
							index--;
						}
					else
						return false;
					stk.pop();
						
				}
			stk.pop();
			}
			else if(s.charAt(i)==']') {
				while(index!=0)
				{
					if(s.charAt(index)!='[')
						{
							stk.pop();
							index--;
						}
					else
						return false;
						}
				stk.pop();	
				index--;
			
			}
		}
		if(stk.isEmpty())
			return true;
		else
			return false;
	}

}
